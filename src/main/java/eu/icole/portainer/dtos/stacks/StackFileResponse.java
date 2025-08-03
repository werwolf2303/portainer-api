package eu.icole.portainer.dtos.stacks;


public class StackFileResponse {

    private String StackFileContent;

    public StackFileResponse() {
    }

    public StackFileResponse(String StackFileContent) {
        this.StackFileContent = StackFileContent;
    }

    public String getStackFileContent() {
        return StackFileContent;
    }

    public void setStackFileContent(String StackFileContent) {
        this.StackFileContent = StackFileContent;
    }

}