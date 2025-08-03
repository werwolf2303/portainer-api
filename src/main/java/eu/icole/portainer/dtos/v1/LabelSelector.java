package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.LabelSelectorRequirement;

import java.util.List;
import java.util.Map;

public class LabelSelector {

    private List<LabelSelectorRequirement> matchExpressions;
    private Map<String, Object> matchLabels;

    public LabelSelector() {
    }

    public LabelSelector(List<LabelSelectorRequirement> matchExpressions, Map<String, Object> matchLabels) {
        this.matchExpressions = matchExpressions;
        this.matchLabels = matchLabels;
    }

    public List<LabelSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(List<LabelSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public Map<String, Object> getMatchLabels() {
        return matchLabels;
    }

    public void setMatchLabels(Map<String, Object> matchLabels) {
        this.matchLabels = matchLabels;
    }

}