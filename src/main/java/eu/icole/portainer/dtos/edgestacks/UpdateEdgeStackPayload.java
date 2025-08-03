package eu.icole.portainer.dtos.edgestacks;

import java.util.List;

public class UpdateEdgeStackPayload {

    private Integer deploymentType;
    private List<Integer> edgeGroups;
    private String stackFileContent;
    private Boolean updateVersion;
    private Boolean useManifestNamespaces;

    public UpdateEdgeStackPayload() {
    }

    public UpdateEdgeStackPayload(Integer deploymentType, List<Integer> edgeGroups, String stackFileContent, Boolean updateVersion, Boolean useManifestNamespaces) {
        this.deploymentType = deploymentType;
        this.edgeGroups = edgeGroups;
        this.stackFileContent = stackFileContent;
        this.updateVersion = updateVersion;
        this.useManifestNamespaces = useManifestNamespaces;
    }

    public Integer getDeploymentType() {
        return deploymentType;
    }

    public void setDeploymentType(Integer deploymentType) {
        this.deploymentType = deploymentType;
    }

    public List<Integer> getEdgeGroups() {
        return edgeGroups;
    }

    public void setEdgeGroups(List<Integer> edgeGroups) {
        this.edgeGroups = edgeGroups;
    }

    public String getStackFileContent() {
        return stackFileContent;
    }

    public void setStackFileContent(String stackFileContent) {
        this.stackFileContent = stackFileContent;
    }

    public Boolean getUpdateVersion() {
        return updateVersion;
    }

    public void setUpdateVersion(Boolean updateVersion) {
        this.updateVersion = updateVersion;
    }

    public Boolean getUseManifestNamespaces() {
        return useManifestNamespaces;
    }

    public void setUseManifestNamespaces(Boolean useManifestNamespaces) {
        this.useManifestNamespaces = useManifestNamespaces;
    }

}