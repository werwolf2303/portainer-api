package eu.icole.portainer.dtos.system;


public class Status {

    private String Version;
    private String instanceID;

    public Status() {
    }

    public Status(String Version, String instanceID) {
        this.Version = Version;
        this.instanceID = instanceID;
    }

    public String getVersion() {
        return Version;
    }

    public void setVersion(String Version) {
        this.Version = Version;
    }

    public String getInstanceID() {
        return instanceID;
    }

    public void setInstanceID(String instanceID) {
        this.instanceID = instanceID;
    }

}