package eu.icole.portainer.olddtos;

import java.util.List;

public class KubernetesStorageClassConfig {
    private List<String> AccessModes;
    private boolean AllowVolumeExpansion;
    private String Name;
    private String Provisioner;

    public List<String> getAccessModes() {
        return AccessModes;
    }

    public boolean isAllowVolumeExpansion() {
        return AllowVolumeExpansion;
    }

    public String getName() {
        return Name;
    }

    public String getProvisioner() {
        return Provisioner;
    }
}
