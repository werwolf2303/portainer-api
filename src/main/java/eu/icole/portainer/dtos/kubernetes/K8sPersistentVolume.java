package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.v1.CSIPersistentVolumeSource;
import eu.icole.portainer.dtos.v1.ObjectReference;
import eu.icole.portainer.dtos.v1.ResourceList;

import java.util.List;
import java.util.Map;

public class K8sPersistentVolume {

    private List<String> accessModes;
    private Map<String, Object> annotations;
    private ResourceList capacity;
    private ObjectReference claimRef;
    private CSIPersistentVolumeSource csi;
    private String name;
    private String persistentVolumeReclaimPolicy;
    private String storageClassName;
    private String volumeMode;

    public K8sPersistentVolume() {
    }

    public K8sPersistentVolume(List<String> accessModes, Map<String, Object> annotations, ResourceList capacity, ObjectReference claimRef, CSIPersistentVolumeSource csi, String name, String persistentVolumeReclaimPolicy, String storageClassName, String volumeMode) {
        this.accessModes = accessModes;
        this.annotations = annotations;
        this.capacity = capacity;
        this.claimRef = claimRef;
        this.csi = csi;
        this.name = name;
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
        this.storageClassName = storageClassName;
        this.volumeMode = volumeMode;
    }

    public List<String> getAccessModes() {
        return accessModes;
    }

    public void setAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
    }

    public Map<String, Object> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
        this.annotations = annotations;
    }

    public ResourceList getCapacity() {
        return capacity;
    }

    public void setCapacity(ResourceList capacity) {
        this.capacity = capacity;
    }

    public ObjectReference getClaimRef() {
        return claimRef;
    }

    public void setClaimRef(ObjectReference claimRef) {
        this.claimRef = claimRef;
    }

    public CSIPersistentVolumeSource getCsi() {
        return csi;
    }

    public void setCsi(CSIPersistentVolumeSource csi) {
        this.csi = csi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersistentVolumeReclaimPolicy() {
        return persistentVolumeReclaimPolicy;
    }

    public void setPersistentVolumeReclaimPolicy(String persistentVolumeReclaimPolicy) {
        this.persistentVolumeReclaimPolicy = persistentVolumeReclaimPolicy;
    }

    public String getStorageClassName() {
        return storageClassName;
    }

    public void setStorageClassName(String storageClassName) {
        this.storageClassName = storageClassName;
    }

    public String getVolumeMode() {
        return volumeMode;
    }

    public void setVolumeMode(String volumeMode) {
        this.volumeMode = volumeMode;
    }

}