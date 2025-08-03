package eu.icole.portainer.dtos.backup;

import java.util.List;

public class RestorePayload {

    private List<Integer> fileContent;
    private String fileName;
    private String password;

    public RestorePayload() {
    }

    public RestorePayload(List<Integer> fileContent, String fileName, String password) {
        this.fileContent = fileContent;
        this.fileName = fileName;
        this.password = password;
    }

    public List<Integer> getFileContent() {
        return fileContent;
    }

    public void setFileContent(List<Integer> fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}