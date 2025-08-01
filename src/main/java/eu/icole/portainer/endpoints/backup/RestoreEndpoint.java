package eu.icole.portainer.endpoints.backup;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import eu.icole.portainer.dtos.RestorePayload;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class RestoreEndpoint implements Endpoint<RestorePayload, JsonObject> {
    @Override
    public String url() {
        return "/restore";
    }

    @Override
    public RequestBody body(RestorePayload data, Gson gson) {
        return RequestBody.create(data.toString(gson), MediaType.parse("application/json"));
    }

    @Override
    public JsonObject result(Gson gson, Response response) throws IOException, PortainerException {
        switch (response.code()) {
            case 200:
                break;
            case 400:
                throw new PortainerException("Invalid request");
            case 500:
                throw new PortainerException("Internal server error");
            default:
                throw new PortainerException("Unexpected response code! " + response.code() + " : " + response.body().string());
        }

        return gson.fromJson(response.body().string(), JsonObject.class);
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
