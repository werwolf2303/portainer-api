package eu.icole.portainer.dtos.teammemberships;


public class TeamMembershipCreatePayload {

    private Integer role;
    private Integer teamID;
    private Integer userID;

    public TeamMembershipCreatePayload() {
    }

    public TeamMembershipCreatePayload(Integer role, Integer teamID, Integer userID) {
        this.role = role;
        this.teamID = teamID;
        this.userID = userID;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

}