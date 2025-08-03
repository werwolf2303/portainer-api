package eu.icole.portainer.dtos.v1;


public class ObjectFieldSelector {

    private String apiVersion;
    private String fieldPath;

    public ObjectFieldSelector() {
    }

    public ObjectFieldSelector(String apiVersion, String fieldPath) {
        this.apiVersion = apiVersion;
        this.fieldPath = fieldPath;
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

}