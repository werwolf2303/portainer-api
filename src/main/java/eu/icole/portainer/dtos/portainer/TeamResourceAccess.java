package eu.icole.portainer.dtos.portainer;


public class TeamResourceAccess {

    private Integer AccessLevel;
    private Integer TeamId;

    public TeamResourceAccess() {
    }

    public TeamResourceAccess(Integer AccessLevel, Integer TeamId) {
        this.AccessLevel = AccessLevel;
        this.TeamId = TeamId;
    }

    public Integer getAccessLevel() {
        return AccessLevel;
    }

    public void setAccessLevel(Integer AccessLevel) {
        this.AccessLevel = AccessLevel;
    }

    public Integer getTeamId() {
        return TeamId;
    }

    public void setTeamId(Integer TeamId) {
        this.TeamId = TeamId;
    }

}