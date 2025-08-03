package eu.icole.portainer.dtos.endpoints;


public class EndpointDeleteRequest {

    private Boolean deleteCluster;
    private Integer id;

    public EndpointDeleteRequest() {
    }

    public EndpointDeleteRequest(Boolean deleteCluster, Integer id) {
        this.deleteCluster = deleteCluster;
        this.id = id;
    }

    public Boolean getDeleteCluster() {
        return deleteCluster;
    }

    public void setDeleteCluster(Boolean deleteCluster) {
        this.deleteCluster = deleteCluster;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}