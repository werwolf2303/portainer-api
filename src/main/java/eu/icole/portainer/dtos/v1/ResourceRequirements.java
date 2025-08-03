package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ResourceClaim;
import eu.icole.portainer.dtos.v1.ResourceList;

import java.util.List;

public class ResourceRequirements {

    private List<ResourceClaim> claims;
    private ResourceList limits;
    private ResourceList requests;

    public ResourceRequirements() {
    }

    public ResourceRequirements(List<ResourceClaim> claims, ResourceList limits, ResourceList requests) {
        this.claims = claims;
        this.limits = limits;
        this.requests = requests;
    }

    public List<ResourceClaim> getClaims() {
        return claims;
    }

    public void setClaims(List<ResourceClaim> claims) {
        this.claims = claims;
    }

    public ResourceList getLimits() {
        return limits;
    }

    public void setLimits(ResourceList limits) {
        this.limits = limits;
    }

    public ResourceList getRequests() {
        return requests;
    }

    public void setRequests(ResourceList requests) {
        this.requests = requests;
    }

}