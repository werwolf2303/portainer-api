package eu.icole.portainer.dtos.v1;


public class OwnerReference {

    private String apiVersion;
    private Boolean blockOwnerDeletion;
    private Boolean controller;
    private String kind;
    private String name;
    private String uid;

    public OwnerReference() {
    }

    public OwnerReference(String apiVersion, Boolean blockOwnerDeletion, Boolean controller, String kind, String name, String uid) {
        this.apiVersion = apiVersion;
        this.blockOwnerDeletion = blockOwnerDeletion;
        this.controller = controller;
        this.kind = kind;
        this.name = name;
        this.uid = uid;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Boolean getBlockOwnerDeletion() {
        return blockOwnerDeletion;
    }

    public void setBlockOwnerDeletion(Boolean blockOwnerDeletion) {
        this.blockOwnerDeletion = blockOwnerDeletion;
    }

    public Boolean getController() {
        return controller;
    }

    public void setController(Boolean controller) {
        this.controller = controller;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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