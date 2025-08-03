package eu.icole.portainer.dtos.v1;


public class GRPCAction {

    private Integer port;
    private String service;

    public GRPCAction() {
    }

    public GRPCAction(Integer port, String service) {
        this.port = port;
        this.service = service;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

}