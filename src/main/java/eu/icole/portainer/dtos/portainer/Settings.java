package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.*;

import java.util.List;
import java.util.Map;

public class Settings {

    private String AgentSecret;
    private Boolean AllowBindMountsForRegularUsers;
    private Boolean AllowContainerCapabilitiesForRegularUsers;
    private Boolean AllowDeviceMappingForRegularUsers;
    private Boolean AllowHostNamespaceForRegularUsers;
    private Boolean AllowPrivilegedModeForRegularUsers;
    private Boolean AllowStackManagementForRegularUsers;
    private Boolean AllowVolumeBrowserForRegularUsers;
    private Integer AuthenticationMethod;
    private List<Pair> BlackListedLabels;
    private Boolean DisplayDonationHeader;
    private Boolean DisplayExternalContributors;
    private Edge Edge;
    private Integer EdgeAgentCheckinInterval;
    private String EdgePortainerUrl;
    private Boolean EnableEdgeComputeFeatures;
    private Boolean EnableHostManagementFeatures;
    private Boolean EnableTelemetry;
    private Boolean EnforceEdgeID;
    private Map<String, Object> FeatureFlagSettings;
    private GlobalDeploymentOptions GlobalDeploymentOptions;
    private String HelmRepositoryURL;
    private InternalAuthSettings InternalAuthSettings;
    private Boolean IsDockerDesktopExtension;
    private String KubeconfigExpiry;
    private String KubectlShellImage;
    private LDAPSettings LDAPSettings;
    private String LogoURL;
    private OAuthSettings OAuthSettings;
    private String SnapshotInterval;
    private String TemplatesURL;
    private Boolean TrustOnFirstConnect;
    private String UserSessionTimeout;
    private OpenAMTConfiguration openAMTConfiguration;

    public Settings() {
    }

    public Settings(String AgentSecret, Boolean AllowBindMountsForRegularUsers, Boolean AllowContainerCapabilitiesForRegularUsers, Boolean AllowDeviceMappingForRegularUsers, Boolean AllowHostNamespaceForRegularUsers, Boolean AllowPrivilegedModeForRegularUsers, Boolean AllowStackManagementForRegularUsers, Boolean AllowVolumeBrowserForRegularUsers, Integer AuthenticationMethod, List<Pair> BlackListedLabels, Boolean DisplayDonationHeader, Boolean DisplayExternalContributors, Edge Edge, Integer EdgeAgentCheckinInterval, String EdgePortainerUrl, Boolean EnableEdgeComputeFeatures, Boolean EnableHostManagementFeatures, Boolean EnableTelemetry, Boolean EnforceEdgeID, Map<String, Object> FeatureFlagSettings, GlobalDeploymentOptions GlobalDeploymentOptions, String HelmRepositoryURL, InternalAuthSettings InternalAuthSettings, Boolean IsDockerDesktopExtension, String KubeconfigExpiry, String KubectlShellImage, LDAPSettings LDAPSettings, String LogoURL, OAuthSettings OAuthSettings, String SnapshotInterval, String TemplatesURL, Boolean TrustOnFirstConnect, String UserSessionTimeout, OpenAMTConfiguration openAMTConfiguration) {
        this.AgentSecret = AgentSecret;
        this.AllowBindMountsForRegularUsers = AllowBindMountsForRegularUsers;
        this.AllowContainerCapabilitiesForRegularUsers = AllowContainerCapabilitiesForRegularUsers;
        this.AllowDeviceMappingForRegularUsers = AllowDeviceMappingForRegularUsers;
        this.AllowHostNamespaceForRegularUsers = AllowHostNamespaceForRegularUsers;
        this.AllowPrivilegedModeForRegularUsers = AllowPrivilegedModeForRegularUsers;
        this.AllowStackManagementForRegularUsers = AllowStackManagementForRegularUsers;
        this.AllowVolumeBrowserForRegularUsers = AllowVolumeBrowserForRegularUsers;
        this.AuthenticationMethod = AuthenticationMethod;
        this.BlackListedLabels = BlackListedLabels;
        this.DisplayDonationHeader = DisplayDonationHeader;
        this.DisplayExternalContributors = DisplayExternalContributors;
        this.Edge = Edge;
        this.EdgeAgentCheckinInterval = EdgeAgentCheckinInterval;
        this.EdgePortainerUrl = EdgePortainerUrl;
        this.EnableEdgeComputeFeatures = EnableEdgeComputeFeatures;
        this.EnableHostManagementFeatures = EnableHostManagementFeatures;
        this.EnableTelemetry = EnableTelemetry;
        this.EnforceEdgeID = EnforceEdgeID;
        this.FeatureFlagSettings = FeatureFlagSettings;
        this.GlobalDeploymentOptions = GlobalDeploymentOptions;
        this.HelmRepositoryURL = HelmRepositoryURL;
        this.InternalAuthSettings = InternalAuthSettings;
        this.IsDockerDesktopExtension = IsDockerDesktopExtension;
        this.KubeconfigExpiry = KubeconfigExpiry;
        this.KubectlShellImage = KubectlShellImage;
        this.LDAPSettings = LDAPSettings;
        this.LogoURL = LogoURL;
        this.OAuthSettings = OAuthSettings;
        this.SnapshotInterval = SnapshotInterval;
        this.TemplatesURL = TemplatesURL;
        this.TrustOnFirstConnect = TrustOnFirstConnect;
        this.UserSessionTimeout = UserSessionTimeout;
        this.openAMTConfiguration = openAMTConfiguration;
    }

