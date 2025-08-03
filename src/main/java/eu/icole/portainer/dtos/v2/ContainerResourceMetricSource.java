package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.MetricTarget;

public class ContainerResourceMetricSource {

    private String container;
    private String name;
    private MetricTarget target;

    public ContainerResourceMetricSource() {
    }

    public ContainerResourceMetricSource(String container, String name, MetricTarget target) {
        this.container = container;
        this.name = name;
        this.target = target;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
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