package eu.icole.portainer.olddtos;

public class KubernetesFlags {
    private boolean IsServerIngressClassDetected;
    private boolean IsServerMetricsDetected;
    private boolean IsServerStorageDetected;

    public boolean isServerIngressClassDetected() {
        return IsServerIngressClassDetected;
    }

    public boolean isServerMetricsDetected() {
        return IsServerMetricsDetected;
    }

    public boolean isServerStorageDetected() {
        return IsServerStorageDetected;
    }
}
