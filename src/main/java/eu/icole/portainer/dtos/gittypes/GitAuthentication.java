package eu.icole.portainer.dtos.gittypes;


public class GitAuthentication {

    private Integer gitCredentialID;
    private String password;
    private String username;

    public GitAuthentication() {
    }

    public GitAuthentication(Integer gitCredentialID, String password, String username) {
        this.gitCredentialID = gitCredentialID;
        this.password = password;
        this.username = username;
    }

    public Integer getGitCredentialID() {
        return gitCredentialID;
    }

    public void setGitCredentialID(Integer gitCredentialID) {
        this.gitCredentialID = gitCredentialID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}