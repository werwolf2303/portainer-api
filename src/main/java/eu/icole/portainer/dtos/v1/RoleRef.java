package eu.icole.portainer.dtos.v1;


public class RoleRef {

    private String apiGroup;
    private String kind;
    private String name;

    public RoleRef() {
    }

    public RoleRef(String apiGroup, String kind, String name) {
        this.apiGroup = apiGroup;
        this.kind = kind;
        this.name = name;
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

}