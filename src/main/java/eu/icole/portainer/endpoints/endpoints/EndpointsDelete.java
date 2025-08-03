package eu.icole.portainer.endpoints.endpoints;

import com.google.gson.Gson;
import eu.icole.portainer.dtos.endpoints.EndpointDeleteBatchPartialResponse;
import eu.icole.portainer.dtos.endpoints.EndpointDeleteBatchPayload;
import eu.icole.portainer.endpoints.Endpoint;
import eu.icole.portainer.endpoints.RequestTypes;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class EndpointsDelete implements Endpoint<EndpointDeleteBatchPayload, EndpointDeleteBatchPartialResponse> {
    @Override
    public String url() {
        return "/endpoints/delete";
    }

    @Override
    public RequestBody body(EndpointDeleteBatchPayload data, Gson gson) throws Exception {
        return RequestBody.create(gson.toJson(data), MediaType.parse("application/json"));
    }

    @Override
    public EndpointDeleteBatchPartialResponse result(Gson gson, Response response) throws IOException, PortainerException {
        switch (response.code()) {
            case 204:
            case 207:
                // ToDo: Respond with custom success for 207 due to "Partial success"
                break;
            case 400:
                throw new PortainerException("Invalid request");
            case 404:
                throw new PortainerException("Environment(Endpoint) not found");
            case 500:
                throw new PortainerException("Internal Server Error");
            default:
                throw new PortainerException("Unexpected response code! " + response.code() + " : " + response.body().string());
        }

        return gson.fromJson(response.body().string(), EndpointDeleteBatchPartialResponse.class);
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
