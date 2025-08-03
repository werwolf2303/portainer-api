package eu.icole.portainer.dtos.kubernetes;


public class K8sStorageClass {

    private Boolean allowVolumeExpansion;
    private String name;
    private String provisioner;
    private String reclaimPolicy;

    public K8sStorageClass() {
    }

    public K8sStorageClass(Boolean allowVolumeExpansion, String name, String provisioner, String reclaimPolicy) {
        this.allowVolumeExpansion = allowVolumeExpansion;
        this.name = name;
        this.provisioner = provisioner;
        this.reclaimPolicy = reclaimPolicy;
    }

    public Boolean getAllowVolumeExpansion() {
        return allowVolumeExpansion;
    }

    public void setAllowVolumeExpansion(Boolean allowVolumeExpansion) {
        this.allowVolumeExpansion = allowVolumeExpansion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvisioner() {
        return provisioner;
    }

    public void setProvisioner(String provisioner) {
        this.provisioner = provisioner;
    }

    public String getReclaimPolicy() {
        return reclaimPolicy;
    }

    public void setReclaimPolicy(String reclaimPolicy) {
        this.reclaimPolicy = reclaimPolicy;
    }

}