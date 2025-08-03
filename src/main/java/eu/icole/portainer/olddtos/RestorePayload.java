package eu.icole.portainer.olddtos;

import com.google.gson.Gson;

import java.util.List;

public class RestorePayload {
    private final List<Integer> fileContent;
    private final String fileName;
    private final String password;

    public RestorePayload(List<Integer> fileContent, String fileName, String password) {
        this.fileContent = fileContent;
        this.fileName = fileName;
        this.password = password;
    }

    public List<Integer> getFileContent() {
        return fileContent;
    }

    public String getFileName() {
        return fileName;
    }

    public String getPassword() {
        return password;
    }

    public String toString(Gson gson) {
        return gson.toJson(this);
    }
}
