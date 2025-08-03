package eu.icole.portainer.dtos.stacks;

import eu.icole.portainer.dtos.portainer.AutoUpdateSettings;

import java.util.List;

public class KubernetesGitDeploymentPayload {

    private List<String> additionalFiles;
    private AutoUpdateSettings autoUpdate;
    private Boolean composeFormat;
    private String manifestFile;
    private String namespace;
    private Boolean repositoryAuthentication;
    private String repositoryPassword;
    private String repositoryReferenceName;
    private String repositoryURL;
    private String repositoryUsername;
    private String stackName;
    private Boolean tlsskipVerify;

    public KubernetesGitDeploymentPayload() {
    }

    public KubernetesGitDeploymentPayload(List<String> additionalFiles, AutoUpdateSettings autoUpdate, Boolean composeFormat, String manifestFile, String namespace, Boolean repositoryAuthentication, String repositoryPassword, String repositoryReferenceName, String repositoryURL, String repositoryUsername, String stackName, Boolean tlsskipVerify) {
        this.additionalFiles = additionalFiles;
        this.autoUpdate = autoUpdate;
        this.composeFormat = composeFormat;
        this.manifestFile = manifestFile;
        this.namespace = namespace;
        this.repositoryAuthentication = repositoryAuthentication;
        this.repositoryPassword = repositoryPassword;
        this.repositoryReferenceName = repositoryReferenceName;
        this.repositoryURL = repositoryURL;
        this.repositoryUsername = repositoryUsername;
        this.stackName = stackName;
        this.tlsskipVerify = tlsskipVerify;
    }

    public List<String> getAdditionalFiles() {
        return additionalFiles;
    }

    public void setAdditionalFiles(List<String> additionalFiles) {
        this.additionalFiles = additionalFiles;
    }

    public AutoUpdateSettings getAutoUpdate() {
        return autoUpdate;
    }

    public void setAutoUpdate(AutoUpdateSettings autoUpdate) {
        this.autoUpdate = autoUpdate;
    }

    public Boolean getComposeFormat() {
        return composeFormat;
    }

    public void setComposeFormat(Boolean composeFormat) {
        this.composeFormat = composeFormat;
    }

    public String getManifestFile() {
        return manifestFile;
    }

    public void setManifestFile(String manifestFile) {
        this.manifestFile = manifestFile;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
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

    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    public Boolean getTlsskipVerify() {
        return tlsskipVerify;
    }

    public void setTlsskipVerify(Boolean tlsskipVerify) {
        this.tlsskipVerify = tlsskipVerify;
    }

}