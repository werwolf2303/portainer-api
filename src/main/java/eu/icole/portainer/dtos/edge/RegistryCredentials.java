package eu.icole.portainer.dtos.edge;


public class RegistryCredentials {

    private String secret;
    private String serverURL;
    private String username;

    public RegistryCredentials() {
    }

    public RegistryCredentials(String secret, String serverURL, String username) {
        this.secret = secret;
        this.serverURL = serverURL;
        this.username = username;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getServerURL() {
        return serverURL;
    }

    public void setServerURL(String serverURL) {
        this.serverURL = serverURL;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}