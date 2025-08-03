package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ScopedResourceSelectorRequirement;

import java.util.List;

public class ScopeSelector {

    private List<ScopedResourceSelectorRequirement> matchExpressions;

    public ScopeSelector() {
    }

    public ScopeSelector(List<ScopedResourceSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

    public List<ScopedResourceSelectorRequirement> getMatchExpressions() {
        return matchExpressions;
    }

    public void setMatchExpressions(List<ScopedResourceSelectorRequirement> matchExpressions) {
        this.matchExpressions = matchExpressions;
    }

}