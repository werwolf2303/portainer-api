package eu.icole.portainer.dtos.v1;


public class SeccompProfile {

    private String localhostProfile;
    private String type;

    public SeccompProfile() {
    }

    public SeccompProfile(String localhostProfile, String type) {
        this.localhostProfile = localhostProfile;
        this.type = type;
    }

    public String getLocalhostProfile() {
        return localhostProfile;
    }

    public void setLocalhostProfile(String localhostProfile) {
        this.localhostProfile = localhostProfile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}