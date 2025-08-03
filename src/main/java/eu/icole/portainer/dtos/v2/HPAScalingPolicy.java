package eu.icole.portainer.dtos.v2;


public class HPAScalingPolicy {

    private Integer periodSeconds;
    private String type;
    private Integer value;

    public HPAScalingPolicy() {
    }

    public HPAScalingPolicy(Integer periodSeconds, String type, Integer value) {
        this.periodSeconds = periodSeconds;
        this.type = type;
        this.value = value;
    }

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}