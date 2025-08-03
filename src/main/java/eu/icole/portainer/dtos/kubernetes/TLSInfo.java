package eu.icole.portainer.dtos.kubernetes;

import java.util.List;

public class TLSInfo {

    private List<String> hosts;

    public TLSInfo() {
    }

    public TLSInfo(List<String> hosts) {
        this.hosts = hosts;
    }

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

}