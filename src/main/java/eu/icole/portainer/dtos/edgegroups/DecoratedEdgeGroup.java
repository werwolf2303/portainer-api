package eu.icole.portainer.dtos.edgegroups;

import java.util.List;

public class DecoratedEdgeGroup {

    private Boolean Dynamic;
    private List<Integer> Endpoints;
    private Boolean HasEdgeJob;
    private Boolean HasEdgeStack;
    private Integer Id;
    private String Name;
    private Boolean PartialMatch;
    private List<Integer> TagIds;
    private List<Integer> TrustedEndpoints;
    private List<Integer> endpointTypes;

    public DecoratedEdgeGroup() {
    }

    public DecoratedEdgeGroup(Boolean Dynamic, List<Integer> Endpoints, Boolean HasEdgeJob, Boolean HasEdgeStack, Integer Id, String Name, Boolean PartialMatch, List<Integer> TagIds, List<Integer> TrustedEndpoints, List<Integer> endpointTypes) {
        this.Dynamic = Dynamic;
        this.Endpoints = Endpoints;
        this.HasEdgeJob = HasEdgeJob;
        this.HasEdgeStack = HasEdgeStack;
        this.Id = Id;
        this.Name = Name;
        this.PartialMatch = PartialMatch;
        this.TagIds = TagIds;
        this.TrustedEndpoints = TrustedEndpoints;
        this.endpointTypes = endpointTypes;
    }

    public Boolean getDynamic() {
        return Dynamic;
    }

    public void setDynamic(Boolean Dynamic) {
        this.Dynamic = Dynamic;
    }

    public List<Integer> getEndpoints() {
        return Endpoints;
    }

    public void setEndpoints(List<Integer> Endpoints) {
        this.Endpoints = Endpoints;
    }

    public Boolean getHasEdgeJob() {
        return HasEdgeJob;
    }

    public void setHasEdgeJob(Boolean HasEdgeJob) {
        this.HasEdgeJob = HasEdgeJob;
    }

    public Boolean getHasEdgeStack() {
        return HasEdgeStack;
    }

    public void setHasEdgeStack(Boolean HasEdgeStack) {
        this.HasEdgeStack = HasEdgeStack;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Boolean getPartialMatch() {
        return PartialMatch;
    }

    public void setPartialMatch(Boolean PartialMatch) {
        this.PartialMatch = PartialMatch;
    }

    public List<Integer> getTagIds() {
        return TagIds;
    }

    public void setTagIds(List<Integer> TagIds) {
        this.TagIds = TagIds;
    }

    public List<Integer> getTrustedEndpoints() {
        return TrustedEndpoints;
    }

    public void setTrustedEndpoints(List<Integer> TrustedEndpoints) {
        this.TrustedEndpoints = TrustedEndpoints;
    }

    public List<Integer> getEndpointTypes() {
        return endpointTypes;
    }

    public void setEndpointTypes(List<Integer> endpointTypes) {
        this.endpointTypes = endpointTypes;
    }

}