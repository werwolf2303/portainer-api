package eu.icole.portainer.dtos.system;


public class SystemInfoResponse {

    private Integer agents;
    private Integer edgeAgents;
    private String platform;

    public SystemInfoResponse() {
    }

    public SystemInfoResponse(Integer agents, Integer edgeAgents, String platform) {
        this.agents = agents;
        this.edgeAgents = edgeAgents;
        this.platform = platform;
    }

    public Integer getAgents() {
        return agents;
    }

    public void setAgents(Integer agents) {
        this.agents = agents;
    }

    public Integer getEdgeAgents() {
        return edgeAgents;
    }

    public void setEdgeAgents(Integer edgeAgents) {
        this.edgeAgents = edgeAgents;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

}