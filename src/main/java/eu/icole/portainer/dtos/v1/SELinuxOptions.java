package eu.icole.portainer.dtos.v1;


public class SELinuxOptions {

    private String level;
    private String role;
    private String type;
    private String user;

    public SELinuxOptions() {
    }

    public SELinuxOptions(String level, String role, String type, String user) {
        this.level = level;
        this.role = role;
        this.type = type;
        this.user = user;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}