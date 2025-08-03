package eu.icole.portainer.dtos.portainer;


public class TeamMembership {

    private Integer Id;
    private Integer Role;
    private Integer TeamID;
    private Integer UserID;

    public TeamMembership() {
    }

    public TeamMembership(Integer Id, Integer Role, Integer TeamID, Integer UserID) {
        this.Id = Id;
        this.Role = Role;
        this.TeamID = TeamID;
        this.UserID = UserID;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getRole() {
        return Role;
    }

    public void setRole(Integer Role) {
        this.Role = Role;
    }

    public Integer getTeamID() {
        return TeamID;
    }

    public void setTeamID(Integer TeamID) {
        this.TeamID = TeamID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer UserID) {
        this.UserID = UserID;
    }

}