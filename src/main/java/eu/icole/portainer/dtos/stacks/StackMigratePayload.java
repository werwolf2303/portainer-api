package eu.icole.portainer.dtos.stacks;


public class StackMigratePayload {

    private Integer endpointID;
    private String name;
    private String swarmID;

    public StackMigratePayload() {
    }

    public StackMigratePayload(Integer endpointID, String name, String swarmID) {
        this.endpointID = endpointID;
        this.name = name;
        this.swarmID = swarmID;
    }

    public Integer getEndpointID() {
        return endpointID;
    }

    public void setEndpointID(Integer endpointID) {
        this.endpointID = endpointID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSwarmID() {
        return swarmID;
    }

    public void setSwarmID(String swarmID) {
        this.swarmID = swarmID;
    }

}