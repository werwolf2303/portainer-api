package eu.icole.portainer.dtos.v1;


public class ObjectReference {

    private String apiVersion;
    private String fieldPath;
    private String kind;
    private String name;
    private String namespace;
    private String resourceVersion;
    private String uid;

    public ObjectReference() {
    }

    public ObjectReference(String apiVersion, String fieldPath, String kind, String name, String namespace, String resourceVersion, String uid) {
        this.apiVersion = apiVersion;
        this.fieldPath = fieldPath;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
        this.resourceVersion = resourceVersion;
        this.uid = uid;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getFieldPath() {
        return fieldPath;
    }

    public void setFieldPath(String fieldPath) {
        this.fieldPath = fieldPath;
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

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}