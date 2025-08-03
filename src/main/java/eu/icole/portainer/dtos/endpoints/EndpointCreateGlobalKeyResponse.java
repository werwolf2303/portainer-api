package eu.icole.portainer.dtos.endpoints;


public class EndpointCreateGlobalKeyResponse {

    private Integer endpointID;

    public EndpointCreateGlobalKeyResponse() {
    }

    public EndpointCreateGlobalKeyResponse(Integer endpointID) {
        this.endpointID = endpointID;
    }

    public Integer getEndpointID() {
        return endpointID;
    }

    public void setEndpointID(Integer endpointID) {
        this.endpointID = endpointID;
    }

}