package eu.icole.portainer.olddtos;

import java.util.List;

public class KubernetesIngressClassConfig {
    private boolean Blocked;
    private List<String> BlockedNamespaces;
    private String Name;
    private String Type;

    public boolean isBlocked() {
        return Blocked;
    }

    public List<String> getBlockedNamespaces() {
        return BlockedNamespaces;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }
}
