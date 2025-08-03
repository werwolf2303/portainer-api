package eu.icole.portainer.dtos.swarm;

import java.util.List;

public class ServiceUpdateResponse {

    private List<String> Warnings;

    public ServiceUpdateResponse() {
    }

    public ServiceUpdateResponse(List<String> Warnings) {
        this.Warnings = Warnings;
    }

    public List<String> getWarnings() {
        return Warnings;
    }

    public void setWarnings(List<String> Warnings) {
        this.Warnings = Warnings;
    }

}