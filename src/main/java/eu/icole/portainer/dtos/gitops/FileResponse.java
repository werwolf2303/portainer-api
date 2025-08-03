package eu.icole.portainer.dtos.gitops;


public class FileResponse {

    private String fileContent;

    public FileResponse() {
    }

    public FileResponse(String fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

}