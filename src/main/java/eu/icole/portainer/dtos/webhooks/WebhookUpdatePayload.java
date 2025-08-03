package eu.icole.portainer.dtos.webhooks;


public class WebhookUpdatePayload {

    private Integer registryID;

    public WebhookUpdatePayload() {
    }

    public WebhookUpdatePayload(Integer registryID) {
        this.registryID = registryID;
    }

    public Integer getRegistryID() {
        return registryID;
    }

    public void setRegistryID(Integer registryID) {
        this.registryID = registryID;
    }

}