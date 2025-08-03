package eu.icole.portainer.dtos.v1;


public class ClientIPConfig {

    private Integer timeoutSeconds;

    public ClientIPConfig() {
    }

    public ClientIPConfig(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

}