package eu.icole.portainer.dtos.portainer;

import java.util.List;
import java.util.Map;

public class EdgeStack {

    private Integer CreationDate;
    private Integer DeploymentType;
    private List<Integer> EdgeGroups;
    private String EntryPoint;
    private Integer Id;
    private String ManifestPath;
    private String Name;
    private Integer NumDeployments;
    private String ProjectPath;
    private Map<String, Object> Status;
    private Integer Version;
    private Boolean useManifestNamespaces;

    public EdgeStack() {
    }

    public EdgeStack(Integer CreationDate, Integer DeploymentType, List<Integer> EdgeGroups, String EntryPoint, Integer Id, String ManifestPath, String Name, Integer NumDeployments, String ProjectPath, Map<String, Object> Status, Integer Version, Boolean useManifestNamespaces) {
        this.CreationDate = CreationDate;
        this.DeploymentType = DeploymentType;
        this.EdgeGroups = EdgeGroups;
        this.EntryPoint = EntryPoint;
        this.Id = Id;
        this.ManifestPath = ManifestPath;
        this.Name = Name;
        this.NumDeployments = NumDeployments;
        this.ProjectPath = ProjectPath;
        this.Status = Status;
        this.Version = Version;
        this.useManifestNamespaces = useManifestNamespaces;
    }

    public Integer getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Integer CreationDate) {
        this.CreationDate = CreationDate;
    }

    public Integer getDeploymentType() {
        return DeploymentType;
    }

    public void setDeploymentType(Integer DeploymentType) {
        this.DeploymentType = DeploymentType;
    }

    public List<Integer> getEdgeGroups() {
        return EdgeGroups;
    }

    public void setEdgeGroups(List<Integer> EdgeGroups) {
        this.EdgeGroups = EdgeGroups;
    }

    public String getEntryPoint() {
        return EntryPoint;
    }

    public void setEntryPoint(String EntryPoint) {
        this.EntryPoint = EntryPoint;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getManifestPath() {
        return ManifestPath;
    }

    public void setManifestPath(String ManifestPath) {
        this.ManifestPath = ManifestPath;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getNumDeployments() {
        return NumDeployments;
    }

    public void setNumDeployments(Integer NumDeployments) {
        this.NumDeployments = NumDeployments;
    }

    public String getProjectPath() {
        return ProjectPath;
    }

    public void setProjectPath(String ProjectPath) {
        this.ProjectPath = ProjectPath;
    }

    public Map<String, Object> getStatus() {
        return Status;
    }

    public void setStatus(Map<String, Object> Status) {
        this.Status = Status;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer Version) {
        this.Version = Version;
    }

    public Boolean getUseManifestNamespaces() {
        return useManifestNamespaces;
    }

    public void setUseManifestNamespaces(Boolean useManifestNamespaces) {
        this.useManifestNamespaces = useManifestNamespaces;
    }

}