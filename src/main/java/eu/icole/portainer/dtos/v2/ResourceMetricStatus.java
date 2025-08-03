package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.MetricValueStatus;

public class ResourceMetricStatus {

    private MetricValueStatus current;
    private String name;

    public ResourceMetricStatus() {
    }

    public ResourceMetricStatus(MetricValueStatus current, String name) {
        this.current = current;
        this.name = name;
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