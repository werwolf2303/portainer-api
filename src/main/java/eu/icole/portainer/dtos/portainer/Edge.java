package eu.icole.portainer.dtos.portainer;


public class Edge {

    private Boolean AsyncMode;
    private Integer CommandInterval;
    private Integer PingInterval;
    private Integer SnapshotInterval;

    public Edge() {
    }

    public Edge(Boolean AsyncMode, Integer CommandInterval, Integer PingInterval, Integer SnapshotInterval) {
        this.AsyncMode = AsyncMode;
        this.CommandInterval = CommandInterval;
        this.PingInterval = PingInterval;
        this.SnapshotInterval = SnapshotInterval;
    }

    public Boolean getAsyncMode() {
        return AsyncMode;
    }

    public void setAsyncMode(Boolean AsyncMode) {
        this.AsyncMode = AsyncMode;
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

}