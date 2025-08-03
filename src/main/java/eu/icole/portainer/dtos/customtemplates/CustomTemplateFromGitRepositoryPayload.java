package eu.icole.portainer.dtos.customtemplates;

import eu.icole.portainer.dtos.portainer.CustomTemplateVariableDefinition;

import java.util.List;

public class CustomTemplateFromGitRepositoryPayload {

    private String composeFilePathInRepository;
    private String description;
    private Boolean edgeTemplate;
    private Boolean isComposeFormat;
    private String logo;
    private String note;
    private Integer platform;
    private Boolean repositoryAuthentication;
    private String repositoryPassword;
    private String repositoryReferenceName;
    private String repositoryURL;
    private String repositoryUsername;
    private String title;
    private Boolean tlsskipVerify;
    private Integer type;
    private List<CustomTemplateVariableDefinition> variables;

    public CustomTemplateFromGitRepositoryPayload() {
    }

    public CustomTemplateFromGitRepositoryPayload(String composeFilePathInRepository, String description, Boolean edgeTemplate, Boolean isComposeFormat, String logo, String note, Integer platform, Boolean repositoryAuthentication, String repositoryPassword, String repositoryReferenceName, String repositoryURL, String repositoryUsername, String title, Boolean tlsskipVerify, Integer type, List<CustomTemplateVariableDefinition> variables) {
        this.composeFilePathInRepository = composeFilePathInRepository;
        this.description = description;
        this.edgeTemplate = edgeTemplate;
        this.isComposeFormat = isComposeFormat;
        this.logo = logo;
        this.note = note;
        this.platform = platform;
        this.repositoryAuthentication = repositoryAuthentication;
        this.repositoryPassword = repositoryPassword;
        this.repositoryReferenceName = repositoryReferenceName;
        this.repositoryURL = repositoryURL;
        this.repositoryUsername = repositoryUsername;
        this.title = title;
        this.tlsskipVerify = tlsskipVerify;
        this.type = type;
        this.variables = variables;
    }

    public String getComposeFilePathInRepository() {
        return composeFilePathInRepository;
    }

    public void setComposeFilePathInRepository(String composeFilePathInRepository) {
        this.composeFilePathInRepository = composeFilePathInRepository;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEdgeTemplate() {
        return edgeTemplate;
    }

    public void setEdgeTemplate(Boolean edgeTemplate) {
        this.edgeTemplate = edgeTemplate;
    }

    public Boolean getIsComposeFormat() {
        return isComposeFormat;
    }

    public void setIsComposeFormat(Boolean isComposeFormat) {
        this.isComposeFormat = isComposeFormat;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getPlatform() {
        return platform;
    }

    public void setPlatform(Integer platform) {
        this.platform = platform;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getTlsskipVerify() {
        return tlsskipVerify;
    }

    public void setTlsskipVerify(Boolean tlsskipVerify) {
        this.tlsskipVerify = tlsskipVerify;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<CustomTemplateVariableDefinition> getVariables() {
        return variables;
    }

    public void setVariables(List<CustomTemplateVariableDefinition> variables) {
        this.variables = variables;
    }

}