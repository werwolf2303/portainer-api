package eu.icole.portainer.dtos.v1;


public class SecretReference {

    private String name;
    private String namespace;

    public SecretReference() {
    }

    public SecretReference(String name, String namespace) {
        this.name = name;
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

}