package eu.icole.portainer.olddtos;

import java.util.List;

public class KubernetesData {
    private KubernetesConfiguration Configuration;
    private KubernetesFlags Flags;
    private List<KubernetesSnapshot> Snapshots;

    public List<KubernetesSnapshot> getSnapshots() {
        return Snapshots;
    }

    public KubernetesFlags getFlags() {
        return Flags;
    }

    public KubernetesConfiguration getConfiguration() {
        return Configuration;
    }
}
