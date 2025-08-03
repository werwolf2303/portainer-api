package eu.icole.portainer.dtos.ssl;


public class SslUpdatePayload {

    private String cert;
    private Boolean httpenabled;
    private String key;

    public SslUpdatePayload() {
    }

    public SslUpdatePayload(String cert, Boolean httpenabled, String key) {
        this.cert = cert;
        this.httpenabled = httpenabled;
        this.key = key;
    }

    public String getCert() {
        return cert;
    }

    public void setCert(String cert) {
        this.cert = cert;
    }

    public Boolean getHttpenabled() {
        return httpenabled;
    }

    public void setHttpenabled(Boolean httpenabled) {
        this.httpenabled = httpenabled;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}