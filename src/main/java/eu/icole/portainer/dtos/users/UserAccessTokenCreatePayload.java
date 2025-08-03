package eu.icole.portainer.dtos.users;


public class UserAccessTokenCreatePayload {

    private String description;
    private String password;

    public UserAccessTokenCreatePayload() {
    }

    public UserAccessTokenCreatePayload(String description, String password) {
        this.description = description;
        this.password = password;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}