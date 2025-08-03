package eu.icole.portainer.dtos.portainer;


public class CustomTemplateVariableDefinition {

    private String defaultValue;
    private String description;
    private String label;
    private String name;

    public CustomTemplateVariableDefinition() {
    }

    public CustomTemplateVariableDefinition(String defaultValue, String description, String label, String name) {
        this.defaultValue = defaultValue;
        this.description = description;
        this.label = label;
        this.name = name;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}