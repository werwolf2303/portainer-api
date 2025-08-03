package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.MetricTarget;

public class ResourceMetricSource {

    private String name;
    private MetricTarget target;

    public ResourceMetricSource() {
    }

    public ResourceMetricSource(String name, MetricTarget target) {
        this.name = name;
        this.target = target;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MetricTarget getTarget() {
        return target;
    }

    public void setTarget(MetricTarget target) {
        this.target = target;
    }

}