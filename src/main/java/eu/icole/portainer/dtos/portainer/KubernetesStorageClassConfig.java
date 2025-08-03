package eu.icole.portainer.dtos.portainer;

import java.util.List;

public class KubernetesStorageClassConfig {

    private List<String> AccessModes;
    private Boolean AllowVolumeExpansion;
    private String Name;
    private String Provisioner;

    public KubernetesStorageClassConfig() {
    }

    public KubernetesStorageClassConfig(List<String> AccessModes, Boolean AllowVolumeExpansion, String Name, String Provisioner) {
        this.AccessModes = AccessModes;
        this.AllowVolumeExpansion = AllowVolumeExpansion;
        this.Name = Name;
        this.Provisioner = Provisioner;
    }

    public List<String> getAccessModes() {
        return AccessModes;
    }

    public void setAccessModes(List<String> AccessModes) {
        this.AccessModes = AccessModes;
    }

    public Boolean getAllowVolumeExpansion() {
        return AllowVolumeExpansion;
    }

    public void setAllowVolumeExpansion(Boolean AllowVolumeExpansion) {
        this.AllowVolumeExpansion = AllowVolumeExpansion;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getProvisioner() {
        return Provisioner;
    }

    public void setProvisioner(String Provisioner) {
        this.Provisioner = Provisioner;
    }

}