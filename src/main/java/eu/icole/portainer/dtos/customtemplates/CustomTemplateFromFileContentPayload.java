package eu.icole.portainer.dtos.customtemplates;

import eu.icole.portainer.dtos.portainer.CustomTemplateVariableDefinition;

import java.util.List;

public class CustomTemplateFromFileContentPayload {

    private String description;
    private Boolean edgeTemplate;
    private String fileContent;
    private String logo;
    private String note;
    private Integer platform;
    private String title;
    private Integer type;
    private List<CustomTemplateVariableDefinition> variables;

    public CustomTemplateFromFileContentPayload() {
    }

    public CustomTemplateFromFileContentPayload(String description, Boolean edgeTemplate, String fileContent, String logo, String note, Integer platform, String title, Integer type, List<CustomTemplateVariableDefinition> variables) {
        this.description = description;
        this.edgeTemplate = edgeTemplate;
        this.fileContent = fileContent;
        this.logo = logo;
        this.note = note;
        this.platform = platform;
        this.title = title;
        this.type = type;
        this.variables = variables;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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