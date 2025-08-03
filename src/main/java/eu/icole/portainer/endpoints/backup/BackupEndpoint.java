package eu.icole.portainer.endpoints.backup;

import com.google.gson.Gson;
import eu.icole.portainer.olddtos.BackupPayload;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

public class BackupEndpoint implements Endpoint<BackupPayload, InputStream> {
    @Override
    public String url() {
        return "/backup";
    }

    @Override
    public RequestBody body(BackupPayload data, Gson gson) {
        return RequestBody.create(data.toString(gson), MediaType.parse("application/json"));
    }

    @Override
    public InputStream result(Gson gson, Response response) throws IOException, PortainerException {
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

        return response.body().byteStream();
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
