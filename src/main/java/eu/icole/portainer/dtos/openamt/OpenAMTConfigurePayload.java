package eu.icole.portainer.dtos.openamt;


public class OpenAMTConfigurePayload {

    private String certFileContent;
    private String certFileName;
    private String certFilePassword;
    private String domainName;
    private Boolean enabled;
    private String mpspassword;
    private String mpsserver;
    private String mpsuser;

    public OpenAMTConfigurePayload() {
    }

    public OpenAMTConfigurePayload(String certFileContent, String certFileName, String certFilePassword, String domainName, Boolean enabled, String mpspassword, String mpsserver, String mpsuser) {
        this.certFileContent = certFileContent;
        this.certFileName = certFileName;
        this.certFilePassword = certFilePassword;
        this.domainName = domainName;
        this.enabled = enabled;
        this.mpspassword = mpspassword;
        this.mpsserver = mpsserver;
        this.mpsuser = mpsuser;
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

    public String getMpspassword() {
        return mpspassword;
    }

    public void setMpspassword(String mpspassword) {
        this.mpspassword = mpspassword;
    }

    public String getMpsserver() {
        return mpsserver;
    }

    public void setMpsserver(String mpsserver) {
        this.mpsserver = mpsserver;
    }

    public String getMpsuser() {
        return mpsuser;
    }

    public void setMpsuser(String mpsuser) {
        this.mpsuser = mpsuser;
    }

}