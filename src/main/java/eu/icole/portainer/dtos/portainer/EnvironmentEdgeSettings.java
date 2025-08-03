package eu.icole.portainer.dtos.portainer;


public class EnvironmentEdgeSettings {

    private Integer CommandInterval;
    private Integer PingInterval;
    private Integer SnapshotInterval;
    private Boolean asyncMode;

    public EnvironmentEdgeSettings() {
    }

    public EnvironmentEdgeSettings(Integer CommandInterval, Integer PingInterval, Integer SnapshotInterval, Boolean asyncMode) {
        this.CommandInterval = CommandInterval;
        this.PingInterval = PingInterval;
        this.SnapshotInterval = SnapshotInterval;
        this.asyncMode = asyncMode;
    }

    public Integer getCommandInterval() {
        return CommandInterval;
    }

    public void setCommandInterval(Integer CommandInterval) {
        this.CommandInterval = CommandInterval;
    }

    public Integer getPingInterval() {
        return PingInterval;
    }

    public void setPingInterval(Integer PingInterval) {
        this.PingInterval = PingInterval;
    }

    public Integer getSnapshotInterval() {
        return SnapshotInterval;
    }

    public void setSnapshotInterval(Integer SnapshotInterval) {
        this.SnapshotInterval = SnapshotInterval;
    }

    public Boolean getAsyncMode() {
        return asyncMode;
    }

    public void setAsyncMode(Boolean asyncMode) {
        this.asyncMode = asyncMode;
    }

}