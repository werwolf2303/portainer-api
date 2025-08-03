package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.HorizontalPodAutoscalerCondition;
import eu.icole.portainer.dtos.v2.MetricStatus;

import java.util.List;

public class HorizontalPodAutoscalerStatus {

    private List<HorizontalPodAutoscalerCondition> conditions;
    private List<MetricStatus> currentMetrics;
    private Integer currentReplicas;
    private Integer desiredReplicas;
    private String lastScaleTime;
    private Integer observedGeneration;

    public HorizontalPodAutoscalerStatus() {
    }

    public HorizontalPodAutoscalerStatus(List<HorizontalPodAutoscalerCondition> conditions, List<MetricStatus> currentMetrics, Integer currentReplicas, Integer desiredReplicas, String lastScaleTime, Integer observedGeneration) {
        this.conditions = conditions;
        this.currentMetrics = currentMetrics;
        this.currentReplicas = currentReplicas;
        this.desiredReplicas = desiredReplicas;
        this.lastScaleTime = lastScaleTime;
        this.observedGeneration = observedGeneration;
    }

    public List<HorizontalPodAutoscalerCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<HorizontalPodAutoscalerCondition> conditions) {
        this.conditions = conditions;
    }

    public List<MetricStatus> getCurrentMetrics() {
        return currentMetrics;
    }

    public void setCurrentMetrics(List<MetricStatus> currentMetrics) {
        this.currentMetrics = currentMetrics;
    }

    public Integer getCurrentReplicas() {
        return currentReplicas;
    }

    public void setCurrentReplicas(Integer currentReplicas) {
        this.currentReplicas = currentReplicas;
    }

    public Integer getDesiredReplicas() {
        return desiredReplicas;
    }

    public void setDesiredReplicas(Integer desiredReplicas) {
        this.desiredReplicas = desiredReplicas;
    }

    public String getLastScaleTime() {
        return lastScaleTime;
    }

    public void setLastScaleTime(String lastScaleTime) {
        this.lastScaleTime = lastScaleTime;
    }

    public Integer getObservedGeneration() {
        return observedGeneration;
    }

    public void setObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
    }

}