package eu.icole.portainer.dtos.portainer;


public class EndpointSecuritySettings {

    private Boolean allowBindMountsForRegularUsers;
    private Boolean allowContainerCapabilitiesForRegularUsers;
    private Boolean allowDeviceMappingForRegularUsers;
    private Boolean allowHostNamespaceForRegularUsers;
    private Boolean allowPrivilegedModeForRegularUsers;
    private Boolean allowStackManagementForRegularUsers;
    private Boolean allowSysctlSettingForRegularUsers;
    private Boolean allowVolumeBrowserForRegularUsers;
    private Boolean enableHostManagementFeatures;

    public EndpointSecuritySettings() {
    }

    public EndpointSecuritySettings(Boolean allowBindMountsForRegularUsers, Boolean allowContainerCapabilitiesForRegularUsers, Boolean allowDeviceMappingForRegularUsers, Boolean allowHostNamespaceForRegularUsers, Boolean allowPrivilegedModeForRegularUsers, Boolean allowStackManagementForRegularUsers, Boolean allowSysctlSettingForRegularUsers, Boolean allowVolumeBrowserForRegularUsers, Boolean enableHostManagementFeatures) {
        this.allowBindMountsForRegularUsers = allowBindMountsForRegularUsers;
        this.allowContainerCapabilitiesForRegularUsers = allowContainerCapabilitiesForRegularUsers;
        this.allowDeviceMappingForRegularUsers = allowDeviceMappingForRegularUsers;
        this.allowHostNamespaceForRegularUsers = allowHostNamespaceForRegularUsers;
        this.allowPrivilegedModeForRegularUsers = allowPrivilegedModeForRegularUsers;
        this.allowStackManagementForRegularUsers = allowStackManagementForRegularUsers;
        this.allowSysctlSettingForRegularUsers = allowSysctlSettingForRegularUsers;
        this.allowVolumeBrowserForRegularUsers = allowVolumeBrowserForRegularUsers;
        this.enableHostManagementFeatures = enableHostManagementFeatures;
    }

    public Boolean getAllowBindMountsForRegularUsers() {
        return allowBindMountsForRegularUsers;
    }

    public void setAllowBindMountsForRegularUsers(Boolean allowBindMountsForRegularUsers) {
        this.allowBindMountsForRegularUsers = allowBindMountsForRegularUsers;
    }

    public Boolean getAllowContainerCapabilitiesForRegularUsers() {
        return allowContainerCapabilitiesForRegularUsers;
    }

    public void setAllowContainerCapabilitiesForRegularUsers(Boolean allowContainerCapabilitiesForRegularUsers) {
        this.allowContainerCapabilitiesForRegularUsers = allowContainerCapabilitiesForRegularUsers;
    }

    public Boolean getAllowDeviceMappingForRegularUsers() {
        return allowDeviceMappingForRegularUsers;
    }

    public void setAllowDeviceMappingForRegularUsers(Boolean allowDeviceMappingForRegularUsers) {
        this.allowDeviceMappingForRegularUsers = allowDeviceMappingForRegularUsers;
    }

    public Boolean getAllowHostNamespaceForRegularUsers() {
        return allowHostNamespaceForRegularUsers;
    }

    public void setAllowHostNamespaceForRegularUsers(Boolean allowHostNamespaceForRegularUsers) {
        this.allowHostNamespaceForRegularUsers = allowHostNamespaceForRegularUsers;
    }

    public Boolean getAllowPrivilegedModeForRegularUsers() {
        return allowPrivilegedModeForRegularUsers;
    }

    public void setAllowPrivilegedModeForRegularUsers(Boolean allowPrivilegedModeForRegularUsers) {
        this.allowPrivilegedModeForRegularUsers = allowPrivilegedModeForRegularUsers;
    }

    public Boolean getAllowStackManagementForRegularUsers() {
        return allowStackManagementForRegularUsers;
    }

    public void setAllowStackManagementForRegularUsers(Boolean allowStackManagementForRegularUsers) {
        this.allowStackManagementForRegularUsers = allowStackManagementForRegularUsers;
    }

    public Boolean getAllowSysctlSettingForRegularUsers() {
        return allowSysctlSettingForRegularUsers;
    }

    public void setAllowSysctlSettingForRegularUsers(Boolean allowSysctlSettingForRegularUsers) {
        this.allowSysctlSettingForRegularUsers = allowSysctlSettingForRegularUsers;
    }

    public Boolean getAllowVolumeBrowserForRegularUsers() {
        return allowVolumeBrowserForRegularUsers;
    }

    public void setAllowVolumeBrowserForRegularUsers(Boolean allowVolumeBrowserForRegularUsers) {
        this.allowVolumeBrowserForRegularUsers = allowVolumeBrowserForRegularUsers;
    }

    public Boolean getEnableHostManagementFeatures() {
        return enableHostManagementFeatures;
    }

    public void setEnableHostManagementFeatures(Boolean enableHostManagementFeatures) {
        this.enableHostManagementFeatures = enableHostManagementFeatures;
    }

}