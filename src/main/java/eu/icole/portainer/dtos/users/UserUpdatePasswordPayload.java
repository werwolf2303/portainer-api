package eu.icole.portainer.dtos.users;


public class UserUpdatePasswordPayload {

    private String newPassword;
    private String password;

    public UserUpdatePasswordPayload() {
    }

    public UserUpdatePasswordPayload(String newPassword, String password) {
        this.newPassword = newPassword;
        this.password = password;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}