package eu.icole.portainer.dtos.portainer;

import java.util.Map;

public class Tag {

    private Map<String, Object> EndpointGroups;
    private Map<String, Object> Endpoints;
    private String Name;
    private Integer id;

    public Tag() {
    }

    public Tag(Map<String, Object> EndpointGroups, Map<String, Object> Endpoints, String Name, Integer id) {
        this.EndpointGroups = EndpointGroups;
        this.Endpoints = Endpoints;
        this.Name = Name;
        this.id = id;
    }

    public Map<String, Object> getEndpointGroups() {
        return EndpointGroups;
    }

    public void setEndpointGroups(Map<String, Object> EndpointGroups) {
        this.EndpointGroups = EndpointGroups;
    }

    public Map<String, Object> getEndpoints() {
        return Endpoints;
    }

    public void setEndpoints(Map<String, Object> Endpoints) {
        this.Endpoints = Endpoints;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}