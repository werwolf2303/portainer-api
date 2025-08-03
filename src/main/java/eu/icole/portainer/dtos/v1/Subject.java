package eu.icole.portainer.dtos.v1;


public class Subject {

    private String apiGroup;
    private String kind;
    private String name;
    private String namespace;

    public Subject() {
    }

    public Subject(String apiGroup, String kind, String name, String namespace) {
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
        this.namespace = namespace;
    }

    public String getApiGroup() {
        return apiGroup;
    }

    public void setApiGroup(String apiGroup) {
        this.apiGroup = apiGroup;
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

}