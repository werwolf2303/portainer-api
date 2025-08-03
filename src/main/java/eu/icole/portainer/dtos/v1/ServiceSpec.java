package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ServicePort;
import eu.icole.portainer.dtos.v1.SessionAffinityConfig;

import java.util.List;
import java.util.Map;

public class ServiceSpec {

    private Boolean allocateLoadBalancerNodePorts;
    private String clusterIP;
    private List<String> clusterIPs;
    private List<String> externalIPs;
    private String externalName;
    private String externalTrafficPolicy;
    private Integer healthCheckNodePort;
    private String internalTrafficPolicy;
    private List<String> ipFamilies;
    private String ipFamilyPolicy;
    private String loadBalancerClass;
    private String loadBalancerIP;
    private List<String> loadBalancerSourceRanges;
    private List<ServicePort> ports;
    private Boolean publishNotReadyAddresses;
    private Map<String, Object> selector;
    private String sessionAffinity;
    private SessionAffinityConfig sessionAffinityConfig;
    private String type;

    public ServiceSpec() {
    }

    public ServiceSpec(Boolean allocateLoadBalancerNodePorts, String clusterIP, List<String> clusterIPs, List<String> externalIPs, String externalName, String externalTrafficPolicy, Integer healthCheckNodePort, String internalTrafficPolicy, List<String> ipFamilies, String ipFamilyPolicy, String loadBalancerClass, String loadBalancerIP, List<String> loadBalancerSourceRanges, List<ServicePort> ports, Boolean publishNotReadyAddresses, Map<String, Object> selector, String sessionAffinity, SessionAffinityConfig sessionAffinityConfig, String type) {
        this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
        this.clusterIP = clusterIP;
        this.clusterIPs = clusterIPs;
        this.externalIPs = externalIPs;
        this.externalName = externalName;
        this.externalTrafficPolicy = externalTrafficPolicy;
        this.healthCheckNodePort = healthCheckNodePort;
        this.internalTrafficPolicy = internalTrafficPolicy;
        this.ipFamilies = ipFamilies;
        this.ipFamilyPolicy = ipFamilyPolicy;
        this.loadBalancerClass = loadBalancerClass;
        this.loadBalancerIP = loadBalancerIP;
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
        this.ports = ports;
        this.publishNotReadyAddresses = publishNotReadyAddresses;
        this.selector = selector;
        this.sessionAffinity = sessionAffinity;
        this.sessionAffinityConfig = sessionAffinityConfig;
        this.type = type;
    }

    public Boolean getAllocateLoadBalancerNodePorts() {
        return allocateLoadBalancerNodePorts;
    }

    public void setAllocateLoadBalancerNodePorts(Boolean allocateLoadBalancerNodePorts) {
        this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
    }

    public String getClusterIP() {
        return clusterIP;
    }

    public void setClusterIP(String clusterIP) {
        this.clusterIP = clusterIP;
    }

    public List<String> getClusterIPs() {
        return clusterIPs;
    }

    public void setClusterIPs(List<String> clusterIPs) {
        this.clusterIPs = clusterIPs;
    }

    public List<String> getExternalIPs() {
        return externalIPs;
    }

    public void setExternalIPs(List<String> externalIPs) {
        this.externalIPs = externalIPs;
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getExternalTrafficPolicy() {
        return externalTrafficPolicy;
    }

    public void setExternalTrafficPolicy(String externalTrafficPolicy) {
        this.externalTrafficPolicy = externalTrafficPolicy;
    }

    public Integer getHealthCheckNodePort() {
        return healthCheckNodePort;
    }

    public void setHealthCheckNodePort(Integer healthCheckNodePort) {
        this.healthCheckNodePort = healthCheckNodePort;
    }

    public String getInternalTrafficPolicy() {
        return internalTrafficPolicy;
    }

    public void setInternalTrafficPolicy(String internalTrafficPolicy) {
        this.internalTrafficPolicy = internalTrafficPolicy;
    }

    public List<String> getIpFamilies() {
        return ipFamilies;
    }

    public void setIpFamilies(List<String> ipFamilies) {
        this.ipFamilies = ipFamilies;
    }

    public String getIpFamilyPolicy() {
        return ipFamilyPolicy;
    }

    public void setIpFamilyPolicy(String ipFamilyPolicy) {
        this.ipFamilyPolicy = ipFamilyPolicy;
    }

    public String getLoadBalancerClass() {
        return loadBalancerClass;
    }

    public void setLoadBalancerClass(String loadBalancerClass) {
        this.loadBalancerClass = loadBalancerClass;
    }

    public String getLoadBalancerIP() {
        return loadBalancerIP;
    }

    public void setLoadBalancerIP(String loadBalancerIP) {
        this.loadBalancerIP = loadBalancerIP;
    }

    public List<String> getLoadBalancerSourceRanges() {
        return loadBalancerSourceRanges;
    }

    public void setLoadBalancerSourceRanges(List<String> loadBalancerSourceRanges) {
        this.loadBalancerSourceRanges = loadBalancerSourceRanges;
    }

    public List<ServicePort> getPorts() {
        return ports;
    }

    public void setPorts(List<ServicePort> ports) {
        this.ports = ports;
    }

    public Boolean getPublishNotReadyAddresses() {
        return publishNotReadyAddresses;
    }

    public void setPublishNotReadyAddresses(Boolean publishNotReadyAddresses) {
        this.publishNotReadyAddresses = publishNotReadyAddresses;
    }

    public Map<String, Object> getSelector() {
        return selector;
    }

    public void setSelector(Map<String, Object> selector) {
        this.selector = selector;
    }

    public String getSessionAffinity() {
        return sessionAffinity;
    }

    public void setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
    }

    public SessionAffinityConfig getSessionAffinityConfig() {
        return sessionAffinityConfig;
    }

    public void setSessionAffinityConfig(SessionAffinityConfig sessionAffinityConfig) {
        this.sessionAffinityConfig = sessionAffinityConfig;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}