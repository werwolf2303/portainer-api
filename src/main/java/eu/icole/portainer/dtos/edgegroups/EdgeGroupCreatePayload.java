package eu.icole.portainer.dtos.edgegroups;

import java.util.List;

public class EdgeGroupCreatePayload {

    private Boolean dynamic;
    private List<Integer> endpoints;
    private String name;
    private Boolean partialMatch;
    private List<Integer> tagIDs;

    public EdgeGroupCreatePayload() {
    }

    public EdgeGroupCreatePayload(Boolean dynamic, List<Integer> endpoints, String name, Boolean partialMatch, List<Integer> tagIDs) {
        this.dynamic = dynamic;
        this.endpoints = endpoints;
        this.name = name;
        this.partialMatch = partialMatch;
        this.tagIDs = tagIDs;
    }

    public Boolean getDynamic() {
        return dynamic;
    }

    public void setDynamic(Boolean dynamic) {
        this.dynamic = dynamic;
    }

    public List<Integer> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<Integer> endpoints) {
        this.endpoints = endpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPartialMatch() {
        return partialMatch;
    }

    public void setPartialMatch(Boolean partialMatch) {
        this.partialMatch = partialMatch;
    }

    public List<Integer> getTagIDs() {
        return tagIDs;
    }

    public void setTagIDs(List<Integer> tagIDs) {
        this.tagIDs = tagIDs;
    }

}