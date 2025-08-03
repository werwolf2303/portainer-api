package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.HPAScalingRules;

public class HorizontalPodAutoscalerBehavior {

    private HPAScalingRules scaleDown;
    private HPAScalingRules scaleUp;

    public HorizontalPodAutoscalerBehavior() {
    }

    public HorizontalPodAutoscalerBehavior(HPAScalingRules scaleDown, HPAScalingRules scaleUp) {
        this.scaleDown = scaleDown;
        this.scaleUp = scaleUp;
    }

    public HPAScalingRules getScaleDown() {
        return scaleDown;
    }

    public void setScaleDown(HPAScalingRules scaleDown) {
        this.scaleDown = scaleDown;
    }

    public HPAScalingRules getScaleUp() {
        return scaleUp;
    }

    public void setScaleUp(HPAScalingRules scaleUp) {
        this.scaleUp = scaleUp;
    }

}