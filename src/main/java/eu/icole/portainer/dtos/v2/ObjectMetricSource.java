package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.CrossVersionObjectReference;
import eu.icole.portainer.dtos.v2.MetricIdentifier;
import eu.icole.portainer.dtos.v2.MetricTarget;

public class ObjectMetricSource {

    private CrossVersionObjectReference describedObject;
    private MetricIdentifier metric;
    private MetricTarget target;

    public ObjectMetricSource() {
    }

    public ObjectMetricSource(CrossVersionObjectReference describedObject, MetricIdentifier metric, MetricTarget target) {
        this.describedObject = describedObject;
        this.metric = metric;
        this.target = target;
    }

    public CrossVersionObjectReference getDescribedObject() {
        return describedObject;
    }

    public void setDescribedObject(CrossVersionObjectReference describedObject) {
        this.describedObject = describedObject;
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