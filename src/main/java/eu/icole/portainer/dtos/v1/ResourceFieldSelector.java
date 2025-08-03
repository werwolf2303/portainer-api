package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.resource.Quantity;

public class ResourceFieldSelector {

    private String containerName;
    private Quantity divisor;
    private String resource;

    public ResourceFieldSelector() {
    }

    public ResourceFieldSelector(String containerName, Quantity divisor, String resource) {
        this.containerName = containerName;
        this.divisor = divisor;
        this.resource = resource;
    }

    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public Quantity getDivisor() {
        return divisor;
    }

    public void setDivisor(Quantity divisor) {
        this.divisor = divisor;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

}