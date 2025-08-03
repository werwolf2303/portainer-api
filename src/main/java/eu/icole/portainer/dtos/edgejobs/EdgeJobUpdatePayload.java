package eu.icole.portainer.dtos.edgejobs;

import java.util.List;

public class EdgeJobUpdatePayload {

    private String cronExpression;
    private List<Integer> edgeGroups;
    private List<Integer> endpoints;
    private String fileContent;
    private String name;
    private Boolean recurring;

    public EdgeJobUpdatePayload() {
    }

    public EdgeJobUpdatePayload(String cronExpression, List<Integer> edgeGroups, List<Integer> endpoints, String fileContent, String name, Boolean recurring) {
        this.cronExpression = cronExpression;
        this.edgeGroups = edgeGroups;
        this.endpoints = endpoints;
        this.fileContent = fileContent;
        this.name = name;
        this.recurring = recurring;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public List<Integer> getEdgeGroups() {
        return edgeGroups;
    }

    public void setEdgeGroups(List<Integer> edgeGroups) {
        this.edgeGroups = edgeGroups;
    }

    public List<Integer> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<Integer> endpoints) {
        this.endpoints = endpoints;
    }

    public String getFileContent() {
        return fileContent;
    }

    public void setFileContent(String fileContent) {
        this.fileContent = fileContent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getRecurring() {
        return recurring;
    }

    public void setRecurring(Boolean recurring) {
        this.recurring = recurring;
    }

}