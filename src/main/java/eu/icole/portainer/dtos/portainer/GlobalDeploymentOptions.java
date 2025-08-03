package eu.icole.portainer.dtos.portainer;


public class GlobalDeploymentOptions {

    private Boolean hideStacksFunctionality;

    public GlobalDeploymentOptions() {
    }

    public GlobalDeploymentOptions(Boolean hideStacksFunctionality) {
        this.hideStacksFunctionality = hideStacksFunctionality;
    }

    public Boolean getHideStacksFunctionality() {
        return hideStacksFunctionality;
    }

    public void setHideStacksFunctionality(Boolean hideStacksFunctionality) {
        this.hideStacksFunctionality = hideStacksFunctionality;
    }

}