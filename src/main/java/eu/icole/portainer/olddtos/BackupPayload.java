package eu.icole.portainer.olddtos;

import com.google.gson.Gson;

public class BackupPayload {
    private final String password;

    public BackupPayload(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String toString(Gson gson) {
        return gson.toJson(this);
    }
}
