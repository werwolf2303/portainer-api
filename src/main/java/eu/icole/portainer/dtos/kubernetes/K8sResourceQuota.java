package eu.icole.portainer.dtos.kubernetes;


public class K8sResourceQuota {

    private String cpu;
    private Boolean enabled;
    private String memory;

    public K8sResourceQuota() {
    }

    public K8sResourceQuota(String cpu, Boolean enabled, String memory) {
        this.cpu = cpu;
        this.enabled = enabled;
        this.memory = memory;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

}