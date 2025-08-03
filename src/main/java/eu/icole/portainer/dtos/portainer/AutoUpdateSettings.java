package eu.icole.portainer.dtos.portainer;


public class AutoUpdateSettings {

    private Boolean forcePullImage;
    private Boolean forceUpdate;
    private String interval;
    private String jobID;
    private String webhook;

    public AutoUpdateSettings() {
    }

    public AutoUpdateSettings(Boolean forcePullImage, Boolean forceUpdate, String interval, String jobID, String webhook) {
        this.forcePullImage = forcePullImage;
        this.forceUpdate = forceUpdate;
        this.interval = interval;
        this.jobID = jobID;
        this.webhook = webhook;
    }

    public Boolean getForcePullImage() {
        return forcePullImage;
    }

    public void setForcePullImage(Boolean forcePullImage) {
        this.forcePullImage = forcePullImage;
    }

    public Boolean getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(Boolean forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public String getWebhook() {
        return webhook;
    }

    public void setWebhook(String webhook) {
        this.webhook = webhook;
    }

}