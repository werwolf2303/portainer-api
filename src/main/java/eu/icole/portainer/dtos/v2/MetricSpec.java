package eu.icole.portainer.dtos.v2;

import eu.icole.portainer.dtos.v2.*;

public class MetricSpec {

    private ContainerResourceMetricSource containerResource;
    private ExternalMetricSource external;
    private ObjectMetricSource object;
    private PodsMetricSource pods;
    private ResourceMetricSource resource;
    private String type;

    public MetricSpec() {
    }

    public MetricSpec(ContainerResourceMetricSource containerResource, ExternalMetricSource external, ObjectMetricSource object, PodsMetricSource pods, ResourceMetricSource resource, String type) {
        this.containerResource = containerResource;
        this.external = external;
        this.object = object;
        this.pods = pods;
        this.resource = resource;
        this.type = type;
    }

    public ContainerResourceMetricSource getContainerResource() {
        return containerResource;
    }

    public void setContainerResource(ContainerResourceMetricSource containerResource) {
        this.containerResource = containerResource;
    }

    public ExternalMetricSource getExternal() {
        return external;
    }

    public void setExternal(ExternalMetricSource external) {
        this.external = external;
    }

    public ObjectMetricSource getObject() {
        return object;
    }

    public void setObject(ObjectMetricSource object) {
        this.object = object;
    }

    public PodsMetricSource getPods() {
        return pods;
    }

    public void setPods(PodsMetricSource pods) {
        this.pods = pods;
    }

    public ResourceMetricSource getResource() {
        return resource;
    }

    public void setResource(ResourceMetricSource resource) {
        this.resource = resource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}