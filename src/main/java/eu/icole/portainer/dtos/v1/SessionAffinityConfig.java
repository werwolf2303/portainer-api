package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ClientIPConfig;

public class SessionAffinityConfig {

    private ClientIPConfig clientIP;

    public SessionAffinityConfig() {
    }

    public SessionAffinityConfig(ClientIPConfig clientIP) {
        this.clientIP = clientIP;
    }

    public ClientIPConfig getClientIP() {
        return clientIP;
    }

    public void setClientIP(ClientIPConfig clientIP) {
        this.clientIP = clientIP;
    }

}