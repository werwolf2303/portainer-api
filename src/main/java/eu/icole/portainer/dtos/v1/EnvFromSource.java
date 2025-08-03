package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ConfigMapEnvSource;
import eu.icole.portainer.dtos.v1.SecretEnvSource;

public class EnvFromSource {

    private ConfigMapEnvSource configMapRef;
    private String prefix;
    private SecretEnvSource secretRef;

    public EnvFromSource() {
    }

    public EnvFromSource(ConfigMapEnvSource configMapRef, String prefix, SecretEnvSource secretRef) {
        this.configMapRef = configMapRef;
        this.prefix = prefix;
        this.secretRef = secretRef;
    }

    public ConfigMapEnvSource getConfigMapRef() {
        return configMapRef;
    }

    public void setConfigMapRef(ConfigMapEnvSource configMapRef) {
        this.configMapRef = configMapRef;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public SecretEnvSource getSecretRef() {
        return secretRef;
    }

    public void setSecretRef(SecretEnvSource secretRef) {
        this.secretRef = secretRef;
    }

}