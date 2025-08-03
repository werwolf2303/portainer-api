package eu.icole.portainer.dtos.stacks;


public class KubernetesManifestURLDeploymentPayload {

    private Boolean composeFormat;
    private String manifestURL;
    private String namespace;
    private String stackName;

    public KubernetesManifestURLDeploymentPayload() {
    }

    public KubernetesManifestURLDeploymentPayload(Boolean composeFormat, String manifestURL, String namespace, String stackName) {
        this.composeFormat = composeFormat;
        this.manifestURL = manifestURL;
        this.namespace = namespace;
        this.stackName = stackName;
    }

    public Boolean getComposeFormat() {
        return composeFormat;
    }

    public void setComposeFormat(Boolean composeFormat) {
        this.composeFormat = composeFormat;
    }

    public String getManifestURL() {
        return manifestURL;
    }

    public void setManifestURL(String manifestURL) {
        this.manifestURL = manifestURL;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

}