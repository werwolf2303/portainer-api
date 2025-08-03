package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.PortStatus;

import java.util.List;

public class LoadBalancerIngress {

    private String hostname;
    private String ip;
    private String ipMode;
    private List<PortStatus> ports;

    public LoadBalancerIngress() {
    }

    public LoadBalancerIngress(String hostname, String ip, String ipMode, List<PortStatus> ports) {
        this.hostname = hostname;
        this.ip = ip;
        this.ipMode = ipMode;
        this.ports = ports;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getIpMode() {
        return ipMode;
    }

    public void setIpMode(String ipMode) {
        this.ipMode = ipMode;
    }

    public List<PortStatus> getPorts() {
        return ports;
    }

    public void setPorts(List<PortStatus> ports) {
        this.ports = ports;
    }

}