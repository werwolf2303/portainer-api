package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.K8sConfigurationOwnerResource;

import java.util.List;
import java.util.Map;

public class K8sConfigMap {

    private Map<String, Object> Annotations;
    private String ConfigurationOwner;
    private String ConfigurationOwnerId;
    private List<K8sConfigurationOwnerResource> ConfigurationOwners;
    private String CreationDate;
    private Map<String, Object> Data;
    private Boolean IsUsed;
    private Map<String, Object> Labels;
    private String Name;
    private String Namespace;
    private String UID;

    public K8sConfigMap() {
    }

    public K8sConfigMap(Map<String, Object> Annotations, String ConfigurationOwner, String ConfigurationOwnerId, List<K8sConfigurationOwnerResource> ConfigurationOwners, String CreationDate, Map<String, Object> Data, Boolean IsUsed, Map<String, Object> Labels, String Name, String Namespace, String UID) {
        this.Annotations = Annotations;
        this.ConfigurationOwner = ConfigurationOwner;
        this.ConfigurationOwnerId = ConfigurationOwnerId;
        this.ConfigurationOwners = ConfigurationOwners;
        this.CreationDate = CreationDate;
        this.Data = Data;
        this.IsUsed = IsUsed;
        this.Labels = Labels;
        this.Name = Name;
        this.Namespace = Namespace;
        this.UID = UID;
    }

    public Map<String, Object> getAnnotations() {
        return Annotations;
    }

    public void setAnnotations(Map<String, Object> Annotations) {
        this.Annotations = Annotations;
    }

    public String getConfigurationOwner() {
        return ConfigurationOwner;
    }

    public void setConfigurationOwner(String ConfigurationOwner) {
        this.ConfigurationOwner = ConfigurationOwner;
    }

    public String getConfigurationOwnerId() {
        return ConfigurationOwnerId;
    }

    public void setConfigurationOwnerId(String ConfigurationOwnerId) {
        this.ConfigurationOwnerId = ConfigurationOwnerId;
    }

    public List<K8sConfigurationOwnerResource> getConfigurationOwners() {
        return ConfigurationOwners;
    }

    public void setConfigurationOwners(List<K8sConfigurationOwnerResource> ConfigurationOwners) {
        this.ConfigurationOwners = ConfigurationOwners;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    public Map<String, Object> getData() {
        return Data;
    }

    public void setData(Map<String, Object> Data) {
        this.Data = Data;
    }

    public Boolean getIsUsed() {
        return IsUsed;
    }

    public void setIsUsed(Boolean IsUsed) {
        this.IsUsed = IsUsed;
    }

    public Map<String, Object> getLabels() {
        return Labels;
    }

    public void setLabels(Map<String, Object> Labels) {
        this.Labels = Labels;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNamespace() {
        return Namespace;
    }

    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

}