package eu.icole.portainer;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DefaultDockerClientConfig;
import com.github.dockerjava.core.DockerClientConfig;
import com.github.dockerjava.core.DockerClientImpl;
import com.google.gson.Gson;
import eu.icole.portainer.dockerjava.PortainerDockerHttpClient;
import eu.icole.portainer.dtos.auth.AuthenticatePayload;
import eu.icole.portainer.dtos.auth.AuthenticateResponse;
import eu.icole.portainer.olddtos.EndpointsGetPayload;
import eu.icole.portainer.olddtos.OAuthPayload;
import eu.icole.portainer.endpoints.auth.AuthEndpoint;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.auth.LogoutEndpoint;
import eu.icole.portainer.endpoints.auth.OAuthEndpoint;
import eu.icole.portainer.endpoints.endpoints.EndpointsGetEndpoints;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings("unchecked")
public class PortainerConnection {

    private final String url;
    private final String user;
    private final String password;
    private final String token;

    private final Gson gson;
    private final OkHttpClient client;

    private AuthenticateResponse jwtToken;
    private DockerClient dockerClient;
    private DockerClientConfig dockerClientConfig;

    private PortainerConnection(OkHttpClient client, String url, String token, String user, String password, DockerClient dockerClient, DockerClientConfig dockerClientConfig) {
        this.url = url + "/api";
        this.user = user;
        this.password = password;
        this.token = token;
        this.client = client;
        this.dockerClient = dockerClient;
        this.dockerClientConfig = dockerClientConfig;

        this.gson = new Gson();
    }

    public void connect() throws PortainerException, IOException {
        jwtToken = getAuthorization().authenticate(user, password);
    }

    public OkHttpClient getClient() {
        return client;
    }

    public String getJwt() {
        return jwtToken.getJwt();
    }

    public String getUrl() {
        return url;
    }

    public Authorization getAuthorization() {
        return new Authorization();
    }

    public DockerClient getDocker(int endpointId) {
        if (dockerClient != null) return dockerClient;
        DockerClientConfig clientConfig = dockerClientConfig != null ? dockerClientConfig
                : new DefaultDockerClientConfig.Builder().build();
        return DockerClientImpl.getInstance(clientConfig, new PortainerDockerHttpClient(endpointId, this));
    }

    public class Authorization {
        public AuthenticateResponse authenticate(String username, String password) throws IOException, PortainerException {
            AuthEndpoint endpoint = new AuthEndpoint();
            return executeRequest(endpoint, endpoint.body(new AuthenticatePayload(password, username), gson), null);
        }

        // FIXME: https://github.com/portainer/portainer/issues/12689
        public void logout() throws IOException, PortainerException {
            executeRequest(new LogoutEndpoint(), null, null);
            jwtToken = null;
        }

        public AuthenticateResponse authenticateViaOAuth(String code) throws PortainerException, IOException {
            OAuthEndpoint endpoint = new OAuthEndpoint();
            return executeRequest(endpoint, endpoint.body(new OAuthPayload(code), gson), null);
        }

        public void requestNewJwtToken() throws IOException, PortainerException {
            if (jwtToken == null && (user != null && !user.isEmpty()) && (password != null && !password.isEmpty()))
                jwtToken = getAuthorization().authenticate(user, password);
            else if (jwtToken == null)
                throw new PortainerException("No auth token provider available!");
        }
    }

    public Endpoints getEndpoints() {
        return new Endpoints();
    }

    public class Endpoints {
        public List<eu.icole.portainer.olddtos.Endpoint> getEndpoints(EndpointsGetPayload payload) throws PortainerException, IOException {
            EndpointsGetEndpoints endpoint = new EndpointsGetEndpoints();
            String url = Utils.formatUrl(
                    endpoint.url(),
                    payload.getStart(),
                    payload.getLimit(),
                    payload.getOrder(),
                    payload.getSearch(),
                    payload.getGroupIds().stream().map(String::valueOf).collect(Collectors.joining(",")),
                    payload.getStatus().stream().map(String::valueOf).collect(Collectors.joining(",")),
                    payload.getTypes().stream().map(String::valueOf).collect(Collectors.joining(",")),
                    payload.getTagIds().stream().map(String::valueOf).collect(Collectors.joining(",")),
                    payload.isTagsPartialMatch(),
                    payload.getEndpointIds().stream().map(String::valueOf).collect(Collectors.joining(",")),
                    payload.isProvisioned(),
                    payload.getAgentVersions().stream().map(String::valueOf).collect(Collectors.joining(",")),
                    payload.isEdgeAsync(),
                    payload.isEdgeDeviceUntrusted(),
                    payload.getEdgeCheckInPassedSeconds(),
                    payload.isExcludeSnapshots(),
                    payload.getName(),
                    payload.getEdgeStackStatus()
            );

            return executeRequest(endpoint, null, url);
        }
    }

