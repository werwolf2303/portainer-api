package eu.icole.portainer.dtos.portainer;


public class EdgeStackStatusDetails {

    private Boolean acknowledged;
    private Boolean error;
    private Boolean imagesPulled;
    private Boolean ok;
    private Boolean pending;
    private Boolean remoteUpdateSuccess;
    private Boolean remove;

    public EdgeStackStatusDetails() {
    }

    public EdgeStackStatusDetails(Boolean acknowledged, Boolean error, Boolean imagesPulled, Boolean ok, Boolean pending, Boolean remoteUpdateSuccess, Boolean remove) {
        this.acknowledged = acknowledged;
        this.error = error;
        this.imagesPulled = imagesPulled;
        this.ok = ok;
        this.pending = pending;
        this.remoteUpdateSuccess = remoteUpdateSuccess;
        this.remove = remove;
    }

    public Boolean getAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(Boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }

    public Boolean getImagesPulled() {
        return imagesPulled;
    }

    public void setImagesPulled(Boolean imagesPulled) {
        this.imagesPulled = imagesPulled;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public Boolean getPending() {
        return pending;
    }

    public void setPending(Boolean pending) {
        this.pending = pending;
    }

    public Boolean getRemoteUpdateSuccess() {
        return remoteUpdateSuccess;
    }

    public void setRemoteUpdateSuccess(Boolean remoteUpdateSuccess) {
        this.remoteUpdateSuccess = remoteUpdateSuccess;
    }

    public Boolean getRemove() {
        return remove;
    }

    public void setRemove(Boolean remove) {
        this.remove = remove;
    }

}