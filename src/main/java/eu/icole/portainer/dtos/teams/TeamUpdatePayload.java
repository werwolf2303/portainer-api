package eu.icole.portainer.dtos.teams;


public class TeamUpdatePayload {

    private String name;

    public TeamUpdatePayload() {
    }

    public TeamUpdatePayload(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}