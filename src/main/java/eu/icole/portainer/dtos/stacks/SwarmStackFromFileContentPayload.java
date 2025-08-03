package eu.icole.portainer.dtos.stacks;

import eu.icole.portainer.dtos.portainer.Pair;

import java.util.List;

public class SwarmStackFromFileContentPayload {

    private List<Pair> env;
    private Boolean fromAppTemplate;
    private String name;
    private String stackFileContent;
    private String swarmID;

    public SwarmStackFromFileContentPayload() {
    }

    public SwarmStackFromFileContentPayload(List<Pair> env, Boolean fromAppTemplate, String name, String stackFileContent, String swarmID) {
        this.env = env;
        this.fromAppTemplate = fromAppTemplate;
        this.name = name;
        this.stackFileContent = stackFileContent;
        this.swarmID = swarmID;
    }

    public List<Pair> getEnv() {
        return env;
    }

    public void setEnv(List<Pair> env) {
        this.env = env;
    }

    public Boolean getFromAppTemplate() {
        return fromAppTemplate;
    }

    public void setFromAppTemplate(Boolean fromAppTemplate) {
        this.fromAppTemplate = fromAppTemplate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStackFileContent() {
        return stackFileContent;
    }

    public void setStackFileContent(String stackFileContent) {
        this.stackFileContent = stackFileContent;
    }

    public String getSwarmID() {
        return swarmID;
    }

    public void setSwarmID(String swarmID) {
        this.swarmID = swarmID;
    }

}