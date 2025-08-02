package eu.icole.portainer.dtos;

public class EnvironmentEdgeSettings {
    private int CommandInterval;
    private int PingInterval;
    private int SnapshotInterval;
    private boolean asyncMode;

    public int getCommandInterval() {
        return CommandInterval;
    }

    public int getPingInterval() {
        return PingInterval;
    }

    public int getSnapshotInterval() {
        return SnapshotInterval;
    }

    public boolean isAsyncMode() {
        return asyncMode;
    }
}
