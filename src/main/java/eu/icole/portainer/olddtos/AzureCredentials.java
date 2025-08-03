package eu.icole.portainer.olddtos;

public class AzureCredentials {
    private String ApplicationID;
    private String AuthenticationKey;
    private String TenantID;

    /**
     * Azure application ID
     */
    public String getApplicationID() {
        return ApplicationID;
    }

    /**
     * Azure authentication key
     */
    public String getAuthenticationKey() {
        return AuthenticationKey;
    }

    /**
     * Azure tenant ID
     */
    public String getTenantID() {
        return TenantID;
    }
}