    /**
     * This is here because of Authorization.authenticateViaOAuth
     */
    public void setAuthenticateResponse(AuthenticateResponse authenticateResponse) {
        this.jwtToken = authenticateResponse;
    }

    private <ResponseType> ResponseType executeRequest(Endpoint<?, ?> endpoint, RequestBody requestBody, String url) throws IOException, PortainerException {
        Request.Builder requestBuilder = new Request.Builder();
        Request request = null;

        for (Map.Entry<String, String> header : endpoint.headers().entrySet()) {
            requestBuilder.addHeader(header.getKey(), header.getValue());
        }

        if (url == null) url = this.url + endpoint.url();
        else url = this.url + url;

        if (endpoint.needsAuth()) {
            if (jwtToken == null && (user != null && !user.isEmpty()) && (password != null && !password.isEmpty()))
                jwtToken = getAuthorization().authenticate(user, password);
            else if (jwtToken == null)
                throw new PortainerException("No auth token provider available!");

            if (token != null && !token.isEmpty())
                requestBuilder.header("Authorization", "Bearer " + token);
            else requestBuilder.header("Authorization", "Bearer " + jwtToken.getJwt());
        }

        if (requestBody == null)
            requestBody = RequestBody.create(new byte[]{});

        switch (endpoint.type()) {
            case GET:
                request = requestBuilder.url(url).get().build();
                break;
            case POST:
                request = requestBuilder.url(url).post(requestBody).build();
                break;
            case PUT:
                request = requestBuilder.url(url).put(requestBody).build();
                break;
            case DELETE:
                request = requestBuilder.url(url).delete(requestBody).build();
        }

        Response response = client.newCall(request).execute();

        if (response.code() == 401) {
            // Unauthorized

            if (token != null && !token.isEmpty())
                throw new PortainerException("Invalid or expired token");
            else {
                jwtToken = getAuthorization().authenticate(user, password);
                return executeRequest(endpoint, requestBody, url);
            }
        }

        return (ResponseType) endpoint.result(gson, response);
    }

    public static class Builder {
        private String token;
        private String user;
        private String password;
        private String host;
        private int port = 9443;
        private boolean useSsl = false;
        private boolean useUsernamePassword;
        private OkHttpClient client;
        private DockerClient dockerClient;
        private DockerClientConfig dockerClientConfig;

        public Builder setToken(String token) {
            useUsernamePassword = false;
            this.token = token;
            return this;
        }

        public Builder setUser(String user) {
            useUsernamePassword = true;
            this.user = user;
            return this;
        }

        public Builder setPassword(String password) {
            useUsernamePassword = true;
            this.password = password;
            return this;
        }

        public Builder setHost(String host) {
            this.host = host;
            return this;
        }

        public Builder setPort(int port) {
            this.port = port;
            return this;
        }

        public Builder setUseSsl(boolean useSsl) {
            this.useSsl = useSsl;
            return this;
        }

        public Builder setOkHttpClient(OkHttpClient client) {
            this.client = client;
            return this;
        }

        public Builder setAddress(String address) throws MalformedURLException {
            URL url = new URL(address);
            this.host = url.getHost();
            this.port = url.getPort();
            this.useSsl = url.getProtocol().equals("https");
            return this;
        }

        public Builder setDockerClient(DockerClient dockerClient) {
            this.dockerClient = dockerClient;
            return this;
        }

        public Builder setDockerClientConfig(DockerClientConfig dockerClientConfig) {
            this.dockerClientConfig = dockerClientConfig;
            return this;
        }

        public PortainerConnection build() {
            if (useUsernamePassword && (user == null || user.isEmpty()) || (password == null || password.isEmpty()))
                throw new IllegalArgumentException("You must specify both user and password");

            if (!useUsernamePassword && (token == null || token.isEmpty()))
                throw new IllegalArgumentException("Token has no value");

            StringBuilder url = new StringBuilder();
            url.append(useSsl ? "https://" : "http://");
            url.append(host);
            url.append(':');
            url.append(port);

            return new PortainerConnection(client == null ? new OkHttpClient() : client, url.toString(), token, user, password, dockerClient, dockerClientConfig);
        }
    }
}
