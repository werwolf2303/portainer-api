package eu.icole.portainer.dtos.v1;


public class VolumeDevice {

    private String devicePath;
    private String name;

    public VolumeDevice() {
    }

    public VolumeDevice(String devicePath, String name) {
        this.devicePath = devicePath;
        this.name = name;
    }

    public String getDevicePath() {
        return devicePath;
    }

    public void setDevicePath(String devicePath) {
        this.devicePath = devicePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}