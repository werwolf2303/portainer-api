package eu.icole.portainer.dtos.build;

import java.util.List;

public class RuntimeInfo {

    private List<String> env;

    public RuntimeInfo() {
    }

    public RuntimeInfo(List<String> env) {
        this.env = env;
    }

    public List<String> getEnv() {
        return env;
    }

    public void setEnv(List<String> env) {
        this.env = env;
    }

}