package eu.icole.portainer.dtos.portainer;


public class Webhook {

    private Integer EndpointId;
    private Integer Id;
    private Integer RegistryId;
    private String ResourceId;
    private String Token;
    private Integer Type;

    public Webhook() {
    }

    public Webhook(Integer EndpointId, Integer Id, Integer RegistryId, String ResourceId, String Token, Integer Type) {
        this.EndpointId = EndpointId;
        this.Id = Id;
        this.RegistryId = RegistryId;
        this.ResourceId = ResourceId;
        this.Token = Token;
        this.Type = Type;
    }

    public Integer getEndpointId() {
        return EndpointId;
    }

    public void setEndpointId(Integer EndpointId) {
        this.EndpointId = EndpointId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getRegistryId() {
        return RegistryId;
    }

    public void setRegistryId(Integer RegistryId) {
        this.RegistryId = RegistryId;
    }

    public String getResourceId() {
        return ResourceId;
    }

    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String Token) {
        this.Token = Token;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

}