    public String getAgentSecret() {
        return AgentSecret;
    }

    public void setAgentSecret(String AgentSecret) {
        this.AgentSecret = AgentSecret;
    }

    public Boolean getAllowBindMountsForRegularUsers() {
        return AllowBindMountsForRegularUsers;
    }

    public void setAllowBindMountsForRegularUsers(Boolean AllowBindMountsForRegularUsers) {
        this.AllowBindMountsForRegularUsers = AllowBindMountsForRegularUsers;
    }

    public Boolean getAllowContainerCapabilitiesForRegularUsers() {
        return AllowContainerCapabilitiesForRegularUsers;
    }

    public void setAllowContainerCapabilitiesForRegularUsers(Boolean AllowContainerCapabilitiesForRegularUsers) {
        this.AllowContainerCapabilitiesForRegularUsers = AllowContainerCapabilitiesForRegularUsers;
    }

    public Boolean getAllowDeviceMappingForRegularUsers() {
        return AllowDeviceMappingForRegularUsers;
    }

    public void setAllowDeviceMappingForRegularUsers(Boolean AllowDeviceMappingForRegularUsers) {
        this.AllowDeviceMappingForRegularUsers = AllowDeviceMappingForRegularUsers;
    }

    public Boolean getAllowHostNamespaceForRegularUsers() {
        return AllowHostNamespaceForRegularUsers;
    }

    public void setAllowHostNamespaceForRegularUsers(Boolean AllowHostNamespaceForRegularUsers) {
        this.AllowHostNamespaceForRegularUsers = AllowHostNamespaceForRegularUsers;
    }

    public Boolean getAllowPrivilegedModeForRegularUsers() {
        return AllowPrivilegedModeForRegularUsers;
    }

    public void setAllowPrivilegedModeForRegularUsers(Boolean AllowPrivilegedModeForRegularUsers) {
        this.AllowPrivilegedModeForRegularUsers = AllowPrivilegedModeForRegularUsers;
    }

    public Boolean getAllowStackManagementForRegularUsers() {
        return AllowStackManagementForRegularUsers;
    }

    public void setAllowStackManagementForRegularUsers(Boolean AllowStackManagementForRegularUsers) {
        this.AllowStackManagementForRegularUsers = AllowStackManagementForRegularUsers;
    }

    public Boolean getAllowVolumeBrowserForRegularUsers() {
        return AllowVolumeBrowserForRegularUsers;
    }

    public void setAllowVolumeBrowserForRegularUsers(Boolean AllowVolumeBrowserForRegularUsers) {
        this.AllowVolumeBrowserForRegularUsers = AllowVolumeBrowserForRegularUsers;
    }

    public Integer getAuthenticationMethod() {
        return AuthenticationMethod;
    }

    public void setAuthenticationMethod(Integer AuthenticationMethod) {
        this.AuthenticationMethod = AuthenticationMethod;
    }

    public List<Pair> getBlackListedLabels() {
        return BlackListedLabels;
    }

    public void setBlackListedLabels(List<Pair> BlackListedLabels) {
        this.BlackListedLabels = BlackListedLabels;
    }

    public Boolean getDisplayDonationHeader() {
        return DisplayDonationHeader;
    }

    public void setDisplayDonationHeader(Boolean DisplayDonationHeader) {
        this.DisplayDonationHeader = DisplayDonationHeader;
    }

    public Boolean getDisplayExternalContributors() {
        return DisplayExternalContributors;
    }

    public void setDisplayExternalContributors(Boolean DisplayExternalContributors) {
        this.DisplayExternalContributors = DisplayExternalContributors;
    }

    public Edge getEdge() {
        return Edge;
    }

    public void setEdge(Edge Edge) {
        this.Edge = Edge;
    }

    public Integer getEdgeAgentCheckinInterval() {
        return EdgeAgentCheckinInterval;
    }

    public void setEdgeAgentCheckinInterval(Integer EdgeAgentCheckinInterval) {
        this.EdgeAgentCheckinInterval = EdgeAgentCheckinInterval;
    }

