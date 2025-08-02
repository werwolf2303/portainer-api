package eu.icole.portainer.dtos;

public class TLSConfiguration {
    private boolean TLS;
    private String TLSCACert;
    private String TLSCert;
    private String TLSKey;
    private boolean TLSSkipVerify;

    public boolean isTLS() {
        return TLS;
    }

    public String getTLSCACert() {
        return TLSCACert;
    }

    public String getTLSCert() {
        return TLSCert;
    }

    public String getTLSKey() {
        return TLSKey;
    }

    public boolean isTLSSkipVerify() {
        return TLSSkipVerify;
    }
}
