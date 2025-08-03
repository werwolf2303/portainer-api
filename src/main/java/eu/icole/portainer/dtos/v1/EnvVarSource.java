package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ConfigMapKeySelector;
import eu.icole.portainer.dtos.v1.ObjectFieldSelector;
import eu.icole.portainer.dtos.v1.ResourceFieldSelector;
import eu.icole.portainer.dtos.v1.SecretKeySelector;

public class EnvVarSource {

    private ConfigMapKeySelector configMapKeyRef;
    private ObjectFieldSelector fieldRef;
    private ResourceFieldSelector resourceFieldRef;
    private SecretKeySelector secretKeyRef;

    public EnvVarSource() {
    }

    public EnvVarSource(ConfigMapKeySelector configMapKeyRef, ObjectFieldSelector fieldRef, ResourceFieldSelector resourceFieldRef, SecretKeySelector secretKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
        this.fieldRef = fieldRef;
        this.resourceFieldRef = resourceFieldRef;
        this.secretKeyRef = secretKeyRef;
    }

    public ConfigMapKeySelector getConfigMapKeyRef() {
        return configMapKeyRef;
    }

    public void setConfigMapKeyRef(ConfigMapKeySelector configMapKeyRef) {
        this.configMapKeyRef = configMapKeyRef;
    }

    public ObjectFieldSelector getFieldRef() {
        return fieldRef;
    }

    public void setFieldRef(ObjectFieldSelector fieldRef) {
        this.fieldRef = fieldRef;
    }

    public ResourceFieldSelector getResourceFieldRef() {
        return resourceFieldRef;
    }

    public void setResourceFieldRef(ResourceFieldSelector resourceFieldRef) {
        this.resourceFieldRef = resourceFieldRef;
    }

    public SecretKeySelector getSecretKeyRef() {
        return secretKeyRef;
    }

    public void setSecretKeyRef(SecretKeySelector secretKeyRef) {
        this.secretKeyRef = secretKeyRef;
    }

}