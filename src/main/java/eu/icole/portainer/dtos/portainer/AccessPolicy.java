package eu.icole.portainer.dtos.portainer;


public class AccessPolicy {

    private Integer RoleId;

    public AccessPolicy() {
    }

    public AccessPolicy(Integer RoleId) {
        this.RoleId = RoleId;
    }

    public Integer getRoleId() {
        return RoleId;
    }

    public void setRoleId(Integer RoleId) {
        this.RoleId = RoleId;
    }

}