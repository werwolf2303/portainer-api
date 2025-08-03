package eu.icole.portainer.endpoints.auth;

import com.google.gson.Gson;
import eu.icole.portainer.dtos.auth.AuthenticatePayload;
import eu.icole.portainer.dtos.auth.AuthenticateResponse;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.InvalidCredentialsException;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.*;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class AuthEndpoint implements Endpoint<AuthenticatePayload, AuthenticateResponse> {

    @Override
    public String url() {
        return "/auth";
    }

    @Override
    public RequestBody body(AuthenticatePayload data, Gson gson) {
        return RequestBody.create(gson.toJson(data), MediaType.parse("application/json"));
    }

    @Override
    public AuthenticateResponse result(Gson gson, Response response) throws PortainerException, IOException {
        switch (response.code()) {
            case 400:
                throw new PortainerException("Invalid request");
            case 422:
                throw new InvalidCredentialsException();
            case 500:
                throw new PortainerException("Internal server error");
            case 200:
                break;
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
        return RequestTypes.POST;
    }

    @Override
    public boolean needsAuth() {
        return false;
    }
}
