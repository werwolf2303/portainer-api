package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.Condition;
import eu.icole.portainer.dtos.v1.LoadBalancerStatus;

import java.util.List;

public class ServiceStatus {

    private List<Condition> conditions;
    private LoadBalancerStatus loadBalancer;

    public ServiceStatus() {
    }

    public ServiceStatus(List<Condition> conditions, LoadBalancerStatus loadBalancer) {
        this.conditions = conditions;
        this.loadBalancer = loadBalancer;
    }

    public List<Condition> getConditions() {
        return conditions;
    }

    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public LoadBalancerStatus getLoadBalancer() {
        return loadBalancer;
    }

    public void setLoadBalancer(LoadBalancerStatus loadBalancer) {
        this.loadBalancer = loadBalancer;
    }

}