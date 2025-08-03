package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.v1.NamespaceStatus;
import eu.icole.portainer.dtos.v1.ResourceQuota;

import java.util.Map;

public class K8sNamespaceInfo {

    private Map<String, Object> Annotations;
    private String CreationDate;
    private String Id;
    private Boolean IsDefault;
    private Boolean IsSystem;
    private String Name;
    private String NamespaceOwner;
    private ResourceQuota ResourceQuota;
    private NamespaceStatus Status;

    public K8sNamespaceInfo() {
    }

    public K8sNamespaceInfo(Map<String, Object> Annotations, String CreationDate, String Id, Boolean IsDefault, Boolean IsSystem, String Name, String NamespaceOwner, ResourceQuota ResourceQuota, NamespaceStatus Status) {
        this.Annotations = Annotations;
        this.CreationDate = CreationDate;
        this.Id = Id;
        this.IsDefault = IsDefault;
        this.IsSystem = IsSystem;
        this.Name = Name;
        this.NamespaceOwner = NamespaceOwner;
        this.ResourceQuota = ResourceQuota;
        this.Status = Status;
    }

    public Map<String, Object> getAnnotations() {
        return Annotations;
    }

    public void setAnnotations(Map<String, Object> Annotations) {
        this.Annotations = Annotations;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Boolean getIsDefault() {
        return IsDefault;
    }

    public void setIsDefault(Boolean IsDefault) {
        this.IsDefault = IsDefault;
    }

    public Boolean getIsSystem() {
        return IsSystem;
    }

    public void setIsSystem(Boolean IsSystem) {
        this.IsSystem = IsSystem;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNamespaceOwner() {
        return NamespaceOwner;
    }

    public void setNamespaceOwner(String NamespaceOwner) {
        this.NamespaceOwner = NamespaceOwner;
    }

    public ResourceQuota getResourceQuota() {
        return ResourceQuota;
    }

    public void setResourceQuota(ResourceQuota ResourceQuota) {
        this.ResourceQuota = ResourceQuota;
    }

    public NamespaceStatus getStatus() {
        return Status;
    }

    public void setStatus(NamespaceStatus Status) {
        this.Status = Status;
    }

}