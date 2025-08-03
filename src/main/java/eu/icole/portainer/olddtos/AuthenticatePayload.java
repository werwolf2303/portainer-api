package eu.icole.portainer.olddtos;


import com.google.gson.Gson;

public class AuthenticatePayload {
    private final String username;
    private final String password;

    public AuthenticatePayload(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String toString(Gson gson) {
        return gson.toJson(this);
    }
}
