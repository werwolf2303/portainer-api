package eu.icole.portainer.endpoints.endpoints;

import com.google.gson.Gson;
import eu.icole.portainer.dtos.endpoints.EndpointUpdateRelationsPayload;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class EndpointsRelations implements Endpoint<EndpointUpdateRelationsPayload, Object> {
    @Override
    public String url() {
        return "/endpoint/relations";
    }

    @Override
    public RequestBody body(EndpointUpdateRelationsPayload data, Gson gson) throws Exception {
        return RequestBody.create(gson.toJson(data), MediaType.parse("application/json"));
    }

    @Override
    public Object result(Gson gson, Response response) throws IOException, PortainerException {
        switch (response.code()) {
            case 204:
                break;
            case 400:
                throw new PortainerException("Invalid request");
            case 404:
                throw new PortainerException("Not found");
            case 500:
                throw new PortainerException("Internal Server Error");
            default:
                throw new PortainerException("Unexpected response code! " + response.code() + " : " + response.body().string());
        }

        return null;
    }

    @Override
    public Map<String, String> headers() {
        return Collections.emptyMap();
    }

    @Override
    public RequestTypes type() {
        return RequestTypes.PUT;
    }

    @Override
    public boolean needsAuth() {
        return true;
    }
}
