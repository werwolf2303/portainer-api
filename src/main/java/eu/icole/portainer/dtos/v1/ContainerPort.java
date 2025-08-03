package eu.icole.portainer.dtos.v1;


public class ContainerPort {

    private Integer containerPort;
    private String hostIP;
    private Integer hostPort;
    private String name;
    private String protocol;

    public ContainerPort() {
    }

    public ContainerPort(Integer containerPort, String hostIP, Integer hostPort, String name, String protocol) {
        this.containerPort = containerPort;
        this.hostIP = hostIP;
        this.hostPort = hostPort;
        this.name = name;
        this.protocol = protocol;
    }

    public Integer getContainerPort() {
        return containerPort;
    }

    public void setContainerPort(Integer containerPort) {
        this.containerPort = containerPort;
    }

    public String getHostIP() {
        return hostIP;
    }

    public void setHostIP(String hostIP) {
        this.hostIP = hostIP;
    }

    public Integer getHostPort() {
        return hostPort;
    }

    public void setHostPort(Integer hostPort) {
        this.hostPort = hostPort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

}