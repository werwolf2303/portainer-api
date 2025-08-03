package eu.icole.portainer.dtos.portainer;


public class TLSConfiguration {

    private Boolean TLS;
    private String TLSCACert;
    private String TLSCert;
    private String TLSKey;
    private Boolean TLSSkipVerify;

    public TLSConfiguration() {
    }

    public TLSConfiguration(Boolean TLS, String TLSCACert, String TLSCert, String TLSKey, Boolean TLSSkipVerify) {
        this.TLS = TLS;
        this.TLSCACert = TLSCACert;
        this.TLSCert = TLSCert;
        this.TLSKey = TLSKey;
        this.TLSSkipVerify = TLSSkipVerify;
    }

    public Boolean getTLS() {
        return TLS;
    }

    public void setTLS(Boolean TLS) {
        this.TLS = TLS;
    }

    public String getTLSCACert() {
        return TLSCACert;
    }

    public void setTLSCACert(String TLSCACert) {
        this.TLSCACert = TLSCACert;
    }

    public String getTLSCert() {
        return TLSCert;
    }

    public void setTLSCert(String TLSCert) {
        this.TLSCert = TLSCert;
    }

    public String getTLSKey() {
        return TLSKey;
    }

    public void setTLSKey(String TLSKey) {
        this.TLSKey = TLSKey;
    }

    public Boolean getTLSSkipVerify() {
        return TLSSkipVerify;
    }

    public void setTLSSkipVerify(Boolean TLSSkipVerify) {
        this.TLSSkipVerify = TLSSkipVerify;
    }

}