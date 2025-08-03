package eu.icole.portainer.dtos.endpoints;


public class ForceUpdateServicePayload {

    private Boolean pullImage;
    private String serviceID;

    public ForceUpdateServicePayload() {
    }

    public ForceUpdateServicePayload(Boolean pullImage, String serviceID) {
        this.pullImage = pullImage;
        this.serviceID = serviceID;
    }

    public Boolean getPullImage() {
        return pullImage;
    }

    public void setPullImage(Boolean pullImage) {
        this.pullImage = pullImage;
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

}