package eu.icole.portainer.dtos.endpoints;

import java.util.Map;

public class EndpointUpdateRelationsPayload {

    private Map<String, Object> relations;

    public EndpointUpdateRelationsPayload() {
    }

    public EndpointUpdateRelationsPayload(Map<String, Object> relations) {
        this.relations = relations;
    }

    public Map<String, Object> getRelations() {
        return relations;
    }

    public void setRelations(Map<String, Object> relations) {
        this.relations = relations;
    }

}