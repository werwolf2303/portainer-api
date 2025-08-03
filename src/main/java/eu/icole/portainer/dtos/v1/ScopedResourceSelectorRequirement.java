package eu.icole.portainer.dtos.v1;

import java.util.List;

public class ScopedResourceSelectorRequirement {

    private String operator;
    private String scopeName;
    private List<String> values;

    public ScopedResourceSelectorRequirement() {
    }

    public ScopedResourceSelectorRequirement(String operator, String scopeName, List<String> values) {
        this.operator = operator;
        this.scopeName = scopeName;
        this.values = values;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

}