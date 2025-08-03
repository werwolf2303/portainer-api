package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.Pair;
import eu.icole.portainer.dtos.portainer.TeamAccessPolicies;
import eu.icole.portainer.dtos.portainer.UserAccessPolicies;

import java.util.List;

public class EndpointGroup {

    private List<Integer> AuthorizedTeams;
    private List<Integer> AuthorizedUsers;
    private String Description;
    private Integer Id;
    private List<Pair> Labels;
    private String Name;
    private List<Integer> TagIds;
    private List<String> Tags;
    private TeamAccessPolicies TeamAccessPolicies;
    private UserAccessPolicies UserAccessPolicies;

    public EndpointGroup() {
    }

    public EndpointGroup(List<Integer> AuthorizedTeams, List<Integer> AuthorizedUsers, String Description, Integer Id, List<Pair> Labels, String Name, List<Integer> TagIds, List<String> Tags, TeamAccessPolicies TeamAccessPolicies, UserAccessPolicies UserAccessPolicies) {
        this.AuthorizedTeams = AuthorizedTeams;
        this.AuthorizedUsers = AuthorizedUsers;
        this.Description = Description;
        this.Id = Id;
        this.Labels = Labels;
        this.Name = Name;
        this.TagIds = TagIds;
        this.Tags = Tags;
        this.TeamAccessPolicies = TeamAccessPolicies;
        this.UserAccessPolicies = UserAccessPolicies;
    }

    public List<Integer> getAuthorizedTeams() {
        return AuthorizedTeams;
    }

    public void setAuthorizedTeams(List<Integer> AuthorizedTeams) {
        this.AuthorizedTeams = AuthorizedTeams;
    }

    public List<Integer> getAuthorizedUsers() {
        return AuthorizedUsers;
    }

    public void setAuthorizedUsers(List<Integer> AuthorizedUsers) {
        this.AuthorizedUsers = AuthorizedUsers;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public List<Pair> getLabels() {
        return Labels;
    }

    public void setLabels(List<Pair> Labels) {
        this.Labels = Labels;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public List<Integer> getTagIds() {
        return TagIds;
    }

    public void setTagIds(List<Integer> TagIds) {
        this.TagIds = TagIds;
    }

    public List<String> getTags() {
        return Tags;
    }

    public void setTags(List<String> Tags) {
        this.Tags = Tags;
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