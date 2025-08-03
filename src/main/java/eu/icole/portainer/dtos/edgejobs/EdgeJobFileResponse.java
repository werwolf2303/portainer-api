package eu.icole.portainer.dtos.edgejobs;


public class EdgeJobFileResponse {

    private String FileContent;

    public EdgeJobFileResponse() {
    }

    public EdgeJobFileResponse(String FileContent) {
        this.FileContent = FileContent;
    }

    public String getFileContent() {
        return FileContent;
    }

    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

}