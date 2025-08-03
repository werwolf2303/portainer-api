package eu.icole.portainer.dtos.kubernetes;


public class NamespacesToggleSystemPayload {

    private Boolean system;

    public NamespacesToggleSystemPayload() {
    }

    public NamespacesToggleSystemPayload(Boolean system) {
        this.system = system;
    }

    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

}