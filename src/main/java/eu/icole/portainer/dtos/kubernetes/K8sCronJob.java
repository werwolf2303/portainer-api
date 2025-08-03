package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.K8sJob;

import java.util.List;

public class K8sCronJob {

    private String Command;
    private String Id;
    private Boolean IsSystem;
    private List<K8sJob> Jobs;
    private String Name;
    private String Namespace;
    private String Schedule;
    private Boolean Suspend;
    private String Timezone;

    public K8sCronJob() {
    }

    public K8sCronJob(String Command, String Id, Boolean IsSystem, List<K8sJob> Jobs, String Name, String Namespace, String Schedule, Boolean Suspend, String Timezone) {
        this.Command = Command;
        this.Id = Id;
        this.IsSystem = IsSystem;
        this.Jobs = Jobs;
        this.Name = Name;
        this.Namespace = Namespace;
        this.Schedule = Schedule;
        this.Suspend = Suspend;
        this.Timezone = Timezone;
    }

    public String getCommand() {
        return Command;
    }

    public void setCommand(String Command) {
        this.Command = Command;
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

    public List<K8sJob> getJobs() {
        return Jobs;
    }

    public void setJobs(List<K8sJob> Jobs) {
        this.Jobs = Jobs;
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

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }

    public Boolean getSuspend() {
        return Suspend;
    }

    public void setSuspend(Boolean Suspend) {
        this.Suspend = Suspend;
    }

    public String getTimezone() {
        return Timezone;
    }

    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

}