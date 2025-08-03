package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.KubernetesIngressClassConfig;
import eu.icole.portainer.dtos.portainer.KubernetesStorageClassConfig;

import java.util.List;

public class KubernetesConfiguration {

    private Boolean AllowNoneIngressClass;
    private Boolean EnableResourceOverCommit;
    private Boolean IngressAvailabilityPerNamespace;
    private List<KubernetesIngressClassConfig> IngressClasses;
    private Integer ResourceOverCommitPercentage;
    private Boolean RestrictDefaultNamespace;
    private List<KubernetesStorageClassConfig> StorageClasses;
    private Boolean UseLoadBalancer;
    private Boolean UseServerMetrics;

    public KubernetesConfiguration() {
    }

    public KubernetesConfiguration(Boolean AllowNoneIngressClass, Boolean EnableResourceOverCommit, Boolean IngressAvailabilityPerNamespace, List<KubernetesIngressClassConfig> IngressClasses, Integer ResourceOverCommitPercentage, Boolean RestrictDefaultNamespace, List<KubernetesStorageClassConfig> StorageClasses, Boolean UseLoadBalancer, Boolean UseServerMetrics) {
        this.AllowNoneIngressClass = AllowNoneIngressClass;
        this.EnableResourceOverCommit = EnableResourceOverCommit;
        this.IngressAvailabilityPerNamespace = IngressAvailabilityPerNamespace;
        this.IngressClasses = IngressClasses;
        this.ResourceOverCommitPercentage = ResourceOverCommitPercentage;
        this.RestrictDefaultNamespace = RestrictDefaultNamespace;
        this.StorageClasses = StorageClasses;
        this.UseLoadBalancer = UseLoadBalancer;
        this.UseServerMetrics = UseServerMetrics;
    }

    public Boolean getAllowNoneIngressClass() {
        return AllowNoneIngressClass;
    }

    public void setAllowNoneIngressClass(Boolean AllowNoneIngressClass) {
        this.AllowNoneIngressClass = AllowNoneIngressClass;
    }

    public Boolean getEnableResourceOverCommit() {
        return EnableResourceOverCommit;
    }

    public void setEnableResourceOverCommit(Boolean EnableResourceOverCommit) {
        this.EnableResourceOverCommit = EnableResourceOverCommit;
    }

    public Boolean getIngressAvailabilityPerNamespace() {
        return IngressAvailabilityPerNamespace;
    }

    public void setIngressAvailabilityPerNamespace(Boolean IngressAvailabilityPerNamespace) {
        this.IngressAvailabilityPerNamespace = IngressAvailabilityPerNamespace;
    }

    public List<KubernetesIngressClassConfig> getIngressClasses() {
        return IngressClasses;
    }

    public void setIngressClasses(List<KubernetesIngressClassConfig> IngressClasses) {
        this.IngressClasses = IngressClasses;
    }

    public Integer getResourceOverCommitPercentage() {
        return ResourceOverCommitPercentage;
    }

    public void setResourceOverCommitPercentage(Integer ResourceOverCommitPercentage) {
        this.ResourceOverCommitPercentage = ResourceOverCommitPercentage;
    }

    public Boolean getRestrictDefaultNamespace() {
        return RestrictDefaultNamespace;
    }

    public void setRestrictDefaultNamespace(Boolean RestrictDefaultNamespace) {
        this.RestrictDefaultNamespace = RestrictDefaultNamespace;
    }

    public List<KubernetesStorageClassConfig> getStorageClasses() {
        return StorageClasses;
    }

    public void setStorageClasses(List<KubernetesStorageClassConfig> StorageClasses) {
        this.StorageClasses = StorageClasses;
    }

    public Boolean getUseLoadBalancer() {
        return UseLoadBalancer;
    }

    public void setUseLoadBalancer(Boolean UseLoadBalancer) {
        this.UseLoadBalancer = UseLoadBalancer;
    }

    public Boolean getUseServerMetrics() {
        return UseServerMetrics;
    }

    public void setUseServerMetrics(Boolean UseServerMetrics) {
        this.UseServerMetrics = UseServerMetrics;
    }

}