    public String getEdgePortainerUrl() {
        return EdgePortainerUrl;
    }

    public void setEdgePortainerUrl(String EdgePortainerUrl) {
        this.EdgePortainerUrl = EdgePortainerUrl;
    }

    public Boolean getEnableEdgeComputeFeatures() {
        return EnableEdgeComputeFeatures;
    }

    public void setEnableEdgeComputeFeatures(Boolean EnableEdgeComputeFeatures) {
        this.EnableEdgeComputeFeatures = EnableEdgeComputeFeatures;
    }

    public Boolean getEnableHostManagementFeatures() {
        return EnableHostManagementFeatures;
    }

    public void setEnableHostManagementFeatures(Boolean EnableHostManagementFeatures) {
        this.EnableHostManagementFeatures = EnableHostManagementFeatures;
    }

    public Boolean getEnableTelemetry() {
        return EnableTelemetry;
    }

    public void setEnableTelemetry(Boolean EnableTelemetry) {
        this.EnableTelemetry = EnableTelemetry;
    }

    public Boolean getEnforceEdgeID() {
        return EnforceEdgeID;
    }

    public void setEnforceEdgeID(Boolean EnforceEdgeID) {
        this.EnforceEdgeID = EnforceEdgeID;
    }

    public Map<String, Object> getFeatureFlagSettings() {
        return FeatureFlagSettings;
    }

    public void setFeatureFlagSettings(Map<String, Object> FeatureFlagSettings) {
        this.FeatureFlagSettings = FeatureFlagSettings;
    }

    public GlobalDeploymentOptions getGlobalDeploymentOptions() {
        return GlobalDeploymentOptions;
    }

    public void setGlobalDeploymentOptions(GlobalDeploymentOptions GlobalDeploymentOptions) {
        this.GlobalDeploymentOptions = GlobalDeploymentOptions;
    }

    public String getHelmRepositoryURL() {
        return HelmRepositoryURL;
    }

    public void setHelmRepositoryURL(String HelmRepositoryURL) {
        this.HelmRepositoryURL = HelmRepositoryURL;
    }

    public InternalAuthSettings getInternalAuthSettings() {
        return InternalAuthSettings;
    }

    public void setInternalAuthSettings(InternalAuthSettings InternalAuthSettings) {
        this.InternalAuthSettings = InternalAuthSettings;
    }

    public Boolean getIsDockerDesktopExtension() {
        return IsDockerDesktopExtension;
    }

    public void setIsDockerDesktopExtension(Boolean IsDockerDesktopExtension) {
        this.IsDockerDesktopExtension = IsDockerDesktopExtension;
    }

    public String getKubeconfigExpiry() {
        return KubeconfigExpiry;
    }

    public void setKubeconfigExpiry(String KubeconfigExpiry) {
        this.KubeconfigExpiry = KubeconfigExpiry;
    }

    public String getKubectlShellImage() {
        return KubectlShellImage;
    }

    public void setKubectlShellImage(String KubectlShellImage) {
        this.KubectlShellImage = KubectlShellImage;
    }

    public LDAPSettings getLDAPSettings() {
        return LDAPSettings;
    }

    public void setLDAPSettings(LDAPSettings LDAPSettings) {
        this.LDAPSettings = LDAPSettings;
    }

    public String getLogoURL() {
        return LogoURL;
    }

    public void setLogoURL(String LogoURL) {
        this.LogoURL = LogoURL;
    }

    public OAuthSettings getOAuthSettings() {
        return OAuthSettings;
    }

    public void setOAuthSettings(OAuthSettings OAuthSettings) {
        this.OAuthSettings = OAuthSettings;
    }

    public String getSnapshotInterval() {
        return SnapshotInterval;
    }

    public void setSnapshotInterval(String SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    public String getTemplatesURL() {
        return TemplatesURL;
    }

    public void setTemplatesURL(String TemplatesURL) {
        this.TemplatesURL = TemplatesURL;
    }

    public Boolean getTrustOnFirstConnect() {
        return TrustOnFirstConnect;
    }

    public void setTrustOnFirstConnect(Boolean TrustOnFirstConnect) {
        this.TrustOnFirstConnect = TrustOnFirstConnect;
    }

    public String getUserSessionTimeout() {
        return UserSessionTimeout;
    }

    public void setUserSessionTimeout(String UserSessionTimeout) {
        this.UserSessionTimeout = UserSessionTimeout;
    }

    public OpenAMTConfiguration getOpenAMTConfiguration() {
        return openAMTConfiguration;
    }

    public void setOpenAMTConfiguration(OpenAMTConfiguration openAMTConfiguration) {
        this.openAMTConfiguration = openAMTConfiguration;
    }

}