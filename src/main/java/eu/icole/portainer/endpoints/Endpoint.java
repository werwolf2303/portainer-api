package eu.icole.portainer.endpoints;

import com.google.gson.Gson;
import eu.icole.portainer.exceptions.PortainerException;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.util.Map;

public interface Endpoint<RequestType, ResponseType> {
    String url();

    RequestBody body(RequestType data, Gson gson) throws Exception;

    ResponseType result(Gson gson, Response response) throws IOException, PortainerException;

    Map<String, String> headers();

    RequestTypes type();

    boolean needsAuth();
}
