package eu.icole.portainer.dtos.registries;

import eu.icole.portainer.dtos.portainer.EcrData;
import eu.icole.portainer.dtos.portainer.GitlabRegistryData;
import eu.icole.portainer.dtos.portainer.QuayRegistryData;

public class RegistryCreatePayload {

    private Boolean authentication;
    private String baseURL;
    private EcrData ecr;
    private GitlabRegistryData gitlab;
    private String name;
    private String password;
    private QuayRegistryData quay;
    private Integer type;
    private String url;
    private String username;

    public RegistryCreatePayload() {
    }

    public RegistryCreatePayload(Boolean authentication, String baseURL, EcrData ecr, GitlabRegistryData gitlab, String name, String password, QuayRegistryData quay, Integer type, String url, String username) {
        this.authentication = authentication;
        this.baseURL = baseURL;
        this.ecr = ecr;
        this.gitlab = gitlab;
        this.name = name;
        this.password = password;
        this.quay = quay;
        this.type = type;
        this.url = url;
        this.username = username;
    }

    public Boolean getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Boolean authentication) {
        this.authentication = authentication;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public EcrData getEcr() {
        return ecr;
    }

    public void setEcr(EcrData ecr) {
        this.ecr = ecr;
    }

    public GitlabRegistryData getGitlab() {
        return gitlab;
    }

    public void setGitlab(GitlabRegistryData gitlab) {
        this.gitlab = gitlab;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public QuayRegistryData getQuay() {
        return quay;
    }

    public void setQuay(QuayRegistryData quay) {
        this.quay = quay;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}