package eu.icole.portainer.dtos.v1beta1;

import eu.icole.portainer.dtos.v1.ResourceList;

public class ContainerMetrics {

    private String name;
    private ResourceList usage;

    public ContainerMetrics() {
    }

    public ContainerMetrics(String name, ResourceList usage) {
        this.name = name;
        this.usage = usage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceList getUsage() {
        return usage;
    }

    public void setUsage(ResourceList usage) {
        this.usage = usage;
    }

}