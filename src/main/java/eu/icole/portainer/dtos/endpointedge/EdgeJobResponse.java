package eu.icole.portainer.dtos.endpointedge;


public class EdgeJobResponse {

    private Boolean CollectLogs;
    private String CronExpression;
    private Integer Id;
    private String Script;
    private Integer Version;

    public EdgeJobResponse() {
    }

    public EdgeJobResponse(Boolean CollectLogs, String CronExpression, Integer Id, String Script, Integer Version) {
        this.CollectLogs = CollectLogs;
        this.CronExpression = CronExpression;
        this.Id = Id;
        this.Script = Script;
        this.Version = Version;
    }

    public Boolean getCollectLogs() {
        return CollectLogs;
    }

    public void setCollectLogs(Boolean CollectLogs) {
        this.CollectLogs = CollectLogs;
    }

    public String getCronExpression() {
        return CronExpression;
    }

    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getScript() {
        return Script;
    }

    public void setScript(String Script) {
        this.Script = Script;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer Version) {
        this.Version = Version;
    }

}