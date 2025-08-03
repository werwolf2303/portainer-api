package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.intstr.IntOrString;

public class TCPSocketAction {

    private String host;
    private IntOrString port;

    public TCPSocketAction() {
    }

    public TCPSocketAction(String host, IntOrString port) {
        this.host = host;
        this.port = port;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public IntOrString getPort() {
        return port;
    }

    public void setPort(IntOrString port) {
        this.port = port;
    }

}