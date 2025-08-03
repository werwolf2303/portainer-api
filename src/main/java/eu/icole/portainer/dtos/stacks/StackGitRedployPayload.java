package eu.icole.portainer.dtos.stacks;

import eu.icole.portainer.dtos.portainer.Pair;

import java.util.List;

public class StackGitRedployPayload {

    private List<Pair> env;
    private Boolean prune;
    private Boolean pullImage;
    private Boolean repositoryAuthentication;
    private String repositoryPassword;
    private String repositoryReferenceName;
    private String repositoryUsername;
    private String stackName;

    public StackGitRedployPayload() {
    }

    public StackGitRedployPayload(List<Pair> env, Boolean prune, Boolean pullImage, Boolean repositoryAuthentication, String repositoryPassword, String repositoryReferenceName, String repositoryUsername, String stackName) {
        this.env = env;
        this.prune = prune;
        this.pullImage = pullImage;
        this.repositoryAuthentication = repositoryAuthentication;
        this.repositoryPassword = repositoryPassword;
        this.repositoryReferenceName = repositoryReferenceName;
        this.repositoryUsername = repositoryUsername;
        this.stackName = stackName;
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

    public Boolean getRepositoryAuthentication() {
        return repositoryAuthentication;
    }

    public void setRepositoryAuthentication(Boolean repositoryAuthentication) {
        this.repositoryAuthentication = repositoryAuthentication;
    }

    public String getRepositoryPassword() {
        return repositoryPassword;
    }

    public void setRepositoryPassword(String repositoryPassword) {
        this.repositoryPassword = repositoryPassword;
    }

    public String getRepositoryReferenceName() {
        return repositoryReferenceName;
    }

    public void setRepositoryReferenceName(String repositoryReferenceName) {
        this.repositoryReferenceName = repositoryReferenceName;
    }

    public String getRepositoryUsername() {
        return repositoryUsername;
    }

    public void setRepositoryUsername(String repositoryUsername) {
        this.repositoryUsername = repositoryUsername;
    }

    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

}