package eu.icole.portainer.dtos;

public class KubernetesSnapshot {
    private DiagnosticsData DiagnosticsData;
    private String KubernetesVersion;
    private int NodeCount;
    private int Time;
    private int TotalCPU;
    private int TotalMemory;

    public DiagnosticsData getDiagnosticsData() {
        return DiagnosticsData;
    }

    public String getKubernetesVersion() {
        return KubernetesVersion;
    }

    public int getNodeCount() {
        return NodeCount;
    }

    public int getTime() {
        return Time;
    }

    public int getTotalCPU() {
        return TotalCPU;
    }

    public int getTotalMemory() {
        return TotalMemory;
    }
}
