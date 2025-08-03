package eu.icole.portainer.dtos.edge;

import eu.icole.portainer.dtos.edge.DeployerOptionsPayload;
import eu.icole.portainer.dtos.edge.RegistryCredentials;
import eu.icole.portainer.dtos.filesystem.DirEntry;
import eu.icole.portainer.dtos.portainer.Pair;

import java.util.List;

public class StackPayload {

    private DeployerOptionsPayload deployerOptionsPayload;
    private List<DirEntry> dirEntries;
    private Integer edgeUpdateID;
    private String entryFileName;
    private List<Pair> envVars;
    private String filesystemPath;
    private Integer id;
    private String name;
    private String namespace;
    private Boolean prePullImage;
    private Boolean rePullImage;
    private Boolean readyRePullImage;
    private List<RegistryCredentials> registryCredentials;
    private Boolean retryDeploy;
    private Integer retryPeriod;
    private Integer rollbackTo;
    private String stackFileContent;
    private Boolean supportRelativePath;
    private Integer version;

    public StackPayload() {
    }

    public StackPayload(DeployerOptionsPayload deployerOptionsPayload, List<DirEntry> dirEntries, Integer edgeUpdateID, String entryFileName, List<Pair> envVars, String filesystemPath, Integer id, String name, String namespace, Boolean prePullImage, Boolean rePullImage, Boolean readyRePullImage, List<RegistryCredentials> registryCredentials, Boolean retryDeploy, Integer retryPeriod, Integer rollbackTo, String stackFileContent, Boolean supportRelativePath, Integer version) {
        this.deployerOptionsPayload = deployerOptionsPayload;
        this.dirEntries = dirEntries;
        this.edgeUpdateID = edgeUpdateID;
        this.entryFileName = entryFileName;
        this.envVars = envVars;
        this.filesystemPath = filesystemPath;
        this.id = id;
        this.name = name;
        this.namespace = namespace;
        this.prePullImage = prePullImage;
        this.rePullImage = rePullImage;
        this.readyRePullImage = readyRePullImage;
        this.registryCredentials = registryCredentials;
        this.retryDeploy = retryDeploy;
        this.retryPeriod = retryPeriod;
        this.rollbackTo = rollbackTo;
        this.stackFileContent = stackFileContent;
        this.supportRelativePath = supportRelativePath;
        this.version = version;
    }

    public DeployerOptionsPayload getDeployerOptionsPayload() {
        return deployerOptionsPayload;
    }

    public void setDeployerOptionsPayload(DeployerOptionsPayload deployerOptionsPayload) {
        this.deployerOptionsPayload = deployerOptionsPayload;
    }

    public List<DirEntry> getDirEntries() {
        return dirEntries;
    }

    public void setDirEntries(List<DirEntry> dirEntries) {
        this.dirEntries = dirEntries;
    }

    public Integer getEdgeUpdateID() {
        return edgeUpdateID;
    }

    public void setEdgeUpdateID(Integer edgeUpdateID) {
        this.edgeUpdateID = edgeUpdateID;
    }

    public String getEntryFileName() {
        return entryFileName;
    }

    public void setEntryFileName(String entryFileName) {
        this.entryFileName = entryFileName;
    }

    public List<Pair> getEnvVars() {
        return envVars;
    }

    public void setEnvVars(List<Pair> envVars) {
        this.envVars = envVars;
    }

    public String getFilesystemPath() {
        return filesystemPath;
    }

    public void setFilesystemPath(String filesystemPath) {
        this.filesystemPath = filesystemPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public Boolean getPrePullImage() {
        return prePullImage;
    }

    public void setPrePullImage(Boolean prePullImage) {
        this.prePullImage = prePullImage;
    }

    public Boolean getRePullImage() {
        return rePullImage;
    }

    public void setRePullImage(Boolean rePullImage) {
        this.rePullImage = rePullImage;
    }

    public Boolean getReadyRePullImage() {
        return readyRePullImage;
    }

    public void setReadyRePullImage(Boolean readyRePullImage) {
        this.readyRePullImage = readyRePullImage;
    }

    public List<RegistryCredentials> getRegistryCredentials() {
        return registryCredentials;
    }

    public void setRegistryCredentials(List<RegistryCredentials> registryCredentials) {
        this.registryCredentials = registryCredentials;
    }

    public Boolean getRetryDeploy() {
        return retryDeploy;
    }

    public void setRetryDeploy(Boolean retryDeploy) {
        this.retryDeploy = retryDeploy;
    }

    public Integer getRetryPeriod() {
        return retryPeriod;
    }

    public void setRetryPeriod(Integer retryPeriod) {
        this.retryPeriod = retryPeriod;
    }

    public Integer getRollbackTo() {
        return rollbackTo;
    }

    public void setRollbackTo(Integer rollbackTo) {
        this.rollbackTo = rollbackTo;
    }

    public String getStackFileContent() {
        return stackFileContent;
    }

    public void setStackFileContent(String stackFileContent) {
        this.stackFileContent = stackFileContent;
    }

    public Boolean getSupportRelativePath() {
        return supportRelativePath;
    }

    public void setSupportRelativePath(Boolean supportRelativePath) {
        this.supportRelativePath = supportRelativePath;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}