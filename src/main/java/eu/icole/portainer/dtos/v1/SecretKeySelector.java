package eu.icole.portainer.dtos.v1;


public class SecretKeySelector {

    private String key;
    private String name;
    private Boolean optional;

    public SecretKeySelector() {
    }

    public SecretKeySelector(String key, String name, Boolean optional) {
        this.key = key;
        this.name = name;
        this.optional = optional;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
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