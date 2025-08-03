package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ResourceList;

public class ResourceQuotaStatus {

    private ResourceList hard;
    private ResourceList used;

    public ResourceQuotaStatus() {
    }

    public ResourceQuotaStatus(ResourceList hard, ResourceList used) {
        this.hard = hard;
        this.used = used;
    }

    public ResourceList getHard() {
        return hard;
    }

    public void setHard(ResourceList hard) {
        this.hard = hard;
    }

    public ResourceList getUsed() {
        return used;
    }

    public void setUsed(ResourceList used) {
        this.used = used;
    }

}