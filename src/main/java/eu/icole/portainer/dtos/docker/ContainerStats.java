package eu.icole.portainer.dtos.docker;


public class ContainerStats {

    private Integer healthy;
    private Integer running;
    private Integer stopped;
    private Integer total;
    private Integer unhealthy;

    public ContainerStats() {
    }

    public ContainerStats(Integer healthy, Integer running, Integer stopped, Integer total, Integer unhealthy) {
        this.healthy = healthy;
        this.running = running;
        this.stopped = stopped;
        this.total = total;
        this.unhealthy = unhealthy;
    }

    public Integer getHealthy() {
        return healthy;
    }

    public void setHealthy(Integer healthy) {
        this.healthy = healthy;
    }

    public Integer getRunning() {
        return running;
    }

    public void setRunning(Integer running) {
        this.running = running;
    }

    public Integer getStopped() {
        return stopped;
    }

    public void setStopped(Integer stopped) {
        this.stopped = stopped;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getUnhealthy() {
        return unhealthy;
    }

    public void setUnhealthy(Integer unhealthy) {
        this.unhealthy = unhealthy;
    }

}