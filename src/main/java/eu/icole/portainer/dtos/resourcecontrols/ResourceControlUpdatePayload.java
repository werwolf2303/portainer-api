package eu.icole.portainer.dtos.resourcecontrols;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResourceControlUpdatePayload {

    private Boolean administratorsOnly;
    @SerializedName("public")
    private Boolean public_;
    private List<Integer> teams;
    private List<Integer> users;

    public ResourceControlUpdatePayload() {
    }

    public ResourceControlUpdatePayload(Boolean administratorsOnly, Boolean public_, List<Integer> teams, List<Integer> users) {
        this.administratorsOnly = administratorsOnly;
        this.public_ = public_;
        this.teams = teams;
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

    public List<Integer> getTeams() {
        return teams;
    }

    public void setTeams(List<Integer> teams) {
        this.teams = teams;
    }

    public List<Integer> getUsers() {
        return users;
    }

    public void setUsers(List<Integer> users) {
        this.users = users;
    }

}