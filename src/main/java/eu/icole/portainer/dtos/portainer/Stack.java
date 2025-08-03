package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.gittypes.RepoConfig;
import eu.icole.portainer.dtos.portainer.AutoUpdateSettings;
import eu.icole.portainer.dtos.portainer.Pair;
import eu.icole.portainer.dtos.portainer.ResourceControl;
import eu.icole.portainer.dtos.portainer.StackOption;

import java.util.List;

public class Stack {

    private List<String> AdditionalFiles;
    private AutoUpdateSettings AutoUpdate;
    private Integer EndpointId;
    private String EntryPoint;
    private List<Pair> Env;
    private Integer Id;
    private String Name;
    private StackOption Option;
    private ResourceControl ResourceControl;
    private Integer Status;
    private String SwarmId;
    private Integer Type;
    private String createdBy;
    private Integer creationDate;
    private Boolean fromAppTemplate;
    private RepoConfig gitConfig;
    private String namespace;
    private String projectPath;
    private Integer updateDate;
    private String updatedBy;

    public Stack() {
    }

    public Stack(List<String> AdditionalFiles, AutoUpdateSettings AutoUpdate, Integer EndpointId, String EntryPoint, List<Pair> Env, Integer Id, String Name, StackOption Option, ResourceControl ResourceControl, Integer Status, String SwarmId, Integer Type, String createdBy, Integer creationDate, Boolean fromAppTemplate, RepoConfig gitConfig, String namespace, String projectPath, Integer updateDate, String updatedBy) {
        this.AdditionalFiles = AdditionalFiles;
        this.AutoUpdate = AutoUpdate;
        this.EndpointId = EndpointId;
        this.EntryPoint = EntryPoint;
        this.Env = Env;
        this.Id = Id;
        this.Name = Name;
        this.Option = Option;
        this.ResourceControl = ResourceControl;
        this.Status = Status;
        this.SwarmId = SwarmId;
        this.Type = Type;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.fromAppTemplate = fromAppTemplate;
        this.gitConfig = gitConfig;
        this.namespace = namespace;
        this.projectPath = projectPath;
        this.updateDate = updateDate;
        this.updatedBy = updatedBy;
    }

    public List<String> getAdditionalFiles() {
        return AdditionalFiles;
    }

    public void setAdditionalFiles(List<String> AdditionalFiles) {
        this.AdditionalFiles = AdditionalFiles;
    }

    public AutoUpdateSettings getAutoUpdate() {
        return AutoUpdate;
    }

    public void setAutoUpdate(AutoUpdateSettings AutoUpdate) {
        this.AutoUpdate = AutoUpdate;
    }

    public Integer getEndpointId() {
        return EndpointId;
    }

    public void setEndpointId(Integer EndpointId) {
        this.EndpointId = EndpointId;
    }

    public String getEntryPoint() {
        return EntryPoint;
    }

    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    public List<Pair> getEnv() {
        return Env;
    }

    public void setEnv(List<Pair> Env) {
        this.Env = Env;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public StackOption getOption() {
        return Option;
    }

    public void setOption(StackOption Option) {
        this.Option = Option;
    }

    public ResourceControl getResourceControl() {
        return ResourceControl;
    }

    public void setResourceControl(ResourceControl ResourceControl) {
        this.ResourceControl = ResourceControl;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public String getSwarmId() {
        return SwarmId;
    }

    public void setSwarmId(String SwarmId) {
        this.SwarmId = SwarmId;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getFromAppTemplate() {
        return fromAppTemplate;
    }

    public void setFromAppTemplate(Boolean fromAppTemplate) {
        this.fromAppTemplate = fromAppTemplate;
    }

    public RepoConfig getGitConfig() {
        return gitConfig;
    }

    public void setGitConfig(RepoConfig gitConfig) {
        this.gitConfig = gitConfig;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public Integer getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Integer updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

}