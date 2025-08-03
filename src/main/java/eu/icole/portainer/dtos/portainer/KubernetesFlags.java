package eu.icole.portainer.dtos.portainer;


public class KubernetesFlags {

    private Boolean IsServerIngressClassDetected;
    private Boolean IsServerMetricsDetected;
    private Boolean IsServerStorageDetected;

    public KubernetesFlags() {
    }

    public KubernetesFlags(Boolean IsServerIngressClassDetected, Boolean IsServerMetricsDetected, Boolean IsServerStorageDetected) {
        this.IsServerIngressClassDetected = IsServerIngressClassDetected;
        this.IsServerMetricsDetected = IsServerMetricsDetected;
        this.IsServerStorageDetected = IsServerStorageDetected;
    }

    public Boolean getIsServerIngressClassDetected() {
        return IsServerIngressClassDetected;
    }

    public void setIsServerIngressClassDetected(Boolean IsServerIngressClassDetected) {
        this.IsServerIngressClassDetected = IsServerIngressClassDetected;
    }

    public Boolean getIsServerMetricsDetected() {
        return IsServerMetricsDetected;
    }

    public void setIsServerMetricsDetected(Boolean IsServerMetricsDetected) {
        this.IsServerMetricsDetected = IsServerMetricsDetected;
    }

    public Boolean getIsServerStorageDetected() {
        return IsServerStorageDetected;
    }

    public void setIsServerStorageDetected(Boolean IsServerStorageDetected) {
        this.IsServerStorageDetected = IsServerStorageDetected;
    }

}