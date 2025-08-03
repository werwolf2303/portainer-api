package eu.icole.portainer.dtos.edgestacks;

import java.util.List;

public class EdgeStackFromStringPayload {

    private Integer deploymentType;
    private List<Integer> edgeGroups;
    private String name;
    private List<Integer> registries;
    private String stackFileContent;
    private Boolean useManifestNamespaces;

    public EdgeStackFromStringPayload() {
    }

    public EdgeStackFromStringPayload(Integer deploymentType, List<Integer> edgeGroups, String name, List<Integer> registries, String stackFileContent, Boolean useManifestNamespaces) {
        this.deploymentType = deploymentType;
        this.edgeGroups = edgeGroups;
        this.name = name;
        this.registries = registries;
        this.stackFileContent = stackFileContent;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getRegistries() {
        return registries;
    }

    public void setRegistries(List<Integer> registries) {
        this.registries = registries;
    }

    public String getStackFileContent() {
        return stackFileContent;
    }

    public void setStackFileContent(String stackFileContent) {
        this.stackFileContent = stackFileContent;
    }

    public Boolean getUseManifestNamespaces() {
        return useManifestNamespaces;
    }

    public void setUseManifestNamespaces(Boolean useManifestNamespaces) {
        this.useManifestNamespaces = useManifestNamespaces;
    }

}