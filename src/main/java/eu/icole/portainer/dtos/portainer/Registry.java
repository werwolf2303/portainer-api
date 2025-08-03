package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.*;

import java.util.List;

public class Registry {

    private String AccessToken;
    private Integer AccessTokenExpiry;
    private Boolean Authentication;
    private List<Integer> AuthorizedTeams;
    private List<Integer> AuthorizedUsers;
    private String BaseURL;
    private EcrData Ecr;
    private GitlabRegistryData Gitlab;
    private Integer Id;
    private RegistryManagementConfiguration ManagementConfiguration;
    private String Name;
    private String Password;
    private QuayRegistryData Quay;
    private RegistryAccesses RegistryAccesses;
    private TeamAccessPolicies TeamAccessPolicies;
    private Integer Type;
    private String URL;
    private UserAccessPolicies UserAccessPolicies;
    private String Username;

    public Registry() {
    }

    public Registry(String AccessToken, Integer AccessTokenExpiry, Boolean Authentication, List<Integer> AuthorizedTeams, List<Integer> AuthorizedUsers, String BaseURL, EcrData Ecr, GitlabRegistryData Gitlab, Integer Id, RegistryManagementConfiguration ManagementConfiguration, String Name, String Password, QuayRegistryData Quay, RegistryAccesses RegistryAccesses, TeamAccessPolicies TeamAccessPolicies, Integer Type, String URL, UserAccessPolicies UserAccessPolicies, String Username) {
        this.AccessToken = AccessToken;
        this.AccessTokenExpiry = AccessTokenExpiry;
        this.Authentication = Authentication;
        this.AuthorizedTeams = AuthorizedTeams;
        this.AuthorizedUsers = AuthorizedUsers;
        this.BaseURL = BaseURL;
        this.Ecr = Ecr;
        this.Gitlab = Gitlab;
        this.Id = Id;
        this.ManagementConfiguration = ManagementConfiguration;
        this.Name = Name;
        this.Password = Password;
        this.Quay = Quay;
        this.RegistryAccesses = RegistryAccesses;
        this.TeamAccessPolicies = TeamAccessPolicies;
        this.Type = Type;
        this.URL = URL;
        this.UserAccessPolicies = UserAccessPolicies;
        this.Username = Username;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public Integer getAccessTokenExpiry() {
        return AccessTokenExpiry;
    }

    public void setAccessTokenExpiry(Integer AccessTokenExpiry) {
        this.AccessTokenExpiry = AccessTokenExpiry;
    }

    public Boolean getAuthentication() {
        return Authentication;
    }

    public void setAuthentication(Boolean Authentication) {
        this.Authentication = Authentication;
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

    public String getBaseURL() {
        return BaseURL;
    }

    public void setBaseURL(String BaseURL) {
        this.BaseURL = BaseURL;
    }

    public EcrData getEcr() {
        return Ecr;
    }

    public void setEcr(EcrData Ecr) {
        this.Ecr = Ecr;
    }

    public GitlabRegistryData getGitlab() {
        return Gitlab;
    }

    public void setGitlab(GitlabRegistryData Gitlab) {
        this.Gitlab = Gitlab;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public RegistryManagementConfiguration getManagementConfiguration() {
        return ManagementConfiguration;
    }

    public void setManagementConfiguration(RegistryManagementConfiguration ManagementConfiguration) {
        this.ManagementConfiguration = ManagementConfiguration;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public QuayRegistryData getQuay() {
        return Quay;
    }

    public void setQuay(QuayRegistryData Quay) {
        this.Quay = Quay;
    }

    public RegistryAccesses getRegistryAccesses() {
        return RegistryAccesses;
    }

    public void setRegistryAccesses(RegistryAccesses RegistryAccesses) {
        this.RegistryAccesses = RegistryAccesses;
    }

    public TeamAccessPolicies getTeamAccessPolicies() {
        return TeamAccessPolicies;
    }

    public void setTeamAccessPolicies(TeamAccessPolicies TeamAccessPolicies) {
        this.TeamAccessPolicies = TeamAccessPolicies;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public UserAccessPolicies getUserAccessPolicies() {
        return UserAccessPolicies;
    }

    public void setUserAccessPolicies(UserAccessPolicies UserAccessPolicies) {
        this.UserAccessPolicies = UserAccessPolicies;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

}