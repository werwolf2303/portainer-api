package eu.icole.portainer.endpoints.endpoints;

import com.google.gson.Gson;
import eu.icole.portainer.Utils;
import eu.icole.portainer.dtos.EndpointsPostPayload;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class EndpointsPostEndpoint implements Endpoint<EndpointsPostPayload, eu.icole.portainer.dtos.portainer.Endpoint> {
    @Override
    public String url() {
        return "/endpoints";
    }

    @Override
    public RequestBody body(EndpointsPostPayload data, Gson gson) {
        try {
            return Utils.deserializeToFormData(data);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException("Failed to deserialize class into form data", e);
        }
    }

    @Override
    public eu.icole.portainer.dtos.portainer.Endpoint result(Gson gson, Response response) throws IOException, PortainerException {
        switch (response.code()) {
            case 200:
                break;
            case 400:
                throw new PortainerException("Invalid request");
            case 409:
                throw new PortainerException("Name is not unique");
            case 500:
                throw new PortainerException("Internal server error");
            default:
                throw new PortainerException("Unexpected response code! " + response.code() + " : " + response.body().string());
        }

        return gson.fromJson(response.body().string(), eu.icole.portainer.dtos.portainer.Endpoint.class);
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
}
