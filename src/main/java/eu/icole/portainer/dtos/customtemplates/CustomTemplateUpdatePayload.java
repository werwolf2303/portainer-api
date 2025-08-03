package eu.icole.portainer.dtos.customtemplates;

import eu.icole.portainer.dtos.portainer.CustomTemplateVariableDefinition;

import java.util.List;

public class CustomTemplateUpdatePayload {

    private String composeFilePathInRepository;
    private String description;
    private Boolean edgeTemplate;
    private String fileContent;
    private Boolean isComposeFormat;
    private String logo;
    private String note;
    private Integer platform;
    private Boolean repositoryAuthentication;
    private Integer repositoryGitCredentialID;
    private String repositoryPassword;
    private String repositoryReferenceName;
    private String repositoryURL;
    private String repositoryUsername;
    private String title;
    private Boolean tlsskipVerify;
    private Integer type;
    private List<CustomTemplateVariableDefinition> variables;

    public CustomTemplateUpdatePayload() {
    }

    public CustomTemplateUpdatePayload(String composeFilePathInRepository, String description, Boolean edgeTemplate, String fileContent, Boolean isComposeFormat, String logo, String note, Integer platform, Boolean repositoryAuthentication, Integer repositoryGitCredentialID, String repositoryPassword, String repositoryReferenceName, String repositoryURL, String repositoryUsername, String title, Boolean tlsskipVerify, Integer type, List<CustomTemplateVariableDefinition> variables) {
        this.composeFilePathInRepository = composeFilePathInRepository;
        this.description = description;
        this.edgeTemplate = edgeTemplate;
        this.fileContent = fileContent;
        this.isComposeFormat = isComposeFormat;
        this.logo = logo;
        this.note = note;
        this.platform = platform;
        this.repositoryAuthentication = repositoryAuthentication;
        this.repositoryGitCredentialID = repositoryGitCredentialID;
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

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
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

    public Integer getRepositoryGitCredentialID() {
        return repositoryGitCredentialID;
    }

    public void setRepositoryGitCredentialID(Integer repositoryGitCredentialID) {
        this.repositoryGitCredentialID = repositoryGitCredentialID;
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