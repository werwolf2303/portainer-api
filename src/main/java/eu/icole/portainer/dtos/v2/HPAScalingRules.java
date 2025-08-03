package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.HPAScalingPolicy;

import java.util.List;

public class HPAScalingRules {

    private List<HPAScalingPolicy> policies;
    private String selectPolicy;
    private Integer stabilizationWindowSeconds;

    public HPAScalingRules() {
    }

    public HPAScalingRules(List<HPAScalingPolicy> policies, String selectPolicy, Integer stabilizationWindowSeconds) {
        this.policies = policies;
        this.selectPolicy = selectPolicy;
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    }

    public List<HPAScalingPolicy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<HPAScalingPolicy> policies) {
        this.policies = policies;
    }

    public String getSelectPolicy() {
        return selectPolicy;
    }

    public void setSelectPolicy(String selectPolicy) {
        this.selectPolicy = selectPolicy;
    }

    public Integer getStabilizationWindowSeconds() {
        return stabilizationWindowSeconds;
    }

    public void setStabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
        this.stabilizationWindowSeconds = stabilizationWindowSeconds;
    }

}