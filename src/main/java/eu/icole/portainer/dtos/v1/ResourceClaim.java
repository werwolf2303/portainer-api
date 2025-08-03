package eu.icole.portainer.dtos.v1;


public class ResourceClaim {

    private String name;

    public ResourceClaim() {
    }

    public ResourceClaim(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}