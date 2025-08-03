package eu.icole.portainer.dtos.endpointedge;


public class StackStatusResponse {

    private Integer id;
    private Integer version;

    public StackStatusResponse() {
    }

    public StackStatusResponse(Integer id, Integer version) {
        this.id = id;
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}