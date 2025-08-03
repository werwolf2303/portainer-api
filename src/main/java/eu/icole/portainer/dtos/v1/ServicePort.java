package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.intstr.IntOrString;

public class ServicePort {

    private String appProtocol;
    private String name;
    private Integer nodePort;
    private Integer port;
    private String protocol;
    private IntOrString targetPort;

    public ServicePort() {
    }

    public ServicePort(String appProtocol, String name, Integer nodePort, Integer port, String protocol, IntOrString targetPort) {
        this.appProtocol = appProtocol;
        this.name = name;
        this.nodePort = nodePort;
        this.port = port;
        this.protocol = protocol;
        this.targetPort = targetPort;
    }

    public String getAppProtocol() {
        return appProtocol;
    }

    public void setAppProtocol(String appProtocol) {
        this.appProtocol = appProtocol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNodePort() {
        return nodePort;
    }

    public void setNodePort(Integer nodePort) {
        this.nodePort = nodePort;
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

    public IntOrString getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(IntOrString targetPort) {
        this.targetPort = targetPort;
    }

}