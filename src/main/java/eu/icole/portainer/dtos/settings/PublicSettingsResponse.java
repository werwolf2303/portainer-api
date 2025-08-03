package eu.icole.portainer.dtos.settings;

import eu.icole.portainer.dtos.portainer.GlobalDeploymentOptions;

import java.util.Map;

public class PublicSettingsResponse {

    private Integer AuthenticationMethod;
    private Boolean EnableEdgeComputeFeatures;
    private Boolean EnableTelemetry;
    private Map<String, Object> Features;
    private GlobalDeploymentOptions GlobalDeploymentOptions;
    private Boolean IsDockerDesktopExtension;
    private String LogoURL;
    private String OAuthLoginURI;
    private String OAuthLogoutURI;
    private Integer RequiredPasswordLength;
    private Boolean TeamSync;
    private Map<String, Object> edge;
    private Boolean isAMTEnabled;
    private String kubeconfigExpiry;

    public PublicSettingsResponse() {
    }

    public PublicSettingsResponse(Integer AuthenticationMethod, Boolean EnableEdgeComputeFeatures, Boolean EnableTelemetry, Map<String, Object> Features, GlobalDeploymentOptions GlobalDeploymentOptions, Boolean IsDockerDesktopExtension, String LogoURL, String OAuthLoginURI, String OAuthLogoutURI, Integer RequiredPasswordLength, Boolean TeamSync, Map<String, Object> edge, Boolean isAMTEnabled, String kubeconfigExpiry) {
        this.AuthenticationMethod = AuthenticationMethod;
        this.EnableEdgeComputeFeatures = EnableEdgeComputeFeatures;
        this.EnableTelemetry = EnableTelemetry;
        this.Features = Features;
        this.GlobalDeploymentOptions = GlobalDeploymentOptions;
        this.IsDockerDesktopExtension = IsDockerDesktopExtension;
        this.LogoURL = LogoURL;
        this.OAuthLoginURI = OAuthLoginURI;
        this.OAuthLogoutURI = OAuthLogoutURI;
        this.RequiredPasswordLength = RequiredPasswordLength;
        this.TeamSync = TeamSync;
        this.edge = edge;
        this.isAMTEnabled = isAMTEnabled;
        this.kubeconfigExpiry = kubeconfigExpiry;
    }

    public Integer getAuthenticationMethod() {
        return AuthenticationMethod;
    }

    public void setAuthenticationMethod(Integer AuthenticationMethod) {
        this.AuthenticationMethod = AuthenticationMethod;
    }

    public Boolean getEnableEdgeComputeFeatures() {
        return EnableEdgeComputeFeatures;
    }

    public void setEnableEdgeComputeFeatures(Boolean EnableEdgeComputeFeatures) {
        this.EnableEdgeComputeFeatures = EnableEdgeComputeFeatures;
    }

    public Boolean getEnableTelemetry() {
        return EnableTelemetry;
    }

    public void setEnableTelemetry(Boolean EnableTelemetry) {
        this.EnableTelemetry = EnableTelemetry;
    }

    public Map<String, Object> getFeatures() {
        return Features;
    }

    public void setFeatures(Map<String, Object> Features) {
        this.Features = Features;
    }

    public GlobalDeploymentOptions getGlobalDeploymentOptions() {
        return GlobalDeploymentOptions;
    }

    public void setGlobalDeploymentOptions(GlobalDeploymentOptions GlobalDeploymentOptions) {
        this.GlobalDeploymentOptions = GlobalDeploymentOptions;
    }

    public Boolean getIsDockerDesktopExtension() {
        return IsDockerDesktopExtension;
    }

    public void setIsDockerDesktopExtension(Boolean IsDockerDesktopExtension) {
        this.IsDockerDesktopExtension = IsDockerDesktopExtension;
    }

    public String getLogoURL() {
        return LogoURL;
    }

    public void setLogoURL(String LogoURL) {
        this.LogoURL = LogoURL;
    }

    public String getOAuthLoginURI() {
        return OAuthLoginURI;
    }

    public void setOAuthLoginURI(String OAuthLoginURI) {
        this.OAuthLoginURI = OAuthLoginURI;
    }

    public String getOAuthLogoutURI() {
        return OAuthLogoutURI;
    }

    public void setOAuthLogoutURI(String OAuthLogoutURI) {
        this.OAuthLogoutURI = OAuthLogoutURI;
    }

    public Integer getRequiredPasswordLength() {
        return RequiredPasswordLength;
    }

    public void setRequiredPasswordLength(Integer RequiredPasswordLength) {
        this.RequiredPasswordLength = RequiredPasswordLength;
    }

    public Boolean getTeamSync() {
        return TeamSync;
    }

    public void setTeamSync(Boolean TeamSync) {
        this.TeamSync = TeamSync;
    }

    public Map<String, Object> getEdge() {
        return edge;
    }

    public void setEdge(Map<String, Object> edge) {
        this.edge = edge;
    }

    public Boolean getIsAMTEnabled() {
        return isAMTEnabled;
    }

    public void setIsAMTEnabled(Boolean isAMTEnabled) {
        this.isAMTEnabled = isAMTEnabled;
    }

    public String getKubeconfigExpiry() {
        return kubeconfigExpiry;
    }

    public void setKubeconfigExpiry(String kubeconfigExpiry) {
        this.kubeconfigExpiry = kubeconfigExpiry;
    }

}