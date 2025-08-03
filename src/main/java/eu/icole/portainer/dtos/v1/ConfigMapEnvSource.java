package eu.icole.portainer.dtos.v1;


public class ConfigMapEnvSource {

    private String name;
    private Boolean optional;

    public ConfigMapEnvSource() {
    }

    public ConfigMapEnvSource(String name, Boolean optional) {
        this.name = name;
        this.optional = optional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

}