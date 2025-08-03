package eu.icole.portainer.dtos.release;

import eu.icole.portainer.dtos.release.Dependency;

import java.util.List;

public class Lock {

    private List<Dependency> dependencies;
    private String digest;
    private String generated;

    public Lock() {
    }

    public Lock(List<Dependency> dependencies, String digest, String generated) {
        this.dependencies = dependencies;
        this.digest = digest;
        this.generated = generated;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getGenerated() {
        return generated;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }

}