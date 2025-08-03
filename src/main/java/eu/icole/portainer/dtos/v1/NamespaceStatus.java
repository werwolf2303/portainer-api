package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.NamespaceCondition;

import java.util.List;

public class NamespaceStatus {

    private List<NamespaceCondition> conditions;
    private String phase;

    public NamespaceStatus() {
    }

    public NamespaceStatus(List<NamespaceCondition> conditions, String phase) {
        this.conditions = conditions;
        this.phase = phase;
    }

    public List<NamespaceCondition> getConditions() {
        return conditions;
    }

    public void setConditions(List<NamespaceCondition> conditions) {
        this.conditions = conditions;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

}