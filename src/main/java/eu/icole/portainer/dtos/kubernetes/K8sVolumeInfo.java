package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.K8sPersistentVolume;
import eu.icole.portainer.dtos.kubernetes.K8sPersistentVolumeClaim;
import eu.icole.portainer.dtos.kubernetes.K8sStorageClass;

public class K8sVolumeInfo {

    private K8sPersistentVolume persistentVolume;
    private K8sPersistentVolumeClaim persistentVolumeClaim;
    private K8sStorageClass storageClass;

    public K8sVolumeInfo() {
    }

    public K8sVolumeInfo(K8sPersistentVolume persistentVolume, K8sPersistentVolumeClaim persistentVolumeClaim, K8sStorageClass storageClass) {
        this.persistentVolume = persistentVolume;
        this.persistentVolumeClaim = persistentVolumeClaim;
        this.storageClass = storageClass;
    }

    public K8sPersistentVolume getPersistentVolume() {
        return persistentVolume;
    }

    public void setPersistentVolume(K8sPersistentVolume persistentVolume) {
        this.persistentVolume = persistentVolume;
    }

    public K8sPersistentVolumeClaim getPersistentVolumeClaim() {
        return persistentVolumeClaim;
    }

    public void setPersistentVolumeClaim(K8sPersistentVolumeClaim persistentVolumeClaim) {
        this.persistentVolumeClaim = persistentVolumeClaim;
    }

    public K8sStorageClass getStorageClass() {
        return storageClass;
    }

    public void setStorageClass(K8sStorageClass storageClass) {
        this.storageClass = storageClass;
    }

}