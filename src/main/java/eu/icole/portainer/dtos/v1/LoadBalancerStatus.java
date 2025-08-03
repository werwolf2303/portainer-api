package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.LoadBalancerIngress;

import java.util.List;

public class LoadBalancerStatus {

    private List<LoadBalancerIngress> ingress;

    public LoadBalancerStatus() {
    }

    public LoadBalancerStatus(List<LoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

    public List<LoadBalancerIngress> getIngress() {
        return ingress;
    }

    public void setIngress(List<LoadBalancerIngress> ingress) {
        this.ingress = ingress;
    }

}