package eu.icole.portainer.dtos.portainer;

import java.util.List;

public class EdgeGroup {

    private Boolean Dynamic;
    private List<Integer> Endpoints;
    private Integer Id;
    private String Name;
    private Boolean PartialMatch;
    private List<Integer> TagIds;

    public EdgeGroup() {
    }

    public EdgeGroup(Boolean Dynamic, List<Integer> Endpoints, Integer Id, String Name, Boolean PartialMatch, List<Integer> TagIds) {
        this.Dynamic = Dynamic;
        this.Endpoints = Endpoints;
        this.Id = Id;
        this.Name = Name;
        this.PartialMatch = PartialMatch;
        this.TagIds = TagIds;
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

}