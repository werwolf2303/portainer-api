package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.Capabilities;
import eu.icole.portainer.dtos.v1.SELinuxOptions;
import eu.icole.portainer.dtos.v1.SeccompProfile;
import eu.icole.portainer.dtos.v1.WindowsSecurityContextOptions;

public class SecurityContext {

    private Boolean allowPrivilegeEscalation;
    private Capabilities capabilities;
    private Boolean privileged;
    private String procMount;
    private Boolean readOnlyRootFilesystem;
    private Integer runAsGroup;
    private Boolean runAsNonRoot;
    private Integer runAsUser;
    private SELinuxOptions seLinuxOptions;
    private SeccompProfile seccompProfile;
    private WindowsSecurityContextOptions windowsOptions;

    public SecurityContext() {
    }

    public SecurityContext(Boolean allowPrivilegeEscalation, Capabilities capabilities, Boolean privileged, String procMount, Boolean readOnlyRootFilesystem, Integer runAsGroup, Boolean runAsNonRoot, Integer runAsUser, SELinuxOptions seLinuxOptions, SeccompProfile seccompProfile, WindowsSecurityContextOptions windowsOptions) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
        this.capabilities = capabilities;
        this.privileged = privileged;
        this.procMount = procMount;
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
        this.runAsGroup = runAsGroup;
        this.runAsNonRoot = runAsNonRoot;
        this.runAsUser = runAsUser;
        this.seLinuxOptions = seLinuxOptions;
        this.seccompProfile = seccompProfile;
        this.windowsOptions = windowsOptions;
    }

    public Boolean getAllowPrivilegeEscalation() {
        return allowPrivilegeEscalation;
    }

    public void setAllowPrivilegeEscalation(Boolean allowPrivilegeEscalation) {
        this.allowPrivilegeEscalation = allowPrivilegeEscalation;
    }

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public Boolean getPrivileged() {
        return privileged;
    }

    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public String getProcMount() {
        return procMount;
    }

    public void setProcMount(String procMount) {
        this.procMount = procMount;
    }

    public Boolean getReadOnlyRootFilesystem() {
        return readOnlyRootFilesystem;
    }

    public void setReadOnlyRootFilesystem(Boolean readOnlyRootFilesystem) {
        this.readOnlyRootFilesystem = readOnlyRootFilesystem;
    }

    public Integer getRunAsGroup() {
        return runAsGroup;
    }

    public void setRunAsGroup(Integer runAsGroup) {
        this.runAsGroup = runAsGroup;
    }

    public Boolean getRunAsNonRoot() {
        return runAsNonRoot;
    }

    public void setRunAsNonRoot(Boolean runAsNonRoot) {
        this.runAsNonRoot = runAsNonRoot;
    }

    public Integer getRunAsUser() {
        return runAsUser;
    }

    public void setRunAsUser(Integer runAsUser) {
        this.runAsUser = runAsUser;
    }

    public SELinuxOptions getSeLinuxOptions() {
        return seLinuxOptions;
    }

    public void setSeLinuxOptions(SELinuxOptions seLinuxOptions) {
        this.seLinuxOptions = seLinuxOptions;
    }

    public SeccompProfile getSeccompProfile() {
        return seccompProfile;
    }

    public void setSeccompProfile(SeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
    }

    public WindowsSecurityContextOptions getWindowsOptions() {
        return windowsOptions;
    }

    public void setWindowsOptions(WindowsSecurityContextOptions windowsOptions) {
        this.windowsOptions = windowsOptions;
    }

}