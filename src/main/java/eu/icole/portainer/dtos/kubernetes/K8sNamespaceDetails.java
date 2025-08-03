package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.K8sResourceQuota;

import java.util.Map;

public class K8sNamespaceDetails {

    private Map<String, Object> Annotations;
    private String Name;
    private String Owner;
    private K8sResourceQuota ResourceQuota;

    public K8sNamespaceDetails() {
    }

    public K8sNamespaceDetails(Map<String, Object> Annotations, String Name, String Owner, K8sResourceQuota ResourceQuota) {
        this.Annotations = Annotations;
        this.Name = Name;
        this.Owner = Owner;
        this.ResourceQuota = ResourceQuota;
    }

    public Map<String, Object> getAnnotations() {
        return Annotations;
    }

    public void setAnnotations(Map<String, Object> Annotations) {
        this.Annotations = Annotations;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public K8sResourceQuota getResourceQuota() {
        return ResourceQuota;
    }

    public void setResourceQuota(K8sResourceQuota ResourceQuota) {
        this.ResourceQuota = ResourceQuota;
    }

}