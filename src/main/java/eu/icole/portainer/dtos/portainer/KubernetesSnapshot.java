package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.DiagnosticsData;

public class KubernetesSnapshot {

    private DiagnosticsData DiagnosticsData;
    private String KubernetesVersion;
    private Integer NodeCount;
    private Integer Time;
    private Integer TotalCPU;
    private Integer TotalMemory;

    public KubernetesSnapshot() {
    }

    public KubernetesSnapshot(DiagnosticsData DiagnosticsData, String KubernetesVersion, Integer NodeCount, Integer Time, Integer TotalCPU, Integer TotalMemory) {
        this.DiagnosticsData = DiagnosticsData;
        this.KubernetesVersion = KubernetesVersion;
        this.NodeCount = NodeCount;
        this.Time = Time;
        this.TotalCPU = TotalCPU;
        this.TotalMemory = TotalMemory;
    }

    public DiagnosticsData getDiagnosticsData() {
        return DiagnosticsData;
    }

    public void setDiagnosticsData(DiagnosticsData DiagnosticsData) {
        this.DiagnosticsData = DiagnosticsData;
    }

    public String getKubernetesVersion() {
        return KubernetesVersion;
    }

    public void setKubernetesVersion(String KubernetesVersion) {
        this.KubernetesVersion = KubernetesVersion;
    }

    public Integer getNodeCount() {
        return NodeCount;
    }

    public void setNodeCount(Integer NodeCount) {
        this.NodeCount = NodeCount;
    }

    public Integer getTime() {
        return Time;
    }

    public void setTime(Integer Time) {
        this.Time = Time;
    }

    public Integer getTotalCPU() {
        return TotalCPU;
    }

    public void setTotalCPU(Integer TotalCPU) {
        this.TotalCPU = TotalCPU;
    }

    public Integer getTotalMemory() {
        return TotalMemory;
    }

    public void setTotalMemory(Integer TotalMemory) {
        this.TotalMemory = TotalMemory;
    }

}