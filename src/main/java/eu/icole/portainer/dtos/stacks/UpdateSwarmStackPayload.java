package eu.icole.portainer.dtos.stacks;

import eu.icole.portainer.dtos.portainer.Pair;

import java.util.List;

public class UpdateSwarmStackPayload {

    private List<Pair> env;
    private Boolean prune;
    private Boolean pullImage;
    private String stackFileContent;

    public UpdateSwarmStackPayload() {
    }

    public UpdateSwarmStackPayload(List<Pair> env, Boolean prune, Boolean pullImage, String stackFileContent) {
        this.env = env;
        this.prune = prune;
        this.pullImage = pullImage;
        this.stackFileContent = stackFileContent;
    }

    public List<Pair> getEnv() {
        return env;
    }

    public void setEnv(List<Pair> env) {
        this.env = env;
    }

    public Boolean getPrune() {
        return prune;
    }

    public void setPrune(Boolean prune) {
        this.prune = prune;
    }

    public Boolean getPullImage() {
        return pullImage;
    }

    public void setPullImage(Boolean pullImage) {
        this.pullImage = pullImage;
    }

    public String getStackFileContent() {
        return stackFileContent;
    }

    public void setStackFileContent(String stackFileContent) {
        this.stackFileContent = stackFileContent;
    }

}