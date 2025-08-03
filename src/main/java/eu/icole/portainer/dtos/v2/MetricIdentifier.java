package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v1.LabelSelector;

public class MetricIdentifier {

    private String name;
    private LabelSelector selector;

    public MetricIdentifier() {
    }

    public MetricIdentifier(String name, LabelSelector selector) {
        this.name = name;
        this.selector = selector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LabelSelector getSelector() {
        return selector;
    }

    public void setSelector(LabelSelector selector) {
        this.selector = selector;
    }

}