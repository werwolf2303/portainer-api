package eu.icole.portainer.dtos.portainer;


public class GitlabRegistryData {

    private String InstanceURL;
    private Integer ProjectId;
    private String ProjectPath;

    public GitlabRegistryData() {
    }

    public GitlabRegistryData(String InstanceURL, Integer ProjectId, String ProjectPath) {
        this.InstanceURL = InstanceURL;
        this.ProjectId = ProjectId;
        this.ProjectPath = ProjectPath;
    }

    public String getInstanceURL() {
        return InstanceURL;
    }

    public void setInstanceURL(String InstanceURL) {
        this.InstanceURL = InstanceURL;
    }

    public Integer getProjectId() {
        return ProjectId;
    }

    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    public String getProjectPath() {
        return ProjectPath;
    }

    public void setProjectPath(String ProjectPath) {
        this.ProjectPath = ProjectPath;
    }

}