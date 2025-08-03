package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.TLSInfo;

import java.util.List;

public class IngressRule {

    private String Host;
    private String IP;
    private String Path;
    private List<TLSInfo> TLS;

    public IngressRule() {
    }

    public IngressRule(String Host, String IP, String Path, List<TLSInfo> TLS) {
        this.Host = Host;
        this.IP = IP;
        this.Path = Path;
        this.TLS = TLS;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public List<TLSInfo> getTLS() {
        return TLS;
    }

    public void setTLS(List<TLSInfo> TLS) {
        this.TLS = TLS;
    }

}