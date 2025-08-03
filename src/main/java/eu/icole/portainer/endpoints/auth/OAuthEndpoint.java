package eu.icole.portainer.endpoints.auth;

import com.google.gson.Gson;
import eu.icole.portainer.olddtos.AuthenticateResponse;
import eu.icole.portainer.olddtos.OAuthPayload;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.InvalidCredentialsException;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class OAuthEndpoint implements Endpoint<OAuthPayload, AuthenticateResponse> {
    @Override
    public String url() {
        return "/auth/oauth/validate";
    }

    @Override
    public RequestBody body(OAuthPayload data, Gson gson) {
        return null;
    }

    @Override
    public AuthenticateResponse result(Gson gson, Response response) throws IOException, PortainerException {
        switch (response.code()) {
            case 200:
                break;
            case 400:
                throw new PortainerException("Invalid request");
            case 422:
                throw new InvalidCredentialsException();
            case 500:
                throw new PortainerException("Internal server error");
            default:
                throw new PortainerException("Unexpected response code! " + response.code() + " : " + response.body().string());
        }

        return gson.fromJson(response.body().string(), AuthenticateResponse.class);
    }

    @Override
    public Map<String, String> headers() {
        return Collections.emptyMap();
    }

    @Override
    public RequestTypes type() {
        return null;
    }

    @Override
    public boolean needsAuth() {
        return false;
    }
}
