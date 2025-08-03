package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.*;

public class MetricStatus {

    private ContainerResourceMetricStatus containerResource;
    private ExternalMetricStatus external;
    private ObjectMetricStatus object;
    private PodsMetricStatus pods;
    private ResourceMetricStatus resource;
    private String type;

    public MetricStatus() {
    }

    public MetricStatus(ContainerResourceMetricStatus containerResource, ExternalMetricStatus external, ObjectMetricStatus object, PodsMetricStatus pods, ResourceMetricStatus resource, String type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = type;
    }

    public ContainerResourceMetricStatus getContainerResource() {
        return containerResource;
    }

    public void setContainerResource(ContainerResourceMetricStatus containerResource) {
        this.containerResource = containerResource;
    }

    public ExternalMetricStatus getExternal() {
        return external;
    }

    public void setExternal(ExternalMetricStatus external) {
        this.external = external;
    }

    public ObjectMetricStatus getObject() {
        return object;
    }

    public void setObject(ObjectMetricStatus object) {
        this.object = object;
    }

    public PodsMetricStatus getPods() {
        return pods;
    }

    public void setPods(PodsMetricStatus pods) {
        this.pods = pods;
    }

    public ResourceMetricStatus getResource() {
        return resource;
    }

    public void setResource(ResourceMetricStatus resource) {
        this.resource = resource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}