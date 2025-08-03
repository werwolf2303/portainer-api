package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.EcrData;
import eu.icole.portainer.dtos.portainer.TLSConfiguration;

public class RegistryManagementConfiguration {

    private String AccessToken;
    private Integer AccessTokenExpiry;
    private Boolean Authentication;
    private EcrData Ecr;
    private String Password;
    private TLSConfiguration TLSConfig;
    private Integer Type;
    private String Username;

    public RegistryManagementConfiguration() {
    }

    public RegistryManagementConfiguration(String AccessToken, Integer AccessTokenExpiry, Boolean Authentication, EcrData Ecr, String Password, TLSConfiguration TLSConfig, Integer Type, String Username) {
        this.AccessToken = AccessToken;
        this.AccessTokenExpiry = AccessTokenExpiry;
        this.Authentication = Authentication;
        this.Ecr = Ecr;
        this.Password = Password;
        this.TLSConfig = TLSConfig;
        this.Type = Type;
        this.Username = Username;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String AccessToken) {
        this.AccessToken = AccessToken;
    }

    public Integer getAccessTokenExpiry() {
        return AccessTokenExpiry;
    }

    public void setAccessTokenExpiry(Integer AccessTokenExpiry) {
        this.AccessTokenExpiry = AccessTokenExpiry;
    }

    public Boolean getAuthentication() {
        return Authentication;
    }

    public void setAuthentication(Boolean Authentication) {
        this.Authentication = Authentication;
    }

    public EcrData getEcr() {
        return Ecr;
    }

    public void setEcr(EcrData Ecr) {
        this.Ecr = Ecr;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public TLSConfiguration getTLSConfig() {
        return TLSConfig;
    }

    public void setTLSConfig(TLSConfiguration TLSConfig) {
        this.TLSConfig = TLSConfig;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

}