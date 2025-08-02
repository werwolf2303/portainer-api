package eu.icole.portainer.dtos;

import java.util.List;

public class KubernetesConfiguration {
    private boolean AllowNoneIngressClass;
    private boolean EnableResourceOverCommit;
    private boolean IngressAvailabilityPerNamespace;
    private List<KubernetesIngressClassConfig> IngressClasses;
    private int ResourceOverCommitPercentage;
    private boolean RestrictDefaultNamespace;
    private List<KubernetesStorageClassConfig> StorageClasses;
    private boolean UseLoadBalancer;
    private boolean UseServerMetrics;

    public boolean isAllowNoneIngressClass() {
        return AllowNoneIngressClass;
    }

    public boolean isEnableResourceOverCommit() {
        return EnableResourceOverCommit;
    }

    public boolean isIngressAvailabilityPerNamespace() {
        return IngressAvailabilityPerNamespace;
    }

    public List<KubernetesIngressClassConfig> getIngressClasses() {
        return IngressClasses;
    }

    public int getResourceOverCommitPercentage() {
        return ResourceOverCommitPercentage;
    }

    public boolean isRestrictDefaultNamespace() {
        return RestrictDefaultNamespace;
    }

    public List<KubernetesStorageClassConfig> getStorageClasses() {
        return StorageClasses;
    }

    public boolean isUseLoadBalancer() {
        return UseLoadBalancer;
    }

    public boolean isUseServerMetrics() {
        return UseServerMetrics;
    }
}
