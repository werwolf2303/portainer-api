package eu.icole.portainer.dtos.portainer;


public class K8sNodeLimits {

    private Integer CPU;
    private Integer Memory;

    public K8sNodeLimits() {
    }

    public K8sNodeLimits(Integer CPU, Integer Memory) {
        this.CPU = CPU;
        this.Memory = Memory;
    }

    public Integer getCPU() {
        return CPU;
    }

    public void setCPU(Integer CPU) {
        this.CPU = CPU;
    }

    public Integer getMemory() {
        return Memory;
    }

    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

}