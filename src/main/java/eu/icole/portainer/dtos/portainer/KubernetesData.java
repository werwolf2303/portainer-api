package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.KubernetesConfiguration;
import eu.icole.portainer.dtos.portainer.KubernetesFlags;
import eu.icole.portainer.dtos.portainer.KubernetesSnapshot;

import java.util.List;

public class KubernetesData {

    private KubernetesConfiguration Configuration;
    private KubernetesFlags Flags;
    private List<KubernetesSnapshot> Snapshots;

    public KubernetesData() {
    }

    public KubernetesData(KubernetesConfiguration Configuration, KubernetesFlags Flags, List<KubernetesSnapshot> Snapshots) {
        this.Configuration = Configuration;
        this.Flags = Flags;
        this.Snapshots = Snapshots;
    }

    public KubernetesConfiguration getConfiguration() {
        return Configuration;
    }

    public void setConfiguration(KubernetesConfiguration Configuration) {
        this.Configuration = Configuration;
    }

    public KubernetesFlags getFlags() {
        return Flags;
    }

    public void setFlags(KubernetesFlags Flags) {
        this.Flags = Flags;
    }

    public List<KubernetesSnapshot> getSnapshots() {
        return Snapshots;
    }

    public void setSnapshots(List<KubernetesSnapshot> Snapshots) {
        this.Snapshots = Snapshots;
    }

}