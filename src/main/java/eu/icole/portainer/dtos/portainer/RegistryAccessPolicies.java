package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.TeamAccessPolicies;
import eu.icole.portainer.dtos.portainer.UserAccessPolicies;

import java.util.List;

public class RegistryAccessPolicies {

    private List<String> Namespaces;
    private TeamAccessPolicies TeamAccessPolicies;
    private UserAccessPolicies UserAccessPolicies;

    public RegistryAccessPolicies() {
    }

    public RegistryAccessPolicies(List<String> Namespaces, TeamAccessPolicies TeamAccessPolicies, UserAccessPolicies UserAccessPolicies) {
        this.Namespaces = Namespaces;
        this.TeamAccessPolicies = TeamAccessPolicies;
        this.UserAccessPolicies = UserAccessPolicies;
    }

    public List<String> getNamespaces() {
        return Namespaces;
    }

    public void setNamespaces(List<String> Namespaces) {
        this.Namespaces = Namespaces;
    }

    public TeamAccessPolicies getTeamAccessPolicies() {
        return TeamAccessPolicies;
    }

    public void setTeamAccessPolicies(TeamAccessPolicies TeamAccessPolicies) {
        this.TeamAccessPolicies = TeamAccessPolicies;
    }

    public UserAccessPolicies getUserAccessPolicies() {
        return UserAccessPolicies;
    }

    public void setUserAccessPolicies(UserAccessPolicies UserAccessPolicies) {
        this.UserAccessPolicies = UserAccessPolicies;
    }

}