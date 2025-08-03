package eu.icole.portainer.dtos.v2;


public class CrossVersionObjectReference {

    private String apiVersion;
    private String kind;
    private String name;

    public CrossVersionObjectReference() {
    }

    public CrossVersionObjectReference(String apiVersion, String kind, String name) {
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.name = name;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
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

}