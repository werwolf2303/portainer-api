package eu.icole.portainer.dtos.portainer;

import java.util.List;
import java.util.Map;

public class EdgeJob {

    private Integer Created;
    private String CronExpression;
    private List<Integer> EdgeGroups;
    private Map<String, Object> Endpoints;
    private Integer Id;
    private String Name;
    private Boolean Recurring;
    private String ScriptPath;
    private Integer Version;
    private Map<String, Object> groupLogsCollection;

    public EdgeJob() {
    }

    public EdgeJob(Integer Created, String CronExpression, List<Integer> EdgeGroups, Map<String, Object> Endpoints, Integer Id, String Name, Boolean Recurring, String ScriptPath, Integer Version, Map<String, Object> groupLogsCollection) {
        this.Created = Created;
        this.CronExpression = CronExpression;
        this.EdgeGroups = EdgeGroups;
        this.Endpoints = Endpoints;
        this.Id = Id;
        this.Name = Name;
        this.Recurring = Recurring;
        this.ScriptPath = ScriptPath;
        this.Version = Version;
        this.groupLogsCollection = groupLogsCollection;
    }

    public Integer getCreated() {
        return Created;
    }

    public void setCreated(Integer Created) {
        this.Created = Created;
    }

    public String getCronExpression() {
        return CronExpression;
    }

    public void setCronExpression(String CronExpression) {
        this.CronExpression = CronExpression;
    }

    public List<Integer> getEdgeGroups() {
        return EdgeGroups;
    }

    public void setEdgeGroups(List<Integer> EdgeGroups) {
        this.EdgeGroups = EdgeGroups;
    }

    public Map<String, Object> getEndpoints() {
        return Endpoints;
    }

    public void setEndpoints(Map<String, Object> Endpoints) {
        this.Endpoints = Endpoints;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Boolean getRecurring() {
        return Recurring;
    }

    public void setRecurring(Boolean Recurring) {
        this.Recurring = Recurring;
    }

    public String getScriptPath() {
        return ScriptPath;
    }

    public void setScriptPath(String ScriptPath) {
        this.ScriptPath = ScriptPath;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer Version) {
        this.Version = Version;
    }

    public Map<String, Object> getGroupLogsCollection() {
        return groupLogsCollection;
    }

    public void setGroupLogsCollection(Map<String, Object> groupLogsCollection) {
        this.groupLogsCollection = groupLogsCollection;
    }

}