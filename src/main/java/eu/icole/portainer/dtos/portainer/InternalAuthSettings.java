package eu.icole.portainer.dtos.portainer;


public class InternalAuthSettings {

    private Integer requiredPasswordLength;

    public InternalAuthSettings() {
    }

    public InternalAuthSettings(Integer requiredPasswordLength) {
        this.requiredPasswordLength = requiredPasswordLength;
    }

    public Integer getRequiredPasswordLength() {
        return requiredPasswordLength;
    }

    public void setRequiredPasswordLength(Integer requiredPasswordLength) {
        this.requiredPasswordLength = requiredPasswordLength;
    }

}