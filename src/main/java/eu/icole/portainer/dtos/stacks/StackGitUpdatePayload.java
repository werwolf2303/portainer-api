package eu.icole.portainer.dtos.stacks;

import eu.icole.portainer.dtos.portainer.AutoUpdateSettings;
import eu.icole.portainer.dtos.portainer.Pair;

import java.util.List;

public class StackGitUpdatePayload {

    private AutoUpdateSettings autoUpdate;
    private List<Pair> env;
    private Boolean prune;
    private Boolean repositoryAuthentication;
    private String repositoryPassword;
    private String repositoryReferenceName;
    private String repositoryUsername;
    private Boolean tlsskipVerify;

    public StackGitUpdatePayload() {
    }

    public StackGitUpdatePayload(AutoUpdateSettings autoUpdate, List<Pair> env, Boolean prune, Boolean repositoryAuthentication, String repositoryPassword, String repositoryReferenceName, String repositoryUsername, Boolean tlsskipVerify) {
        this.autoUpdate = autoUpdate;
        this.env = env;
        this.prune = prune;
        this.repositoryAuthentication = repositoryAuthentication;
        this.repositoryPassword = repositoryPassword;
        this.repositoryReferenceName = repositoryReferenceName;
        this.repositoryUsername = repositoryUsername;
        this.tlsskipVerify = tlsskipVerify;
    }

    public AutoUpdateSettings getAutoUpdate() {
        return autoUpdate;
    }

    public void setAutoUpdate(AutoUpdateSettings autoUpdate) {
        this.autoUpdate = autoUpdate;
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

    public Boolean getTlsskipVerify() {
        return tlsskipVerify;
    }

    public void setTlsskipVerify(Boolean tlsskipVerify) {
        this.tlsskipVerify = tlsskipVerify;
    }

}