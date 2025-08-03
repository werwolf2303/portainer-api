package eu.icole.portainer.dtos.endpoints;

import eu.icole.portainer.dtos.endpoints.EndpointDeleteRequest;

import java.util.List;

public class EndpointDeleteBatchPayload {

    private List<EndpointDeleteRequest> endpoints;

    public EndpointDeleteBatchPayload() {
    }

    public EndpointDeleteBatchPayload(List<EndpointDeleteRequest> endpoints) {
        this.endpoints = endpoints;
    }

    public List<EndpointDeleteRequest> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointDeleteRequest> endpoints) {
        this.endpoints = endpoints;
    }

}