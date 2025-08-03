package eu.icole.portainer.dtos.kubernetes;


public class K8sConfigurationOwnerResource {

    private String Id;
    private String Name;
    private String ResourceKind;

    public K8sConfigurationOwnerResource() {
    }

    public K8sConfigurationOwnerResource(String Id, String Name, String ResourceKind) {
        this.Id = Id;
        this.Name = Name;
        this.ResourceKind = ResourceKind;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getResourceKind() {
        return ResourceKind;
    }

    public void setResourceKind(String ResourceKind) {
        this.ResourceKind = ResourceKind;
    }

}