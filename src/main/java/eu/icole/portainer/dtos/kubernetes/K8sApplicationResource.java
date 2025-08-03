package eu.icole.portainer.dtos.kubernetes;


public class K8sApplicationResource {

    private Double CpuLimit;
    private Double CpuRequest;
    private Integer MemoryLimit;
    private Integer MemoryRequest;

    public K8sApplicationResource() {
    }

    public K8sApplicationResource(Double CpuLimit, Double CpuRequest, Integer MemoryLimit, Integer MemoryRequest) {
        this.CpuLimit = CpuLimit;
        this.CpuRequest = CpuRequest;
        this.MemoryLimit = MemoryLimit;
        this.MemoryRequest = MemoryRequest;
    }

    public Double getCpuLimit() {
        return CpuLimit;
    }

    public void setCpuLimit(Double CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    public Double getCpuRequest() {
        return CpuRequest;
    }

    public void setCpuRequest(Double CpuRequest) {
        this.CpuRequest = CpuRequest;
    }

    public Integer getMemoryLimit() {
        return MemoryLimit;
    }

    public void setMemoryLimit(Integer MemoryLimit) {
        this.MemoryLimit = MemoryLimit;
    }

    public Integer getMemoryRequest() {
        return MemoryRequest;
    }

    public void setMemoryRequest(Integer MemoryRequest) {
        this.MemoryRequest = MemoryRequest;
    }

}