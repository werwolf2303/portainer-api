package eu.icole.portainer.dtos.v1;


public class PortStatus {

    private String error;
    private Integer port;
    private String protocol;

    public PortStatus() {
    }

    public PortStatus(String error, Integer port, String protocol) {
        this.error = error;
        this.port = port;
        this.protocol = protocol;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

}