package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.gittypes.RepoConfig;
import eu.icole.portainer.dtos.portainer.CustomTemplateVariableDefinition;
import eu.icole.portainer.dtos.portainer.ResourceControl;

import java.util.List;

public class CustomTemplate {

    private Integer CreatedByUserId;
    private String Description;
    private String EntryPoint;
    private RepoConfig GitConfig;
    private Integer Id;
    private String Logo;
    private String Note;
    private Integer Platform;
    private String ProjectPath;
    private ResourceControl ResourceControl;
    private String Title;
    private Integer Type;
    private Boolean edgeTemplate;
    private Boolean isComposeFormat;
    private List<CustomTemplateVariableDefinition> variables;

    public CustomTemplate() {
    }

    public CustomTemplate(Integer CreatedByUserId, String Description, String EntryPoint, RepoConfig GitConfig, Integer Id, String Logo, String Note, Integer Platform, String ProjectPath, ResourceControl ResourceControl, String Title, Integer Type, Boolean edgeTemplate, Boolean isComposeFormat, List<CustomTemplateVariableDefinition> variables) {
        this.CreatedByUserId = CreatedByUserId;
        this.Description = Description;
        this.EntryPoint = EntryPoint;
        this.GitConfig = GitConfig;
        this.Id = Id;
        this.Logo = Logo;
        this.Note = Note;
        this.Platform = Platform;
        this.ProjectPath = ProjectPath;
        this.ResourceControl = ResourceControl;
        this.Title = Title;
        this.Type = Type;
        this.edgeTemplate = edgeTemplate;
        this.isComposeFormat = isComposeFormat;
        this.variables = variables;
    }

    public Integer getCreatedByUserId() {
        return CreatedByUserId;
    }

    public void setCreatedByUserId(Integer CreatedByUserId) {
        this.CreatedByUserId = CreatedByUserId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getEntryPoint() {
        return EntryPoint;
    }

    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    public RepoConfig getGitConfig() {
        return GitConfig;
    }

    public void setGitConfig(RepoConfig GitConfig) {
        this.GitConfig = GitConfig;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getLogo() {
        return Logo;
    }

    public void setLogo(String Logo) {
        this.Logo = Logo;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public Integer getPlatform() {
        return Platform;
    }

    public void setPlatform(Integer Platform) {
        this.Platform = Platform;
    }

    public String getProjectPath() {
        return ProjectPath;
    }

    public void setProjectPath(String ProjectPath) {
        this.ProjectPath = ProjectPath;
    }

    public ResourceControl getResourceControl() {
        return ResourceControl;
    }

    public void setResourceControl(ResourceControl ResourceControl) {
        this.ResourceControl = ResourceControl;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
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

    public List<CustomTemplateVariableDefinition> getVariables() {
        return variables;
    }

    public void setVariables(List<CustomTemplateVariableDefinition> variables) {
        this.variables = variables;
    }

}