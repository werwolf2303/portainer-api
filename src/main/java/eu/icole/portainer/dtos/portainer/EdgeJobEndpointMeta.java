package eu.icole.portainer.dtos.portainer;


public class EdgeJobEndpointMeta {

    private Boolean collectLogs;
    private Integer logsStatus;

    public EdgeJobEndpointMeta() {
    }

    public EdgeJobEndpointMeta(Boolean collectLogs, Integer logsStatus) {
        this.collectLogs = collectLogs;
        this.logsStatus = logsStatus;
    }

    public Boolean getCollectLogs() {
        return collectLogs;
    }

    public void setCollectLogs(Boolean collectLogs) {
        this.collectLogs = collectLogs;
    }

    public Integer getLogsStatus() {
        return logsStatus;
    }

    public void setLogsStatus(Integer logsStatus) {
        this.logsStatus = logsStatus;
    }

}