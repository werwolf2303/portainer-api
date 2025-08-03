package eu.icole.portainer.dtos.endpoints;

import eu.icole.portainer.dtos.portainer.TeamAccessPolicies;
import eu.icole.portainer.dtos.portainer.UserAccessPolicies;

import java.util.List;

public class RegistryAccessPayload {

    private List<String> namespaces;
    private TeamAccessPolicies teamAccessPolicies;
    private UserAccessPolicies userAccessPolicies;

    public RegistryAccessPayload() {
    }

    public RegistryAccessPayload(List<String> namespaces, TeamAccessPolicies teamAccessPolicies, UserAccessPolicies userAccessPolicies) {
        this.namespaces = namespaces;
        this.teamAccessPolicies = teamAccessPolicies;
        this.userAccessPolicies = userAccessPolicies;
    }

    public List<String> getNamespaces() {
        return namespaces;
    }

    public void setNamespaces(List<String> namespaces) {
        this.namespaces = namespaces;
    }

    public TeamAccessPolicies getTeamAccessPolicies() {
        return teamAccessPolicies;
    }

    public void setTeamAccessPolicies(TeamAccessPolicies teamAccessPolicies) {
        this.teamAccessPolicies = teamAccessPolicies;
    }

    public UserAccessPolicies getUserAccessPolicies() {
        return userAccessPolicies;
    }

    public void setUserAccessPolicies(UserAccessPolicies userAccessPolicies) {
        this.userAccessPolicies = userAccessPolicies;
    }

}