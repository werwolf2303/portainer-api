package eu.icole.portainer.dtos.resourcecontrols;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResourceControlCreatePayload {

    private Boolean administratorsOnly;
    @SerializedName("public")
    private Boolean public_;
    private String resourceID;
    private List<String> subResourceIDs;
    private List<Integer> teams;
    private Integer type;
    private List<Integer> users;

    public ResourceControlCreatePayload() {
    }

    public ResourceControlCreatePayload(Boolean administratorsOnly, Boolean public_, String resourceID, List<String> subResourceIDs, List<Integer> teams, Integer type, List<Integer> users) {
        this.administratorsOnly = administratorsOnly;
        this.public_ = public_;
        this.resourceID = resourceID;
        this.subResourceIDs = subResourceIDs;
        this.teams = teams;
        this.type = type;
        this.users = users;
    }

    public Boolean getAdministratorsOnly() {
        return administratorsOnly;
    }

    public void setAdministratorsOnly(Boolean administratorsOnly) {
        this.administratorsOnly = administratorsOnly;
    }

    public Boolean getPublic_() {
        return public_;
    }

    public void setPublic_(Boolean public_) {
        this.public_ = public_;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public List<String> getSubResourceIDs() {
        return subResourceIDs;
    }

    public void setSubResourceIDs(List<String> subResourceIDs) {
        this.subResourceIDs = subResourceIDs;
    }

    public List<Integer> getTeams() {
        return teams;
    }

    public void setTeams(List<Integer> teams) {
        this.teams = teams;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Integer> getUsers() {
        return users;
    }

    public void setUsers(List<Integer> users) {
        this.users = users;
    }

}