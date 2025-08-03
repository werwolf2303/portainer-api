package eu.icole.portainer.dtos.portainer;


public class UserResourceAccess {

    private Integer AccessLevel;
    private Integer UserId;

    public UserResourceAccess() {
    }

    public UserResourceAccess(Integer AccessLevel, Integer UserId) {
        this.AccessLevel = AccessLevel;
        this.UserId = UserId;
    }

    public Integer getAccessLevel() {
        return AccessLevel;
    }

    public void setAccessLevel(Integer AccessLevel) {
        this.AccessLevel = AccessLevel;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer UserId) {
        this.UserId = UserId;
    }

}