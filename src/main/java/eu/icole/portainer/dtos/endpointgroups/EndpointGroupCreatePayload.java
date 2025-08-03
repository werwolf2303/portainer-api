package eu.icole.portainer.dtos.endpointgroups;

import java.util.List;

public class EndpointGroupCreatePayload {

    private List<Integer> associatedEndpoints;
    private String description;
    private String name;
    private List<Integer> tagIDs;

    public EndpointGroupCreatePayload() {
    }

    public EndpointGroupCreatePayload(List<Integer> associatedEndpoints, String description, String name, List<Integer> tagIDs) {
        this.associatedEndpoints = associatedEndpoints;
        this.description = description;
        this.name = name;
        this.tagIDs = tagIDs;
    }

    public List<Integer> getAssociatedEndpoints() {
        return associatedEndpoints;
    }

    public void setAssociatedEndpoints(List<Integer> associatedEndpoints) {
        this.associatedEndpoints = associatedEndpoints;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getTagIDs() {
        return tagIDs;
    }

    public void setTagIDs(List<Integer> tagIDs) {
        this.tagIDs = tagIDs;
    }

}