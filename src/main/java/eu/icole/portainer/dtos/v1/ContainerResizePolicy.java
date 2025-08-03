package eu.icole.portainer.dtos.v1;


public class ContainerResizePolicy {

    private String resourceName;
    private String restartPolicy;

    public ContainerResizePolicy() {
    }

    public ContainerResizePolicy(String resourceName, String restartPolicy) {
        this.resourceName = resourceName;
        this.restartPolicy = restartPolicy;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

}