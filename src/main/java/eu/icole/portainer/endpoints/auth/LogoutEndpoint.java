package eu.icole.portainer.endpoints.auth;

import com.google.gson.Gson;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class LogoutEndpoint implements Endpoint<String, String> {
    @Override
    public String url() {
        return "/auth/logout";
    }

    @Override
    public RequestBody body(String data, Gson gson) {
        return null;
    }

    @Override
    public String result(Gson gson, Response response) throws IOException, PortainerException {
        switch (response.code()) {
            case 500:
                throw new PortainerException("Internal server error");
            case 204:
                break;
            default:
                throw new PortainerException("Unexpected response code! " + response.code() + " : " + response.body().string());
        }

        return "";
    }

    @Override
    public Map<String, String> headers() {
        return Collections.emptyMap();
    }

    @Override
    public RequestTypes type() {
        return RequestTypes.POST;
    }

    @Override
    public boolean needsAuth() {
        return true;
    }
}
