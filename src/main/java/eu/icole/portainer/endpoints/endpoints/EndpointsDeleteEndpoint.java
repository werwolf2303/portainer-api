package eu.icole.portainer.endpoints.endpoints;

import com.google.gson.Gson;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.InvalidCredentialsException;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class EndpointsDeleteEndpoint implements Endpoint<Object, Object> {
    @Override
    public String url() {
        return "/endpoints/%s";
    }

    @Override
    public RequestBody body(Object data, Gson gson) {
        return null;
    }

    @Override
    public Object result(Gson gson, Response response) throws IOException, PortainerException {
        switch (response.code()) {
            case 204:
                break;
            case 400:
                throw new PortainerException("Invalid request payload, such as missing required fields or fields not meeting validation criteria");
            case 403:
                throw new InvalidCredentialsException();
            case 404:
                throw new PortainerException("Unable to find the environment with the specified identifier inside the database");
            case 500:
                throw new PortainerException("Internal server error");
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
        return RequestTypes.DELETE;
    }

    @Override
    public boolean needsAuth() {
        return true;
    }
}
