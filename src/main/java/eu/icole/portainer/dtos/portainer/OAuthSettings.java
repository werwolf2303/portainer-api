package eu.icole.portainer.dtos.portainer;

import java.util.List;

public class OAuthSettings {

    private String AccessTokenURI;
    private Integer AuthStyle;
    private String AuthorizationURI;
    private String ClientID;
    private String ClientSecret;
    private Integer DefaultTeamID;
    private List<Integer> KubeSecretKey;
    private String LogoutURI;
    private Boolean OAuthAutoCreateUsers;
    private String RedirectURI;
    private String ResourceURI;
    private Boolean SSO;
    private String Scopes;
    private String UserIdentifier;

    public OAuthSettings() {
    }

    public OAuthSettings(String AccessTokenURI, Integer AuthStyle, String AuthorizationURI, String ClientID, String ClientSecret, Integer DefaultTeamID, List<Integer> KubeSecretKey, String LogoutURI, Boolean OAuthAutoCreateUsers, String RedirectURI, String ResourceURI, Boolean SSO, String Scopes, String UserIdentifier) {
        this.AccessTokenURI = AccessTokenURI;
        this.AuthStyle = AuthStyle;
        this.AuthorizationURI = AuthorizationURI;
        this.ClientID = ClientID;
        this.ClientSecret = ClientSecret;
        this.DefaultTeamID = DefaultTeamID;
        this.KubeSecretKey = KubeSecretKey;
        this.LogoutURI = LogoutURI;
        this.OAuthAutoCreateUsers = OAuthAutoCreateUsers;
        this.RedirectURI = RedirectURI;
        this.ResourceURI = ResourceURI;
        this.SSO = SSO;
        this.Scopes = Scopes;
        this.UserIdentifier = UserIdentifier;
    }

    public String getAccessTokenURI() {
        return AccessTokenURI;
    }

    public void setAccessTokenURI(String AccessTokenURI) {
        this.AccessTokenURI = AccessTokenURI;
    }

    public Integer getAuthStyle() {
        return AuthStyle;
    }

    public void setAuthStyle(Integer AuthStyle) {
        this.AuthStyle = AuthStyle;
    }

    public String getAuthorizationURI() {
        return AuthorizationURI;
    }

    public void setAuthorizationURI(String AuthorizationURI) {
        this.AuthorizationURI = AuthorizationURI;
    }

    public String getClientID() {
        return ClientID;
    }

    public void setClientID(String ClientID) {
        this.ClientID = ClientID;
    }

    public String getClientSecret() {
        return ClientSecret;
    }

    public void setClientSecret(String ClientSecret) {
        this.ClientSecret = ClientSecret;
    }

    public Integer getDefaultTeamID() {
        return DefaultTeamID;
    }

    public void setDefaultTeamID(Integer DefaultTeamID) {
        this.DefaultTeamID = DefaultTeamID;
    }

    public List<Integer> getKubeSecretKey() {
        return KubeSecretKey;
    }

    public void setKubeSecretKey(List<Integer> KubeSecretKey) {
        this.KubeSecretKey = KubeSecretKey;
    }

    public String getLogoutURI() {
        return LogoutURI;
    }

    public void setLogoutURI(String LogoutURI) {
        this.LogoutURI = LogoutURI;
    }

    public Boolean getOAuthAutoCreateUsers() {
        return OAuthAutoCreateUsers;
    }

    public void setOAuthAutoCreateUsers(Boolean OAuthAutoCreateUsers) {
        this.OAuthAutoCreateUsers = OAuthAutoCreateUsers;
    }

    public String getRedirectURI() {
        return RedirectURI;
    }

    public void setRedirectURI(String RedirectURI) {
        this.RedirectURI = RedirectURI;
    }

    public String getResourceURI() {
        return ResourceURI;
    }

    public void setResourceURI(String ResourceURI) {
        this.ResourceURI = ResourceURI;
    }

    public Boolean getSSO() {
        return SSO;
    }

    public void setSSO(Boolean SSO) {
        this.SSO = SSO;
    }

    public String getScopes() {
        return Scopes;
    }

    public void setScopes(String Scopes) {
        this.Scopes = Scopes;
    }

    public String getUserIdentifier() {
        return UserIdentifier;
    }

    public void setUserIdentifier(String UserIdentifier) {
        this.UserIdentifier = UserIdentifier;
    }

}