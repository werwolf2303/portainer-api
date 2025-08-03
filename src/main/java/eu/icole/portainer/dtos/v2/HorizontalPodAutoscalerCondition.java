package eu.icole.portainer.dtos.v2;


public class HorizontalPodAutoscalerCondition {

    private String lastTransitionTime;
    private String message;
    private String reason;
    private String status;
    private String type;

    public HorizontalPodAutoscalerCondition() {
    }

    public HorizontalPodAutoscalerCondition(String lastTransitionTime, String message, String reason, String status, String type) {
        this.lastTransitionTime = lastTransitionTime;
        this.message = message;
        this.reason = reason;
        this.status = status;
        this.type = type;
    }

    public String getLastTransitionTime() {
        return lastTransitionTime;
    }

    public void setLastTransitionTime(String lastTransitionTime) {
        this.lastTransitionTime = lastTransitionTime;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}