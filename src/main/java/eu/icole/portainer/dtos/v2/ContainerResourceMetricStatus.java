package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.MetricValueStatus;

public class ContainerResourceMetricStatus {

    private String container;
    private MetricValueStatus current;
    private String name;

    public ContainerResourceMetricStatus() {
    }

    public ContainerResourceMetricStatus(String container, MetricValueStatus current, String name) {
        this.container = container;
        this.current = current;
        this.name = name;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public MetricValueStatus getCurrent() {
        return current;
    }

    public void setCurrent(MetricValueStatus current) {
        this.current = current;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}