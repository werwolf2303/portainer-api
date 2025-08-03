package eu.icole.portainer.dtos.docker;

import eu.icole.portainer.dtos.docker.ContainerStats;
import eu.icole.portainer.dtos.docker.ImagesCounters;

public class DashboardResponse {

    private ContainerStats containers;
    private ImagesCounters images;
    private Integer networks;
    private Integer services;
    private Integer stacks;
    private Integer volumes;

    public DashboardResponse() {
    }

    public DashboardResponse(ContainerStats containers, ImagesCounters images, Integer networks, Integer services, Integer stacks, Integer volumes) {
        this.containers = containers;
        this.images = images;
        this.networks = networks;
        this.services = services;
        this.stacks = stacks;
        this.volumes = volumes;
    }

    public ContainerStats getContainers() {
        return containers;
    }

    public void setContainers(ContainerStats containers) {
        this.containers = containers;
    }

    public ImagesCounters getImages() {
        return images;
    }

    public void setImages(ImagesCounters images) {
        this.images = images;
    }

    public Integer getNetworks() {
        return networks;
    }

    public void setNetworks(Integer networks) {
        this.networks = networks;
    }

    public Integer getServices() {
        return services;
    }

    public void setServices(Integer services) {
        this.services = services;
    }

    public Integer getStacks() {
        return stacks;
    }

    public void setStacks(Integer stacks) {
        this.stacks = stacks;
    }

    public Integer getVolumes() {
        return volumes;
    }

    public void setVolumes(Integer volumes) {
        this.volumes = volumes;
    }

}