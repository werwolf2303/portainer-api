package eu.icole.portainer.dtos.kubernetes;


public class Pod {

    private String Status;

    public Pod() {
    }

    public Pod(String Status) {
        this.Status = Status;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

}