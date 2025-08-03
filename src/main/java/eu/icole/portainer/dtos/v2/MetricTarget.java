package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.resource.Quantity;

public class MetricTarget {

    private Integer averageUtilization;
    private Quantity averageValue;
    private String type;
    private Quantity value;

    public MetricTarget() {
    }

    public MetricTarget(Integer averageUtilization, Quantity averageValue, String type, Quantity value) {
        this.averageUtilization = averageUtilization;
        this.averageValue = averageValue;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Quantity getValue() {
        return value;
    }

    public void setValue(Quantity value) {
        this.value = value;
    }

}