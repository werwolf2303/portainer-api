package eu.icole.portainer.dockerjava;

import com.github.dockerjava.transport.DockerHttpClient;
import eu.icole.portainer.PortainerConnection;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PortainerDockerHttpClient implements DockerHttpClient {
    private final OkHttpClient httpClient;
    private final int endpointId;
    private final PortainerConnection connection;

    public PortainerDockerHttpClient(int endpointId, PortainerConnection connection) {
        this.endpointId = endpointId;
        this.connection = connection;
        this.httpClient = this.connection.getClient();
    }

    @Override
    public Response execute(Request request) {
        String proxyPath = "/endpoints/" + endpointId + "/docker" + request.path();
        String url = connection.getUrl() + proxyPath;

        RequestBody requestBody = request.bodyBytes() != null
                ? RequestBody.create(request.bodyBytes(), MediaType.parse(request.headers().get("Content-Type")))
                : null;

        okhttp3.Request.Builder requestBuilder = new okhttp3.Request.Builder()
                .url(url)
                .method(request.method(), requestBody)
                .header("Authorization", "Bearer " + connection.getJwt());

        for (String header : request.headers().keySet()) {
            requestBuilder.addHeader(header, request.headers().get(header));
        }

        try {
            okhttp3.Response response = httpClient.newCall(requestBuilder.build()).execute();

            if (response.code() == 401) {
                // No or expired jwt token

                request.headers().remove("Authorization");

                connection.getAuthorization().requestNewJwtToken();

                request.headers().put("Authorization", "Bearer " + connection.getJwt());

                return execute(request);
            }

            return new DockerHttpClient.Response() {

                @Override
                public int getStatusCode() {
                    return response.code();
                }

                @Override
                public Map<String, List<String>> getHeaders() {
                    return response.headers().toMultimap();
                }

                @Override
                public InputStream getBody() {
                    return response.body().byteStream();
                }

                @Override
                public void close() {
                    response.close();
                }
            };
        } catch (IOException | PortainerException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void close() throws IOException {
    }
}
