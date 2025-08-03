package eu.icole.portainer.dtos.v1;

import java.util.List;

public class LabelSelectorRequirement {

    private String key;
    private String operator;
    private List<String> values;

    public LabelSelectorRequirement() {
    }

    public LabelSelectorRequirement(String key, String operator, List<String> values) {
        this.key = key;
        this.operator = operator;
        this.values = values;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }

}