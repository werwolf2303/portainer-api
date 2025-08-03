package eu.icole.portainer.dtos.users;


public class UserCreatePayload {

    private String password;
    private Integer role;
    private String username;

    public UserCreatePayload() {
    }

    public UserCreatePayload(String password, Integer role, String username) {
        this.password = password;
        this.role = role;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}