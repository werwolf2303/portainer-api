package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.Authorizations;
import eu.icole.portainer.dtos.portainer.EndpointAuthorizations;
import eu.icole.portainer.dtos.portainer.UserThemeSettings;

public class User {

    private Integer Id;
    private Integer Role;
    private UserThemeSettings ThemeSettings;
    private Integer TokenIssueAt;
    private Boolean UseCache;
    private String UserTheme;
    private String Username;
    private EndpointAuthorizations endpointAuthorizations;
    private Authorizations portainerAuthorizations;

    public User() {
    }

    public User(Integer Id, Integer Role, UserThemeSettings ThemeSettings, Integer TokenIssueAt, Boolean UseCache, String UserTheme, String Username, EndpointAuthorizations endpointAuthorizations, Authorizations portainerAuthorizations) {
        this.Id = Id;
        this.Role = Role;
        this.ThemeSettings = ThemeSettings;
        this.TokenIssueAt = TokenIssueAt;
        this.UseCache = UseCache;
        this.UserTheme = UserTheme;
        this.Username = Username;
        this.endpointAuthorizations = endpointAuthorizations;
        this.portainerAuthorizations = portainerAuthorizations;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getRole() {
        return Role;
    }

    public void setRole(Integer Role) {
        this.Role = Role;
    }

    public UserThemeSettings getThemeSettings() {
        return ThemeSettings;
    }

    public void setThemeSettings(UserThemeSettings ThemeSettings) {
        this.ThemeSettings = ThemeSettings;
    }

    public Integer getTokenIssueAt() {
        return TokenIssueAt;
    }

    public void setTokenIssueAt(Integer TokenIssueAt) {
        this.TokenIssueAt = TokenIssueAt;
    }

    public Boolean getUseCache() {
        return UseCache;
    }

    public void setUseCache(Boolean UseCache) {
        this.UseCache = UseCache;
    }

    public String getUserTheme() {
        return UserTheme;
    }

    public void setUserTheme(String UserTheme) {
        this.UserTheme = UserTheme;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public EndpointAuthorizations getEndpointAuthorizations() {
        return endpointAuthorizations;
    }

    public void setEndpointAuthorizations(EndpointAuthorizations endpointAuthorizations) {
        this.endpointAuthorizations = endpointAuthorizations;
    }

    public Authorizations getPortainerAuthorizations() {
        return portainerAuthorizations;
    }

    public void setPortainerAuthorizations(Authorizations portainerAuthorizations) {
        this.portainerAuthorizations = portainerAuthorizations;
    }

}