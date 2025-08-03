package eu.icole.portainer.dtos.edgestacks;

import java.util.List;

public class EdgeStackFromGitRepositoryPayload {

    private Integer deploymentType;
    private List<Integer> edgeGroups;
    private String filePathInRepository;
    private String name;
    private List<Integer> registries;
    private Boolean repositoryAuthentication;
    private String repositoryPassword;
    private String repositoryReferenceName;
    private String repositoryURL;
    private String repositoryUsername;
    private Boolean tlsskipVerify;
    private Boolean useManifestNamespaces;

    public EdgeStackFromGitRepositoryPayload() {
    }

    public EdgeStackFromGitRepositoryPayload(Integer deploymentType, List<Integer> edgeGroups, String filePathInRepository, String name, List<Integer> registries, Boolean repositoryAuthentication, String repositoryPassword, String repositoryReferenceName, String repositoryURL, String repositoryUsername, Boolean tlsskipVerify, Boolean useManifestNamespaces) {
        this.deploymentType = deploymentType;
        this.edgeGroups = edgeGroups;
        this.filePathInRepository = filePathInRepository;
        this.name = name;
        this.registries = registries;
        this.repositoryAuthentication = repositoryAuthentication;
        this.repositoryPassword = repositoryPassword;
        this.repositoryReferenceName = repositoryReferenceName;
        this.repositoryURL = repositoryURL;
        this.repositoryUsername = repositoryUsername;
        this.tlsskipVerify = tlsskipVerify;
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

    public String getFilePathInRepository() {
        return filePathInRepository;
    }

    public void setFilePathInRepository(String filePathInRepository) {
        this.filePathInRepository = filePathInRepository;
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

    public Boolean getRepositoryAuthentication() {
        return repositoryAuthentication;
    }

    public void setRepositoryAuthentication(Boolean repositoryAuthentication) {
        this.repositoryAuthentication = repositoryAuthentication;
    }

    public String getRepositoryPassword() {
        return repositoryPassword;
    }

    public void setRepositoryPassword(String repositoryPassword) {
        this.repositoryPassword = repositoryPassword;
    }

    public String getRepositoryReferenceName() {
        return repositoryReferenceName;
    }

    public void setRepositoryReferenceName(String repositoryReferenceName) {
        this.repositoryReferenceName = repositoryReferenceName;
    }

    public String getRepositoryURL() {
        return repositoryURL;
    }

    public void setRepositoryURL(String repositoryURL) {
        this.repositoryURL = repositoryURL;
    }

    public String getRepositoryUsername() {
        return repositoryUsername;
    }

    public void setRepositoryUsername(String repositoryUsername) {
        this.repositoryUsername = repositoryUsername;
    }

    public Boolean getTlsskipVerify() {
        return tlsskipVerify;
    }

    public void setTlsskipVerify(Boolean tlsskipVerify) {
        this.tlsskipVerify = tlsskipVerify;
    }

    public Boolean getUseManifestNamespaces() {
        return useManifestNamespaces;
    }

    public void setUseManifestNamespaces(Boolean useManifestNamespaces) {
        this.useManifestNamespaces = useManifestNamespaces;
    }

}