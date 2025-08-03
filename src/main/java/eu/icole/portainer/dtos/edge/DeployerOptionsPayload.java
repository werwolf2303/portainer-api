package eu.icole.portainer.dtos.edge;


public class DeployerOptionsPayload {

    private Boolean prune;
    private Boolean removeVolumes;

    public DeployerOptionsPayload() {
    }

    public DeployerOptionsPayload(Boolean prune, Boolean removeVolumes) {
        this.prune = prune;
        this.removeVolumes = removeVolumes;
    }

    public Boolean getPrune() {
        return prune;
    }

    public void setPrune(Boolean prune) {
        this.prune = prune;
    }

    public Boolean getRemoveVolumes() {
        return removeVolumes;
    }

    public void setRemoveVolumes(Boolean removeVolumes) {
        this.removeVolumes = removeVolumes;
    }

}