package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ResourceList;
import eu.icole.portainer.dtos.v1.ScopeSelector;

import java.util.List;

public class ResourceQuotaSpec {

    private ResourceList hard;
    private ScopeSelector scopeSelector;
    private List<String> scopes;

    public ResourceQuotaSpec() {
    }

    public ResourceQuotaSpec(ResourceList hard, ScopeSelector scopeSelector, List<String> scopes) {
        this.hard = hard;
        this.scopeSelector = scopeSelector;
        this.scopes = scopes;
    }

    public ResourceList getHard() {
        return hard;
    }

    public void setHard(ResourceList hard) {
        this.hard = hard;
    }

    public ScopeSelector getScopeSelector() {
        return scopeSelector;
    }

    public void setScopeSelector(ScopeSelector scopeSelector) {
        this.scopeSelector = scopeSelector;
    }

    public List<String> getScopes() {
        return scopes;
    }

    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }

}