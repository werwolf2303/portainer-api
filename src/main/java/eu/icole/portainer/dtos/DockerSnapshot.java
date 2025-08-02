package eu.icole.portainer.dtos;

import java.util.List;

public class DockerSnapshot {
    private int ContainerCount;
    private DiagnosticsData DiagnosticsData;
    private DockerSnapshotRaw DockerSnapshotRaw;
    private String DockerVersion;
    private boolean GpuUseAll;
    private List<String> GpuUseList;
    private int HealthyContainerCount;
    private int ImageCount;
    private boolean IsPodman;
    private int NodeCount;
    private int RunningContainerCount;
    private int ServiceCount;
    private int StackCount;
    private int StoppedContainerCount;
    private boolean Swarm;
    private int Time;
    private int TotalCPU;
    private long TotalMemory;
    private int UnhealthyContainerCount;
    private int VolumeCount;

    public int getContainerCount() {
        return ContainerCount;
    }

    public DiagnosticsData getDiagnosticsData() {
        return DiagnosticsData;
    }

    public DockerSnapshotRaw getDockerSnapshotRaw() {
        return DockerSnapshotRaw;
    }

    public String getDockerVersion() {
        return DockerVersion;
    }

    public boolean isGpuUseAll() {
        return GpuUseAll;
    }

    public List<String> getGpuUseList() {
        return GpuUseList;
    }

    public int getHealthyContainerCount() {
        return HealthyContainerCount;
    }

    public int getImageCount() {
        return ImageCount;
    }

    public boolean isPodman() {
        return IsPodman;
    }

    public int getNodeCount() {
        return NodeCount;
    }

    public int getRunningContainerCount() {
        return RunningContainerCount;
    }

    public int getServiceCount() {
        return ServiceCount;
    }

    public int getStackCount() {
        return StackCount;
    }

    public int getStoppedContainerCount() {
        return StoppedContainerCount;
    }

    public boolean isSwarm() {
        return Swarm;
    }

    public int getTime() {
        return Time;
    }

    public int getTotalCPU() {
        return TotalCPU;
    }

    public long getTotalMemory() {
        return TotalMemory;
    }

    public int getUnhealthyContainerCount() {
        return UnhealthyContainerCount;
    }

    public int getVolumeCount() {
        return VolumeCount;
    }
}
