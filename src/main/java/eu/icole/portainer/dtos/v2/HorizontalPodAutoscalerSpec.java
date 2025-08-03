package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.CrossVersionObjectReference;
import eu.icole.portainer.dtos.v2.HorizontalPodAutoscalerBehavior;
import eu.icole.portainer.dtos.v2.MetricSpec;

import java.util.List;

public class HorizontalPodAutoscalerSpec {

    private HorizontalPodAutoscalerBehavior behavior;
    private Integer maxReplicas;
    private List<MetricSpec> metrics;
    private Integer minReplicas;
    private CrossVersionObjectReference scaleTargetRef;

    public HorizontalPodAutoscalerSpec() {
    }

    public HorizontalPodAutoscalerSpec(HorizontalPodAutoscalerBehavior behavior, Integer maxReplicas, List<MetricSpec> metrics, Integer minReplicas, CrossVersionObjectReference scaleTargetRef) {
        this.behavior = behavior;
        this.maxReplicas = maxReplicas;
        this.metrics = metrics;
        this.minReplicas = minReplicas;
        this.scaleTargetRef = scaleTargetRef;
    }

    public HorizontalPodAutoscalerBehavior getBehavior() {
        return behavior;
    }

    public void setBehavior(HorizontalPodAutoscalerBehavior behavior) {
        this.behavior = behavior;
    }

    public Integer getMaxReplicas() {
        return maxReplicas;
    }

    public void setMaxReplicas(Integer maxReplicas) {
        this.maxReplicas = maxReplicas;
    }

    public List<MetricSpec> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricSpec> metrics) {
        this.metrics = metrics;
    }

    public Integer getMinReplicas() {
        return minReplicas;
    }

    public void setMinReplicas(Integer minReplicas) {
        this.minReplicas = minReplicas;
    }

    public CrossVersionObjectReference getScaleTargetRef() {
        return scaleTargetRef;
    }

    public void setScaleTargetRef(CrossVersionObjectReference scaleTargetRef) {
        this.scaleTargetRef = scaleTargetRef;
    }

}