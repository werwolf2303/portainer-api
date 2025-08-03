package eu.icole.portainer.dtos.openamt;


public class DeviceActionPayload {

    private String action;

    public DeviceActionPayload() {
    }

    public DeviceActionPayload(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}