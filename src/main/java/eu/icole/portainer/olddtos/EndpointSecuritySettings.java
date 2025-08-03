package eu.icole.portainer.olddtos;

public class EndpointSecuritySettings {
    private boolean allowBindMountsForRegularUsers;
    private boolean allowContainerCapabilitiesForRegularUsers;
    private boolean allowDeviceMappingForRegularUsers;
    private boolean allowHostNamespaceForRegularUsers;
    private boolean allowPrivilegedModeForRegularUsers;
    private boolean allowStackManagementForRegularUsers;
    private boolean allowSysctlSettingForRegularUsers;
    private boolean allowVolumeBrowserForRegularUsers;
    private boolean enableHostManagementFeatures;

    public boolean isAllowBindMountsForRegularUsers() {
        return allowBindMountsForRegularUsers;
    }

    public boolean isAllowContainerCapabilitiesForRegularUsers() {
        return allowContainerCapabilitiesForRegularUsers;
    }

    public boolean isAllowDeviceMappingForRegularUsers() {
        return allowDeviceMappingForRegularUsers;
    }

    public boolean isAllowHostNamespaceForRegularUsers() {
        return allowHostNamespaceForRegularUsers;
    }

    public boolean isAllowPrivilegedModeForRegularUsers() {
        return allowPrivilegedModeForRegularUsers;
    }

    public boolean isAllowSysctlSettingForRegularUsers() {
        return allowSysctlSettingForRegularUsers;
    }

    public boolean isAllowStackManagementForRegularUsers() {
        return allowStackManagementForRegularUsers;
    }

    public boolean isEnableHostManagementFeatures() {
        return enableHostManagementFeatures;
    }

    public boolean isAllowVolumeBrowserForRegularUsers() {
        return allowVolumeBrowserForRegularUsers;
    }
}
