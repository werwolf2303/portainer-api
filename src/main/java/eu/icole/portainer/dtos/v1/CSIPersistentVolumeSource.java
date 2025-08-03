package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.SecretReference;

import java.util.Map;

public class CSIPersistentVolumeSource {

    private SecretReference controllerExpandSecretRef;
    private SecretReference controllerPublishSecretRef;
    private String driver;
    private String fsType;
    private SecretReference nodeExpandSecretRef;
    private SecretReference nodePublishSecretRef;
    private SecretReference nodeStageSecretRef;
    private Boolean readOnly;
    private Map<String, Object> volumeAttributes;
    private String volumeHandle;

    public CSIPersistentVolumeSource() {
    }

    public CSIPersistentVolumeSource(SecretReference controllerExpandSecretRef, SecretReference controllerPublishSecretRef, String driver, String fsType, SecretReference nodeExpandSecretRef, SecretReference nodePublishSecretRef, SecretReference nodeStageSecretRef, Boolean readOnly, Map<String, Object> volumeAttributes, String volumeHandle) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
        this.controllerPublishSecretRef = controllerPublishSecretRef;
        this.driver = driver;
        this.fsType = fsType;
        this.nodeExpandSecretRef = nodeExpandSecretRef;
        this.nodePublishSecretRef = nodePublishSecretRef;
        this.nodeStageSecretRef = nodeStageSecretRef;
        this.readOnly = readOnly;
        this.volumeAttributes = volumeAttributes;
        this.volumeHandle = volumeHandle;
    }

    public SecretReference getControllerExpandSecretRef() {
        return controllerExpandSecretRef;
    }

    public void setControllerExpandSecretRef(SecretReference controllerExpandSecretRef) {
        this.controllerExpandSecretRef = controllerExpandSecretRef;
    }

    public SecretReference getControllerPublishSecretRef() {
        return controllerPublishSecretRef;
    }

    public void setControllerPublishSecretRef(SecretReference controllerPublishSecretRef) {
        this.controllerPublishSecretRef = controllerPublishSecretRef;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getFsType() {
        return fsType;
    }

    public void setFsType(String fsType) {
        this.fsType = fsType;
    }

    public SecretReference getNodeExpandSecretRef() {
        return nodeExpandSecretRef;
    }

    public void setNodeExpandSecretRef(SecretReference nodeExpandSecretRef) {
        this.nodeExpandSecretRef = nodeExpandSecretRef;
    }

    public SecretReference getNodePublishSecretRef() {
        return nodePublishSecretRef;
    }

    public void setNodePublishSecretRef(SecretReference nodePublishSecretRef) {
        this.nodePublishSecretRef = nodePublishSecretRef;
    }

    public SecretReference getNodeStageSecretRef() {
        return nodeStageSecretRef;
    }

    public void setNodeStageSecretRef(SecretReference nodeStageSecretRef) {
        this.nodeStageSecretRef = nodeStageSecretRef;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public Map<String, Object> getVolumeAttributes() {
        return volumeAttributes;
    }

    public void setVolumeAttributes(Map<String, Object> volumeAttributes) {
        this.volumeAttributes = volumeAttributes;
    }

    public String getVolumeHandle() {
        return volumeHandle;
    }

    public void setVolumeHandle(String volumeHandle) {
        this.volumeHandle = volumeHandle;
    }

}