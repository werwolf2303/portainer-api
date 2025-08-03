package eu.icole.portainer.dtos.kubernetes;

import java.util.Map;

public class Metadata {

    private Map<String, Object> labels;

    public Metadata() {
    }

    public Metadata(Map<String, Object> labels) {
        this.labels = labels;
    }

    public Map<String, Object> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, Object> labels) {
        this.labels = labels;
    }

}