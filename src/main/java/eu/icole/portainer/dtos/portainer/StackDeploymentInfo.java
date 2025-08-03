package eu.icole.portainer.dtos.portainer;


public class StackDeploymentInfo {

    private String ConfigHash;
    private Integer FileVersion;
    private Integer Version;

    public StackDeploymentInfo() {
    }

    public StackDeploymentInfo(String ConfigHash, Integer FileVersion, Integer Version) {
        this.ConfigHash = ConfigHash;
        this.FileVersion = FileVersion;
        this.Version = Version;
    }

    public String getConfigHash() {
        return ConfigHash;
    }

    public void setConfigHash(String ConfigHash) {
        this.ConfigHash = ConfigHash;
    }

    public Integer getFileVersion() {
        return FileVersion;
    }

    public void setFileVersion(Integer FileVersion) {
        this.FileVersion = FileVersion;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer Version) {
        this.Version = Version;
    }

}