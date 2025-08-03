package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.DiagnosticsData;
import eu.icole.portainer.dtos.portainer.DockerSnapshotRaw;

import java.util.List;

public class DockerSnapshot {

    private Integer ContainerCount;
    private DiagnosticsData DiagnosticsData;
    private DockerSnapshotRaw DockerSnapshotRaw;
    private String DockerVersion;
    private Boolean GpuUseAll;
    private List<String> GpuUseList;
    private Integer HealthyContainerCount;
    private Integer ImageCount;
    private Boolean IsPodman;
    private Integer NodeCount;
    private Integer RunningContainerCount;
    private Integer ServiceCount;
    private Integer StackCount;
    private Integer StoppedContainerCount;
    private Boolean Swarm;
    private Integer Time;
    private Integer TotalCPU;
    private Integer TotalMemory;
    private Integer UnhealthyContainerCount;
    private Integer VolumeCount;

    public DockerSnapshot() {
    }

    public DockerSnapshot(Integer ContainerCount, DiagnosticsData DiagnosticsData, DockerSnapshotRaw DockerSnapshotRaw, String DockerVersion, Boolean GpuUseAll, List<String> GpuUseList, Integer HealthyContainerCount, Integer ImageCount, Boolean IsPodman, Integer NodeCount, Integer RunningContainerCount, Integer ServiceCount, Integer StackCount, Integer StoppedContainerCount, Boolean Swarm, Integer Time, Integer TotalCPU, Integer TotalMemory, Integer UnhealthyContainerCount, Integer VolumeCount) {
        this.ContainerCount = ContainerCount;
        this.DiagnosticsData = DiagnosticsData;
        this.DockerSnapshotRaw = DockerSnapshotRaw;
        this.DockerVersion = DockerVersion;
        this.GpuUseAll = GpuUseAll;
        this.GpuUseList = GpuUseList;
        this.HealthyContainerCount = HealthyContainerCount;
        this.ImageCount = ImageCount;
        this.IsPodman = IsPodman;
        this.NodeCount = NodeCount;
        this.RunningContainerCount = RunningContainerCount;
        this.ServiceCount = ServiceCount;
        this.StackCount = StackCount;
        this.StoppedContainerCount = StoppedContainerCount;
        this.Swarm = Swarm;
        this.Time = Time;
        this.TotalCPU = TotalCPU;
        this.TotalMemory = TotalMemory;
        this.UnhealthyContainerCount = UnhealthyContainerCount;
        this.VolumeCount = VolumeCount;
    }

    public Integer getContainerCount() {
        return ContainerCount;
    }

    public void setContainerCount(Integer ContainerCount) {
        this.ContainerCount = ContainerCount;
    }

    public DiagnosticsData getDiagnosticsData() {
        return DiagnosticsData;
    }

    public void setDiagnosticsData(DiagnosticsData DiagnosticsData) {
        this.DiagnosticsData = DiagnosticsData;
    }

    public DockerSnapshotRaw getDockerSnapshotRaw() {
        return DockerSnapshotRaw;
    }

    public void setDockerSnapshotRaw(DockerSnapshotRaw DockerSnapshotRaw) {
        this.DockerSnapshotRaw = DockerSnapshotRaw;
    }

    public String getDockerVersion() {
        return DockerVersion;
    }

    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    public Boolean getGpuUseAll() {
        return GpuUseAll;
    }

    public void setGpuUseAll(Boolean GpuUseAll) {
        this.GpuUseAll = GpuUseAll;
    }

    public List<String> getGpuUseList() {
        return GpuUseList;
    }

    public void setGpuUseList(List<String> GpuUseList) {
        this.GpuUseList = GpuUseList;
    }

    public Integer getHealthyContainerCount() {
        return HealthyContainerCount;
    }

    public void setHealthyContainerCount(Integer HealthyContainerCount) {
        this.HealthyContainerCount = HealthyContainerCount;
    }

    public Integer getImageCount() {
        return ImageCount;
    }

    public void setImageCount(Integer ImageCount) {
        this.ImageCount = ImageCount;
    }

    public Boolean getIsPodman() {
        return IsPodman;
    }

    public void setIsPodman(Boolean IsPodman) {
        this.IsPodman = IsPodman;
    }

    public Integer getNodeCount() {
        return NodeCount;
    }

    public void setNodeCount(Integer NodeCount) {
        this.NodeCount = NodeCount;
    }

    public Integer getRunningContainerCount() {
        return RunningContainerCount;
    }

    public void setRunningContainerCount(Integer RunningContainerCount) {
        this.RunningContainerCount = RunningContainerCount;
    }

    public Integer getServiceCount() {
        return ServiceCount;
    }

    public void setServiceCount(Integer ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    public Integer getStackCount() {
        return StackCount;
    }

    public void setStackCount(Integer StackCount) {
        this.StackCount = StackCount;
    }

    public Integer getStoppedContainerCount() {
        return StoppedContainerCount;
    }

    public void setStoppedContainerCount(Integer StoppedContainerCount) {
        this.StoppedContainerCount = StoppedContainerCount;
    }

    public Boolean getSwarm() {
        return Swarm;
    }

    public void setSwarm(Boolean Swarm) {
        this.Swarm = Swarm;
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

    public Integer getUnhealthyContainerCount() {
        return UnhealthyContainerCount;
    }

    public void setUnhealthyContainerCount(Integer UnhealthyContainerCount) {
        this.UnhealthyContainerCount = UnhealthyContainerCount;
    }

    public Integer getVolumeCount() {
        return VolumeCount;
    }

    public void setVolumeCount(Integer VolumeCount) {
        this.VolumeCount = VolumeCount;
    }

}