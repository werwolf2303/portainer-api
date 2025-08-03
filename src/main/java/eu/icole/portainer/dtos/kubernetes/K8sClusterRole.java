package eu.icole.portainer.dtos.kubernetes;


public class K8sClusterRole {

    private String creationDate;
    private Boolean isSystem;
    private String name;
    private String uid;

    public K8sClusterRole() {
    }

    public K8sClusterRole(String creationDate, Boolean isSystem, String name, String uid) {
        this.creationDate = creationDate;
        this.isSystem = isSystem;
        this.name = name;
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

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}