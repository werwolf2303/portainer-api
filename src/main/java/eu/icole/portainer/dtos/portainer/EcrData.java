package eu.icole.portainer.dtos.portainer;


public class EcrData {

    private String Region;

    public EcrData() {
    }

    public EcrData(String Region) {
        this.Region = Region;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

}