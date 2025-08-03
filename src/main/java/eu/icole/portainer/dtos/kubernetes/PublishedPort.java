package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.IngressRule;

import java.util.List;

public class PublishedPort {

    private List<IngressRule> IngressRules;
    private Integer Port;

    public PublishedPort() {
    }

    public PublishedPort(List<IngressRule> IngressRules, Integer Port) {
        this.IngressRules = IngressRules;
        this.Port = Port;
    }

    public List<IngressRule> getIngressRules() {
        return IngressRules;
    }

    public void setIngressRules(List<IngressRule> IngressRules) {
        this.IngressRules = IngressRules;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer Port) {
        this.Port = Port;
    }

}