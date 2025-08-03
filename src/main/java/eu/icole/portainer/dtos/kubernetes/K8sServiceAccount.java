package eu.icole.portainer.dtos.kubernetes;


public class K8sServiceAccount {

    private String creationDate;
    private Boolean isSystem;
    private String name;
    private String namespace;
    private String uid;

    public K8sServiceAccount() {
    }

    public K8sServiceAccount(String creationDate, Boolean isSystem, String name, String namespace, String uid) {
        this.creationDate = creationDate;
        this.isSystem = isSystem;
        this.name = name;
        this.namespace = namespace;
        this.uid = uid;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}