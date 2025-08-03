package eu.icole.portainer.dtos.teams;

import java.util.List;

public class TeamCreatePayload {

    private String name;
    private List<Integer> teamLeaders;

    public TeamCreatePayload() {
    }

    public TeamCreatePayload(String name, List<Integer> teamLeaders) {
        this.name = name;
        this.teamLeaders = teamLeaders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getTeamLeaders() {
        return teamLeaders;
    }

    public void setTeamLeaders(List<Integer> teamLeaders) {
        this.teamLeaders = teamLeaders;
    }

}