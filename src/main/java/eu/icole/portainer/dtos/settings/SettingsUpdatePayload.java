package eu.icole.portainer.dtos.settings;

import eu.icole.portainer.dtos.portainer.*;

import java.util.List;

public class SettingsUpdatePayload {

    private String EdgePortainerURL;
    private Integer authenticationMethod;
    private List<Pair> blackListedLabels;
    private Integer edgeAgentCheckinInterval;
    private Boolean enableEdgeComputeFeatures;
    private Boolean enableTelemetry;
    private Boolean enforceEdgeID;
    private GlobalDeploymentOptions globalDeploymentOptions;
    private String helmRepositoryURL;
    private InternalAuthSettings internalAuthSettings;
    private String kubeconfigExpiry;
    private String kubectlShellImage;
    private LDAPSettings ldapsettings;
    private String logoURL;
    private OAuthSettings oauthSettings;
    private String snapshotInterval;
    private String templatesURL;
    private Boolean trustOnFirstConnect;
    private String userSessionTimeout;

    public SettingsUpdatePayload() {
    }

    public SettingsUpdatePayload(String EdgePortainerURL, Integer authenticationMethod, List<Pair> blackListedLabels, Integer edgeAgentCheckinInterval, Boolean enableEdgeComputeFeatures, Boolean enableTelemetry, Boolean enforceEdgeID, GlobalDeploymentOptions globalDeploymentOptions, String helmRepositoryURL, InternalAuthSettings internalAuthSettings, String kubeconfigExpiry, String kubectlShellImage, LDAPSettings ldapsettings, String logoURL, OAuthSettings oauthSettings, String snapshotInterval, String templatesURL, Boolean trustOnFirstConnect, String userSessionTimeout) {
        this.EdgePortainerURL = EdgePortainerURL;
        this.authenticationMethod = authenticationMethod;
        this.blackListedLabels = blackListedLabels;
        this.edgeAgentCheckinInterval = edgeAgentCheckinInterval;
        this.enableEdgeComputeFeatures = enableEdgeComputeFeatures;
        this.enableTelemetry = enableTelemetry;
        this.enforceEdgeID = enforceEdgeID;
        this.globalDeploymentOptions = globalDeploymentOptions;
        this.helmRepositoryURL = helmRepositoryURL;
        this.internalAuthSettings = internalAuthSettings;
        this.kubeconfigExpiry = kubeconfigExpiry;
        this.kubectlShellImage = kubectlShellImage;
        this.ldapsettings = ldapsettings;
        this.logoURL = logoURL;
        this.oauthSettings = oauthSettings;
        this.snapshotInterval = snapshotInterval;
        this.templatesURL = templatesURL;
        this.trustOnFirstConnect = trustOnFirstConnect;
        this.userSessionTimeout = userSessionTimeout;
    }

    public String getEdgePortainerURL() {
        return EdgePortainerURL;
    }

    public void setEdgePortainerURL(String EdgePortainerURL) {
        this.EdgePortainerURL = EdgePortainerURL;
    }

    public Integer getAuthenticationMethod() {
        return authenticationMethod;
    }

    public void setAuthenticationMethod(Integer authenticationMethod) {
        this.authenticationMethod = authenticationMethod;
    }

    public List<Pair> getBlackListedLabels() {
        return blackListedLabels;
    }

    public void setBlackListedLabels(List<Pair> blackListedLabels) {
        this.blackListedLabels = blackListedLabels;
    }

    public Integer getEdgeAgentCheckinInterval() {
        return edgeAgentCheckinInterval;
    }

    public void setEdgeAgentCheckinInterval(Integer edgeAgentCheckinInterval) {
        this.edgeAgentCheckinInterval = edgeAgentCheckinInterval;
    }

    public Boolean getEnableEdgeComputeFeatures() {
        return enableEdgeComputeFeatures;
    }

    public void setEnableEdgeComputeFeatures(Boolean enableEdgeComputeFeatures) {
        this.enableEdgeComputeFeatures = enableEdgeComputeFeatures;
    }

    public Boolean getEnableTelemetry() {
        return enableTelemetry;
    }

    public void setEnableTelemetry(Boolean enableTelemetry) {
        this.enableTelemetry = enableTelemetry;
    }

    public Boolean getEnforceEdgeID() {
        return enforceEdgeID;
    }

    public void setEnforceEdgeID(Boolean enforceEdgeID) {
        this.enforceEdgeID = enforceEdgeID;
    }

    public GlobalDeploymentOptions getGlobalDeploymentOptions() {
        return globalDeploymentOptions;
    }

    public void setGlobalDeploymentOptions(GlobalDeploymentOptions globalDeploymentOptions) {
        this.globalDeploymentOptions = globalDeploymentOptions;
    }

    public String getHelmRepositoryURL() {
        return helmRepositoryURL;
    }

    public void setHelmRepositoryURL(String helmRepositoryURL) {
        this.helmRepositoryURL = helmRepositoryURL;
    }

    public InternalAuthSettings getInternalAuthSettings() {
        return internalAuthSettings;
    }

    public void setInternalAuthSettings(InternalAuthSettings internalAuthSettings) {
        this.internalAuthSettings = internalAuthSettings;
    }

    public String getKubeconfigExpiry() {
        return kubeconfigExpiry;
    }

    public void setKubeconfigExpiry(String kubeconfigExpiry) {
        this.kubeconfigExpiry = kubeconfigExpiry;
    }

    public String getKubectlShellImage() {
        return kubectlShellImage;
    }

    public void setKubectlShellImage(String kubectlShellImage) {
        this.kubectlShellImage = kubectlShellImage;
    }

    public LDAPSettings getLdapsettings() {
        return ldapsettings;
    }

    public void setLdapsettings(LDAPSettings ldapsettings) {
        this.ldapsettings = ldapsettings;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public void setLogoURL(String logoURL) {
        this.logoURL = logoURL;
    }

    public OAuthSettings getOauthSettings() {
        return oauthSettings;
    }

    public void setOauthSettings(OAuthSettings oauthSettings) {
        this.oauthSettings = oauthSettings;
    }

    public String getSnapshotInterval() {
        return snapshotInterval;
    }

    public void setSnapshotInterval(String snapshotInterval) {
        this.snapshotInterval = snapshotInterval;
    }

    public String getTemplatesURL() {
        return templatesURL;
    }

    public void setTemplatesURL(String templatesURL) {
        this.templatesURL = templatesURL;
    }

    public Boolean getTrustOnFirstConnect() {
        return trustOnFirstConnect;
    }

    public void setTrustOnFirstConnect(Boolean trustOnFirstConnect) {
        this.trustOnFirstConnect = trustOnFirstConnect;
    }

    public String getUserSessionTimeout() {
        return userSessionTimeout;
    }

    public void setUserSessionTimeout(String userSessionTimeout) {
        this.userSessionTimeout = userSessionTimeout;
    }

}