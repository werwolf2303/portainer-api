package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.v1.Container;

public class K8sJob {

    private Integer BackoffLimit;
    private String Command;
    private Integer Completions;
    private Container Container;
    private String Duration;
    private String FailedReason;
    private String FinishTime;
    private String Id;
    private Boolean IsSystem;
    private String Name;
    private String Namespace;
    private String PodName;
    private String StartTime;
    private String Status;

    public K8sJob() {
    }

    public K8sJob(Integer BackoffLimit, String Command, Integer Completions, Container Container, String Duration, String FailedReason, String FinishTime, String Id, Boolean IsSystem, String Name, String Namespace, String PodName, String StartTime, String Status) {
        this.BackoffLimit = BackoffLimit;
        this.Command = Command;
        this.Completions = Completions;
        this.Container = Container;
        this.Duration = Duration;
        this.FailedReason = FailedReason;
        this.FinishTime = FinishTime;
        this.Id = Id;
        this.IsSystem = IsSystem;
        this.Name = Name;
        this.Namespace = Namespace;
        this.PodName = PodName;
        this.StartTime = StartTime;
        this.Status = Status;
    }

    public Integer getBackoffLimit() {
        return BackoffLimit;
    }

    public void setBackoffLimit(Integer BackoffLimit) {
        this.BackoffLimit = BackoffLimit;
    }

    public String getCommand() {
        return Command;
    }

    public void setCommand(String Command) {
        this.Command = Command;
    }

    public Integer getCompletions() {
        return Completions;
    }

    public void setCompletions(Integer Completions) {
        this.Completions = Completions;
    }

    public Container getContainer() {
        return Container;
    }

    public void setContainer(Container Container) {
        this.Container = Container;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public String getFailedReason() {
        return FailedReason;
    }

    public void setFailedReason(String FailedReason) {
        this.FailedReason = FailedReason;
    }

    public String getFinishTime() {
        return FinishTime;
    }

    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public Boolean getIsSystem() {
        return IsSystem;
    }

    public void setIsSystem(Boolean IsSystem) {
        this.IsSystem = IsSystem;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNamespace() {
        return Namespace;
    }

    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public String getPodName() {
        return PodName;
    }

    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

}