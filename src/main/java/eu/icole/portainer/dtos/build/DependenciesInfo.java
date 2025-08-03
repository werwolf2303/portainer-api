package eu.icole.portainer.dtos.build;


public class DependenciesInfo {

    private String composeVersion;
    private String dockerVersion;
    private String helmVersion;
    private String kubectlVersion;

    public DependenciesInfo() {
    }

    public DependenciesInfo(String composeVersion, String dockerVersion, String helmVersion, String kubectlVersion) {
        this.composeVersion = composeVersion;
        this.dockerVersion = dockerVersion;
        this.helmVersion = helmVersion;
        this.kubectlVersion = kubectlVersion;
    }

    public String getComposeVersion() {
        return composeVersion;
    }

    public void setComposeVersion(String composeVersion) {
        this.composeVersion = composeVersion;
    }

    public String getDockerVersion() {
        return dockerVersion;
    }

    public void setDockerVersion(String dockerVersion) {
        this.dockerVersion = dockerVersion;
    }

    public String getHelmVersion() {
        return helmVersion;
    }

    public void setHelmVersion(String helmVersion) {
        this.helmVersion = helmVersion;
    }

    public String getKubectlVersion() {
        return kubectlVersion;
    }

    public void setKubectlVersion(String kubectlVersion) {
        this.kubectlVersion = kubectlVersion;
    }

}