package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.MetricIdentifier;
import eu.icole.portainer.dtos.v2.MetricTarget;

public class PodsMetricSource {

    private MetricIdentifier metric;
    private MetricTarget target;

    public PodsMetricSource() {
    }

    public PodsMetricSource(MetricIdentifier metric, MetricTarget target) {
        this.metric = metric;
        this.target = target;
    }

    public MetricIdentifier getMetric() {
        return metric;
    }

    public void setMetric(MetricIdentifier metric) {
        this.metric = metric;
    }

    public MetricTarget getTarget() {
        return target;
    }

    public void setTarget(MetricTarget target) {
        this.target = target;
    }

}