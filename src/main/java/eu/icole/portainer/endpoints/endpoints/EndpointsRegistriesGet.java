package eu.icole.portainer.endpoints.endpoints;

import com.google.gson.Gson;
import eu.icole.portainer.dtos.portainer.Registry;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class EndpointsRegistriesGet implements Endpoint<Object, Registry> {
    @Override
    public String url() {
        return "/endpoints/%s/registries?namespace=%s";
    }

    @Override
    public RequestBody body(Object data, Gson gson) throws Exception {
        return null;
    }

    @Override
    public Registry result(Gson gson, Response response) throws IOException, PortainerException {
        switch (response.code()) {
            case 200:
                break;
            case 500:
                throw new PortainerException("Internal Server Error");
            default:
                throw new PortainerException("Unexpected response code! " + response.code() + " : " + response.body().string());
        }

        return gson.fromJson(response.body().string(), Registry.class);
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
