package eu.icole.portainer.dtos.portainer;


public class SSLSettings {

    private String certPath;
    private Boolean httpEnabled;
    private String keyPath;
    private Boolean selfSigned;

    public SSLSettings() {
    }

    public SSLSettings(String certPath, Boolean httpEnabled, String keyPath, Boolean selfSigned) {
        this.certPath = certPath;
        this.httpEnabled = httpEnabled;
        this.keyPath = keyPath;
        this.selfSigned = selfSigned;
    }

    public String getCertPath() {
        return certPath;
    }

    public void setCertPath(String certPath) {
        this.certPath = certPath;
    }

    public Boolean getHttpEnabled() {
        return httpEnabled;
    }

    public void setHttpEnabled(Boolean httpEnabled) {
        this.httpEnabled = httpEnabled;
    }

    public String getKeyPath() {
        return keyPath;
    }

    public void setKeyPath(String keyPath) {
        this.keyPath = keyPath;
    }

    public Boolean getSelfSigned() {
        return selfSigned;
    }

    public void setSelfSigned(Boolean selfSigned) {
        this.selfSigned = selfSigned;
    }

}