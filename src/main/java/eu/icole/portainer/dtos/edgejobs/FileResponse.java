package eu.icole.portainer.dtos.edgejobs;


public class FileResponse {

    private String FileContent;

    public FileResponse() {
    }

    public FileResponse(String FileContent) {
        this.FileContent = FileContent;
    }

    public String getFileContent() {
        return FileContent;
    }

    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

}