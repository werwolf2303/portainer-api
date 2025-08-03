package eu.icole.portainer.dtos.portainer;


public class StackOption {

    private Boolean prune;

    public StackOption() {
    }

    public StackOption(Boolean prune) {
        this.prune = prune;
    }

    public Boolean getPrune() {
        return prune;
    }

    public void setPrune(Boolean prune) {
        this.prune = prune;
    }

}