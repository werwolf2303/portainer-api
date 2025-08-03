package eu.icole.portainer.dtos.portainer;


public class OpenAMTConfiguration {

    private String certFileContent;
    private String certFileName;
    private String certFilePassword;
    private String domainName;
    private Boolean enabled;
    private String mpsPassword;
    private String mpsServer;
    private String mpsToken;
    private String mpsUser;

    public OpenAMTConfiguration() {
    }

    public OpenAMTConfiguration(String certFileContent, String certFileName, String certFilePassword, String domainName, Boolean enabled, String mpsPassword, String mpsServer, String mpsToken, String mpsUser) {
        this.certFileContent = certFileContent;
        this.certFileName = certFileName;
        this.certFilePassword = certFilePassword;
        this.domainName = domainName;
        this.enabled = enabled;
        this.mpsPassword = mpsPassword;
        this.mpsServer = mpsServer;
        this.mpsToken = mpsToken;
        this.mpsUser = mpsUser;
    }

    public String getCertFileContent() {
        return certFileContent;
    }

    public void setCertFileContent(String certFileContent) {
        this.certFileContent = certFileContent;
    }

    public String getCertFileName() {
        return certFileName;
    }

    public void setCertFileName(String certFileName) {
        this.certFileName = certFileName;
    }

    public String getCertFilePassword() {
        return certFilePassword;
    }

    public void setCertFilePassword(String certFilePassword) {
        this.certFilePassword = certFilePassword;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getMpsPassword() {
        return mpsPassword;
    }

    public void setMpsPassword(String mpsPassword) {
        this.mpsPassword = mpsPassword;
    }

    public String getMpsServer() {
        return mpsServer;
    }

    public void setMpsServer(String mpsServer) {
        this.mpsServer = mpsServer;
    }

    public String getMpsToken() {
        return mpsToken;
    }

    public void setMpsToken(String mpsToken) {
        this.mpsToken = mpsToken;
    }

    public String getMpsUser() {
        return mpsUser;
    }

    public void setMpsUser(String mpsUser) {
        this.mpsUser = mpsUser;
    }

}