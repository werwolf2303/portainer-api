package eu.icole.portainer.dtos.portainer;


public class AzureCredentials {

    private String ApplicationID;
    private String AuthenticationKey;
    private String TenantID;

    public AzureCredentials() {
    }

    public AzureCredentials(String ApplicationID, String AuthenticationKey, String TenantID) {
        this.ApplicationID = ApplicationID;
        this.AuthenticationKey = AuthenticationKey;
        this.TenantID = TenantID;
    }

    public String getApplicationID() {
        return ApplicationID;
    }

    public void setApplicationID(String ApplicationID) {
        this.ApplicationID = ApplicationID;
    }

    public String getAuthenticationKey() {
        return AuthenticationKey;
    }

    public void setAuthenticationKey(String AuthenticationKey) {
        this.AuthenticationKey = AuthenticationKey;
    }

    public String getTenantID() {
        return TenantID;
    }

    public void setTenantID(String TenantID) {
        this.TenantID = TenantID;
    }

}