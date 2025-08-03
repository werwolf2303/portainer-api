package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.CrossVersionObjectReference;
import eu.icole.portainer.dtos.v2.MetricIdentifier;
import eu.icole.portainer.dtos.v2.MetricValueStatus;

public class ObjectMetricStatus {

    private MetricValueStatus current;
    private CrossVersionObjectReference describedObject;
    private MetricIdentifier metric;

    public ObjectMetricStatus() {
    }

    public ObjectMetricStatus(MetricValueStatus current, CrossVersionObjectReference describedObject, MetricIdentifier metric) {
        this.current = current;
        this.describedObject = describedObject;
        this.metric = metric;
    }

    public MetricValueStatus getCurrent() {
        return current;
    }

    public void setCurrent(MetricValueStatus current) {
        this.current = current;
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

}