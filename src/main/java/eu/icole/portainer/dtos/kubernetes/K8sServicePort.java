package eu.icole.portainer.dtos.kubernetes;


public class K8sServicePort {

    private String Name;
    private Integer NodePort;
    private Integer Port;
    private String Protocol;
    private String TargetPort;

    public K8sServicePort() {
    }

    public K8sServicePort(String Name, Integer NodePort, Integer Port, String Protocol, String TargetPort) {
        this.Name = Name;
        this.NodePort = NodePort;
        this.Port = Port;
        this.Protocol = Protocol;
        this.TargetPort = TargetPort;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Integer getNodePort() {
        return NodePort;
    }

    public void setNodePort(Integer NodePort) {
        this.NodePort = NodePort;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer Port) {
        this.Port = Port;
    }

    public String getProtocol() {
        return Protocol;
    }

    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    public String getTargetPort() {
        return TargetPort;
    }

    public void setTargetPort(String TargetPort) {
        this.TargetPort = TargetPort;
    }

}