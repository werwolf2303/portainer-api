package eu.icole.portainer.dtos.stacks;


public class KubernetesStringDeploymentPayload {

    private Boolean composeFormat;
    private Boolean fromAppTemplate;
    private String namespace;
    private String stackFileContent;
    private String stackName;

    public KubernetesStringDeploymentPayload() {
    }

    public KubernetesStringDeploymentPayload(Boolean composeFormat, Boolean fromAppTemplate, String namespace, String stackFileContent, String stackName) {
        this.composeFormat = composeFormat;
        this.fromAppTemplate = fromAppTemplate;
        this.namespace = namespace;
        this.stackFileContent = stackFileContent;
        this.stackName = stackName;
    }

    public Boolean getComposeFormat() {
        return composeFormat;
    }

    public void setComposeFormat(Boolean composeFormat) {
        this.composeFormat = composeFormat;
    }

    public Boolean getFromAppTemplate() {
        return fromAppTemplate;
    }

    public void setFromAppTemplate(Boolean fromAppTemplate) {
        this.fromAppTemplate = fromAppTemplate;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getStackFileContent() {
        return stackFileContent;
    }

    public void setStackFileContent(String stackFileContent) {
        this.stackFileContent = stackFileContent;
    }

    public String getStackName() {
        return stackName;
    }

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

}