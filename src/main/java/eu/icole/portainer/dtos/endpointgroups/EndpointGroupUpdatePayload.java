package eu.icole.portainer.dtos.endpointgroups;

import eu.icole.portainer.dtos.portainer.TeamAccessPolicies;
import eu.icole.portainer.dtos.portainer.UserAccessPolicies;

import java.util.List;

public class EndpointGroupUpdatePayload {

    private String description;
    private String name;
    private List<Integer> tagIDs;
    private TeamAccessPolicies teamAccessPolicies;
    private UserAccessPolicies userAccessPolicies;

    public EndpointGroupUpdatePayload() {
    }

    public EndpointGroupUpdatePayload(String description, String name, List<Integer> tagIDs, TeamAccessPolicies teamAccessPolicies, UserAccessPolicies userAccessPolicies) {
        this.description = description;
        this.name = name;
        this.tagIDs = tagIDs;
        this.teamAccessPolicies = teamAccessPolicies;
        this.userAccessPolicies = userAccessPolicies;
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