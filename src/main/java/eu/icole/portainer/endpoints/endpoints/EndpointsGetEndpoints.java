package eu.icole.portainer.endpoints.endpoints;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class EndpointsGetEndpoints implements Endpoint<Object, List<eu.icole.portainer.olddtos.Endpoint>> {
    @Override
    public String url() {
        return "/endpoints?start=%d&limit=%d&order=%d&search=%s&groupIds=%s&status=%s&types=%s&tagIds=%s&tagsPartialMatch=%b&endpointIds=%s&provisioned=%b&agentVersions=%s&edgeAsync=%b&edgeDeviceUntrusted=%b&edgeCheckInPassedSeconds=%d&excludeSnapshots=%b&name=%s&edgeStackStatus=%s";
    }

    @Override
    public List<eu.icole.portainer.olddtos.Endpoint> result(Gson gson, Response response) throws IOException, PortainerException {
        switch (response.code()) {
            case 200:
                break;
            case 500:
                throw new PortainerException("Internal server error");
            default:
                throw new PortainerException("Unexpected response code! " + response.code() + " : " + response.body().string());
        }

        return gson.fromJson(response.body().string(), new TypeToken<List<eu.icole.portainer.olddtos.Endpoint>>() {
        }.getType());
    }

    @Override
    public Map<String, String> headers() {
        return Collections.emptyMap();
    }

    @Override
    public RequestTypes type() {
        return RequestTypes.GET;
    }

    @Override
    public boolean needsAuth() {
        return true;
    }

    @Override
    public RequestBody body(Object data, Gson gson) {
        return null;
    }
}
