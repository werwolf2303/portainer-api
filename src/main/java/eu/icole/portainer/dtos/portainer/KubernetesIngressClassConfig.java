package eu.icole.portainer.dtos.portainer;

import java.util.List;

public class KubernetesIngressClassConfig {

    private Boolean Blocked;
    private List<String> BlockedNamespaces;
    private String Name;
    private String Type;

    public KubernetesIngressClassConfig() {
    }

    public KubernetesIngressClassConfig(Boolean Blocked, List<String> BlockedNamespaces, String Name, String Type) {
        this.Blocked = Blocked;
        this.BlockedNamespaces = BlockedNamespaces;
        this.Name = Name;
        this.Type = Type;
    }

    public Boolean getBlocked() {
        return Blocked;
    }

    public void setBlocked(Boolean Blocked) {
        this.Blocked = Blocked;
    }

    public List<String> getBlockedNamespaces() {
        return BlockedNamespaces;
    }

    public void setBlockedNamespaces(List<String> BlockedNamespaces) {
        this.BlockedNamespaces = BlockedNamespaces;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

}