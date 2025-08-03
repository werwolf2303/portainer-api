package eu.icole.portainer.dtos.stacks;

import eu.icole.portainer.dtos.portainer.AutoUpdateSettings;
import eu.icole.portainer.dtos.portainer.Pair;

import java.util.List;

public class SwarmStackFromGitRepositoryPayload {

    private List<String> additionalFiles;
    private AutoUpdateSettings autoUpdate;
    private String composeFile;
    private List<Pair> env;
    private Boolean fromAppTemplate;
    private String name;
    private Boolean repositoryAuthentication;
    private String repositoryPassword;
    private String repositoryReferenceName;
    private String repositoryURL;
    private String repositoryUsername;
    private String swarmID;
    private Boolean tlsskipVerify;

    public SwarmStackFromGitRepositoryPayload() {
    }

    public SwarmStackFromGitRepositoryPayload(List<String> additionalFiles, AutoUpdateSettings autoUpdate, String composeFile, List<Pair> env, Boolean fromAppTemplate, String name, Boolean repositoryAuthentication, String repositoryPassword, String repositoryReferenceName, String repositoryURL, String repositoryUsername, String swarmID, Boolean tlsskipVerify) {
        this.additionalFiles = additionalFiles;
        this.autoUpdate = autoUpdate;
        this.composeFile = composeFile;
        this.env = env;
        this.fromAppTemplate = fromAppTemplate;
        this.name = name;
        this.repositoryAuthentication = repositoryAuthentication;
        this.repositoryPassword = repositoryPassword;
        this.repositoryReferenceName = repositoryReferenceName;
        this.repositoryURL = repositoryURL;
        this.repositoryUsername = repositoryUsername;
        this.swarmID = swarmID;
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

    public String getComposeFile() {
        return composeFile;
    }

    public void setComposeFile(String composeFile) {
        this.composeFile = composeFile;
    }

    public List<Pair> getEnv() {
        return env;
    }

    public void setEnv(List<Pair> env) {
        this.env = env;
    }

    public Boolean getFromAppTemplate() {
        return fromAppTemplate;
    }

    public void setFromAppTemplate(Boolean fromAppTemplate) {
        this.fromAppTemplate = fromAppTemplate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSwarmID() {
        return swarmID;
    }

    public void setSwarmID(String swarmID) {
        this.swarmID = swarmID;
    }

    public Boolean getTlsskipVerify() {
        return tlsskipVerify;
    }

    public void setTlsskipVerify(Boolean tlsskipVerify) {
        this.tlsskipVerify = tlsskipVerify;
    }

}