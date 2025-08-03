package eu.icole.portainer.dtos.edgestacks;


public class UpdateStatusPayload {

    private Integer endpointID;
    private String error;
    private Integer status;
    private Integer time;
    private Integer version;

    public UpdateStatusPayload() {
    }

    public UpdateStatusPayload(Integer endpointID, String error, Integer status, Integer time, Integer version) {
        this.endpointID = endpointID;
        this.error = error;
        this.status = status;
        this.time = time;
        this.version = version;
    }

    public Integer getEndpointID() {
        return endpointID;
    }

    public void setEndpointID(Integer endpointID) {
        this.endpointID = endpointID;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}