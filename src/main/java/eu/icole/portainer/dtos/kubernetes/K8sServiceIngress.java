package eu.icole.portainer.dtos.kubernetes;


public class K8sServiceIngress {

    private String Host;
    private String IP;

    public K8sServiceIngress() {
    }

    public K8sServiceIngress(String Host, String IP) {
        this.Host = Host;
        this.IP = IP;
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

}