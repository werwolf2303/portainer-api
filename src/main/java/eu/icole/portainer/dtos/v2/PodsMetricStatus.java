package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.MetricIdentifier;
import eu.icole.portainer.dtos.v2.MetricValueStatus;

public class PodsMetricStatus {

    private MetricValueStatus current;
    private MetricIdentifier metric;

    public PodsMetricStatus() {
    }

    public PodsMetricStatus(MetricValueStatus current, MetricIdentifier metric) {
        this.current = current;
        this.metric = metric;
    }

    public MetricValueStatus getCurrent() {
        return current;
    }

    public void setCurrent(MetricValueStatus current) {
        this.current = current;
    }

    public MetricIdentifier getMetric() {
        return metric;
    }

    public void setMetric(MetricIdentifier metric) {
        this.metric = metric;
    }

}