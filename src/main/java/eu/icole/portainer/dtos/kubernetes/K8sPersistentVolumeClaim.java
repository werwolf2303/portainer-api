package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.K8sApplication;
import eu.icole.portainer.dtos.v1.ResourceList;

import java.util.List;
import java.util.Map;

public class K8sPersistentVolumeClaim {

    private List<String> accessModes;
    private String creationDate;
    private String id;
    private Map<String, Object> labels;
    private String name;
    private String namespace;
    private List<K8sApplication> owningApplications;
    private String phase;
    private ResourceList resourcesRequests;
    private Integer storage;
    private String storageClass;
    private String volumeMode;
    private String volumeName;

    public K8sPersistentVolumeClaim() {
    }

    public K8sPersistentVolumeClaim(List<String> accessModes, String creationDate, String id, Map<String, Object> labels, String name, String namespace, List<K8sApplication> owningApplications, String phase, ResourceList resourcesRequests, Integer storage, String storageClass, String volumeMode, String volumeName) {
        this.accessModes = accessModes;
        this.creationDate = creationDate;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.namespace = namespace;
        this.owningApplications = owningApplications;
        this.phase = phase;
        this.resourcesRequests = resourcesRequests;
        this.storage = storage;
        this.storageClass = storageClass;
        this.volumeMode = volumeMode;
        this.volumeName = volumeName;
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Object> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, Object> labels) {
        this.labels = labels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<K8sApplication> getOwningApplications() {
        return owningApplications;
    }

    public void setOwningApplications(List<K8sApplication> owningApplications) {
        this.owningApplications = owningApplications;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public ResourceList getResourcesRequests() {
        return resourcesRequests;
    }

    public void setResourcesRequests(ResourceList resourcesRequests) {
        this.resourcesRequests = resourcesRequests;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public String getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(String storageClass) {
        this.storageClass = storageClass;
    }

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
    }

    public String getVolumeName() {
        return volumeName;
    }

    public void setVolumeName(String volumeName) {
        this.volumeName = volumeName;
    }

}