package eu.icole.portainer.dtos.gittypes;

import eu.icole.portainer.dtos.gittypes.GitAuthentication;

public class RepoConfig {

    private GitAuthentication authentication;
    private String configFilePath;
    private String configHash;
    private String referenceName;
    private Boolean tlsskipVerify;
    private String url;

    public RepoConfig() {
    }

    public RepoConfig(GitAuthentication authentication, String configFilePath, String configHash, String referenceName, Boolean tlsskipVerify, String url) {
        this.authentication = authentication;
        this.configFilePath = configFilePath;
        this.configHash = configHash;
        this.referenceName = referenceName;
        this.tlsskipVerify = tlsskipVerify;
        this.url = url;
    }

    public GitAuthentication getAuthentication() {
        return authentication;
    }

    public void setAuthentication(GitAuthentication authentication) {
        this.authentication = authentication;
    }

    public String getConfigFilePath() {
        return configFilePath;
    }

    public void setConfigFilePath(String configFilePath) {
        this.configFilePath = configFilePath;
    }

    public String getConfigHash() {
        return configHash;
    }

    public void setConfigHash(String configHash) {
        this.configHash = configHash;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public Boolean getTlsskipVerify() {
        return tlsskipVerify;
    }

    public void setTlsskipVerify(Boolean tlsskipVerify) {
        this.tlsskipVerify = tlsskipVerify;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}