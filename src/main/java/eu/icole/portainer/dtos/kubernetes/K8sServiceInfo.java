package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.K8sApplication;
import eu.icole.portainer.dtos.kubernetes.K8sServiceIngress;
import eu.icole.portainer.dtos.kubernetes.K8sServicePort;

import java.util.List;
import java.util.Map;

public class K8sServiceInfo {

    private Boolean allocateLoadBalancerNodePorts;
    private Map<String, Object> annotations;
    private List<K8sApplication> applications;
    private List<String> clusterIPs;
    private String creationDate;
    private List<String> externalIPs;
    private String externalName;
    private List<K8sServiceIngress> ingressStatus;
    private Map<String, Object> labels;
    private String name;
    private String namespace;
    private List<K8sServicePort> ports;
    private Map<String, Object> selector;
    private String type;
    private String uid;

    public K8sServiceInfo() {
    }

    public K8sServiceInfo(Boolean allocateLoadBalancerNodePorts, Map<String, Object> annotations, List<K8sApplication> applications, List<String> clusterIPs, String creationDate, List<String> externalIPs, String externalName, List<K8sServiceIngress> ingressStatus, Map<String, Object> labels, String name, String namespace, List<K8sServicePort> ports, Map<String, Object> selector, String type, String uid) {
        this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
        this.annotations = annotations;
        this.applications = applications;
        this.clusterIPs = clusterIPs;
        this.creationDate = creationDate;
        this.externalIPs = externalIPs;
        this.externalName = externalName;
        this.ingressStatus = ingressStatus;
        this.labels = labels;
        this.name = name;
        this.namespace = namespace;
        this.ports = ports;
        this.selector = selector;
        this.type = type;
        this.uid = uid;
    }

    public Boolean getAllocateLoadBalancerNodePorts() {
        return allocateLoadBalancerNodePorts;
    }

    public void setAllocateLoadBalancerNodePorts(Boolean allocateLoadBalancerNodePorts) {
        this.allocateLoadBalancerNodePorts = allocateLoadBalancerNodePorts;
    }

    public Map<String, Object> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
        this.annotations = annotations;
    }

    public List<K8sApplication> getApplications() {
        return applications;
    }

    public void setApplications(List<K8sApplication> applications) {
        this.applications = applications;
    }

    public List<String> getClusterIPs() {
        return clusterIPs;
    }

    public void setClusterIPs(List<String> clusterIPs) {
        this.clusterIPs = clusterIPs;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
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

    public List<K8sServiceIngress> getIngressStatus() {
        return ingressStatus;
    }

    public void setIngressStatus(List<K8sServiceIngress> ingressStatus) {
        this.ingressStatus = ingressStatus;
    }

    public Map<String, Object> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, Object> labels) {
        this.labels = labels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<K8sServicePort> getPorts() {
        return ports;
    }

    public void setPorts(List<K8sServicePort> ports) {
        this.ports = ports;
    }

    public Map<String, Object> getSelector() {
        return selector;
    }

    public void setSelector(Map<String, Object> selector) {
        this.selector = selector;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}