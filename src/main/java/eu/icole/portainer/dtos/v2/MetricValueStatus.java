package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.resource.Quantity;

public class MetricValueStatus {

    private Integer averageUtilization;
    private Quantity averageValue;
    private Quantity value;

    public MetricValueStatus() {
    }

    public MetricValueStatus(Integer averageUtilization, Quantity averageValue, Quantity value) {
        this.averageUtilization = averageUtilization;
        this.averageValue = averageValue;
        this.value = value;
    }

    public Integer getAverageUtilization() {
        return averageUtilization;
    }

    public void setAverageUtilization(Integer averageUtilization) {
        this.averageUtilization = averageUtilization;
    }

    public Quantity getAverageValue() {
        return averageValue;
    }

    public void setAverageValue(Quantity averageValue) {
        this.averageValue = averageValue;
    }

    public Quantity getValue() {
        return value;
    }

    public void setValue(Quantity value) {
        this.value = value;
    }

}