package eu.icole.portainer.dtos.kubernetes;

import java.util.Map;

public class Configuration {

    private String ConfigurationOwner;
    private Map<String, Object> Data;
    private String Kind;

    public Configuration() {
    }

    public Configuration(String ConfigurationOwner, Map<String, Object> Data, String Kind) {
        this.ConfigurationOwner = ConfigurationOwner;
        this.Data = Data;
        this.Kind = Kind;
    }

    public String getConfigurationOwner() {
        return ConfigurationOwner;
    }

    public void setConfigurationOwner(String ConfigurationOwner) {
        this.ConfigurationOwner = ConfigurationOwner;
    }

    public Map<String, Object> getData() {
        return Data;
    }

    public void setData(Map<String, Object> Data) {
        this.Data = Data;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String Kind) {
        this.Kind = Kind;
    }

}