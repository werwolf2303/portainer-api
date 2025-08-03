package eu.icole.portainer.dtos.endpoints;

import eu.icole.portainer.dtos.portainer.Pair;

import java.util.List;

public class EndpointSettingsUpdatePayload {

    private Boolean allowBindMountsForRegularUsers;
    private Boolean allowContainerCapabilitiesForRegularUsers;
    private Boolean allowDeviceMappingForRegularUsers;
    private Boolean allowHostNamespaceForRegularUsers;
    private Boolean allowPrivilegedModeForRegularUsers;
    private Boolean allowStackManagementForRegularUsers;
    private Boolean allowSysctlSettingForRegularUsers;
    private Boolean allowVolumeBrowserForRegularUsers;
    private Boolean enableGPUManagement;
    private Boolean enableHostManagementFeatures;
    private List<Pair> gpus;

    public EndpointSettingsUpdatePayload() {
    }

    public EndpointSettingsUpdatePayload(Boolean allowBindMountsForRegularUsers, Boolean allowContainerCapabilitiesForRegularUsers, Boolean allowDeviceMappingForRegularUsers, Boolean allowHostNamespaceForRegularUsers, Boolean allowPrivilegedModeForRegularUsers, Boolean allowStackManagementForRegularUsers, Boolean allowSysctlSettingForRegularUsers, Boolean allowVolumeBrowserForRegularUsers, Boolean enableGPUManagement, Boolean enableHostManagementFeatures, List<Pair> gpus) {
        this.allowBindMountsForRegularUsers = allowBindMountsForRegularUsers;
        this.allowContainerCapabilitiesForRegularUsers = allowContainerCapabilitiesForRegularUsers;
        this.allowDeviceMappingForRegularUsers = allowDeviceMappingForRegularUsers;
        this.allowHostNamespaceForRegularUsers = allowHostNamespaceForRegularUsers;
        this.allowPrivilegedModeForRegularUsers = allowPrivilegedModeForRegularUsers;
        this.allowStackManagementForRegularUsers = allowStackManagementForRegularUsers;
        this.allowSysctlSettingForRegularUsers = allowSysctlSettingForRegularUsers;
        this.allowVolumeBrowserForRegularUsers = allowVolumeBrowserForRegularUsers;
        this.enableGPUManagement = enableGPUManagement;
        this.enableHostManagementFeatures = enableHostManagementFeatures;
        this.gpus = gpus;
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

    public Boolean getEnableGPUManagement() {
        return enableGPUManagement;
    }

    public void setEnableGPUManagement(Boolean enableGPUManagement) {
        this.enableGPUManagement = enableGPUManagement;
    }

    public Boolean getEnableHostManagementFeatures() {
        return enableHostManagementFeatures;
    }

    public void setEnableHostManagementFeatures(Boolean enableHostManagementFeatures) {
        this.enableHostManagementFeatures = enableHostManagementFeatures;
    }

    public List<Pair> getGpus() {
        return gpus;
    }

    public void setGpus(List<Pair> gpus) {
        this.gpus = gpus;
    }

}