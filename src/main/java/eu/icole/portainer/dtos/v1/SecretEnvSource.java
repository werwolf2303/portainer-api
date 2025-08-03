package eu.icole.portainer.dtos.v1;


public class SecretEnvSource {

    private String name;
    private Boolean optional;

    public SecretEnvSource() {
    }

    public SecretEnvSource(String name, Boolean optional) {
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