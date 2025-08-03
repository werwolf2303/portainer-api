package eu.icole.portainer.dtos.kubernetes;

import java.util.List;

public class K8sIngressTLS {

    private List<String> Hosts;
    private String SecretName;

    public K8sIngressTLS() {
    }

    public K8sIngressTLS(List<String> Hosts, String SecretName) {
        this.Hosts = Hosts;
        this.SecretName = SecretName;
    }

    public List<String> getHosts() {
        return Hosts;
    }

    public void setHosts(List<String> Hosts) {
        this.Hosts = Hosts;
    }

    public String getSecretName() {
        return SecretName;
    }

    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

}