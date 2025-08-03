package eu.icole.portainer.dtos.edgejobs;


public class TaskContainer {

    private Integer EndpointId;
    private String Id;
    private Integer LogsStatus;

    public TaskContainer() {
    }

    public TaskContainer(Integer EndpointId, String Id, Integer LogsStatus) {
        this.EndpointId = EndpointId;
        this.Id = Id;
        this.LogsStatus = LogsStatus;
    }

    public Integer getEndpointId() {
        return EndpointId;
    }

    public void setEndpointId(Integer EndpointId) {
        this.EndpointId = EndpointId;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Integer getLogsStatus() {
        return LogsStatus;
    }

    public void setLogsStatus(Integer LogsStatus) {
        this.LogsStatus = LogsStatus;
    }

}