package eu.icole.portainer.dtos.webhooks;


public class WebhookCreatePayload {

    private Integer endpointID;
    private Integer registryID;
    private String resourceID;
    private Integer webhookType;

    public WebhookCreatePayload() {
    }

    public WebhookCreatePayload(Integer endpointID, Integer registryID, String resourceID, Integer webhookType) {
        this.endpointID = endpointID;
        this.registryID = registryID;
        this.resourceID = resourceID;
        this.webhookType = webhookType;
    }

    public Integer getEndpointID() {
        return endpointID;
    }

    public void setEndpointID(Integer endpointID) {
        this.endpointID = endpointID;
    }

    public Integer getRegistryID() {
        return registryID;
    }

    public void setRegistryID(Integer registryID) {
        this.registryID = registryID;
    }

    public String getResourceID() {
        return resourceID;
    }

    public void setResourceID(String resourceID) {
        this.resourceID = resourceID;
    }

    public Integer getWebhookType() {
        return webhookType;
    }

    public void setWebhookType(Integer webhookType) {
        this.webhookType = webhookType;
    }

}