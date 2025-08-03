package eu.icole.portainer.dtos.system;


public class NodesCountResponse {

    private Integer nodes;

    public NodesCountResponse() {
    }

    public NodesCountResponse(Integer nodes) {
        this.nodes = nodes;
    }

    public Integer getNodes() {
        return nodes;
    }

    public void setNodes(Integer nodes) {
        this.nodes = nodes;
    }

}