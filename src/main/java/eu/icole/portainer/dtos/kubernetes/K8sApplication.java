package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.*;
import eu.icole.portainer.dtos.v1.Service;
import eu.icole.portainer.dtos.v2.HorizontalPodAutoscaler;

import java.util.List;
import java.util.Map;

public class K8sApplication {

    private String ApplicationOwner;
    private String ApplicationType;
    private List<Configuration> Configurations;
    private List<Object> Containers;
    private String CreationDate;
    private String DeploymentType;
    private HorizontalPodAutoscaler HorizontalPodAutoscaler;
    private String Id;
    private String Image;
    private String Kind;
    private Map<String, Object> Labels;
    private String LoadBalancerIPAddress;
    private Map<String, Object> MatchLabels;
    private Metadata Metadata;
    private String Name;
    private String Namespace;
    private List<Pod> Pods;
    private List<PublishedPort> PublishedPorts;
    private K8sApplicationResource Resource;
    private String ResourcePool;
    private Integer RunningPodsCount;
    private String ServiceId;
    private String ServiceName;
    private String ServiceType;
    private List<Service> Services;
    private String StackId;
    private String StackName;
    private String Status;
    private Integer TotalPodsCount;
    private String Uid;

    public K8sApplication() {
    }

    public K8sApplication(String ApplicationOwner, String ApplicationType, List<Configuration> Configurations, List<Object> Containers, String CreationDate, String DeploymentType, HorizontalPodAutoscaler HorizontalPodAutoscaler, String Id, String Image, String Kind, Map<String, Object> Labels, String LoadBalancerIPAddress, Map<String, Object> MatchLabels, Metadata Metadata, String Name, String Namespace, List<Pod> Pods, List<PublishedPort> PublishedPorts, K8sApplicationResource Resource, String ResourcePool, Integer RunningPodsCount, String ServiceId, String ServiceName, String ServiceType, List<Service> Services, String StackId, String StackName, String Status, Integer TotalPodsCount, String Uid) {
        this.ApplicationOwner = ApplicationOwner;
        this.ApplicationType = ApplicationType;
        this.Configurations = Configurations;
        this.Containers = Containers;
        this.CreationDate = CreationDate;
        this.DeploymentType = DeploymentType;
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
        this.Id = Id;
        this.Image = Image;
        this.Kind = Kind;
        this.Labels = Labels;
        this.LoadBalancerIPAddress = LoadBalancerIPAddress;
        this.MatchLabels = MatchLabels;
        this.Metadata = Metadata;
        this.Name = Name;
        this.Namespace = Namespace;
        this.Pods = Pods;
        this.PublishedPorts = PublishedPorts;
        this.Resource = Resource;
        this.ResourcePool = ResourcePool;
        this.RunningPodsCount = RunningPodsCount;
        this.ServiceId = ServiceId;
        this.ServiceName = ServiceName;
        this.ServiceType = ServiceType;
        this.Services = Services;
        this.StackId = StackId;
        this.StackName = StackName;
        this.Status = Status;
        this.TotalPodsCount = TotalPodsCount;
        this.Uid = Uid;
    }

    public String getApplicationOwner() {
        return ApplicationOwner;
    }

    public void setApplicationOwner(String ApplicationOwner) {
        this.ApplicationOwner = ApplicationOwner;
    }

    public String getApplicationType() {
        return ApplicationType;
    }

    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    public List<Configuration> getConfigurations() {
        return Configurations;
    }

    public void setConfigurations(List<Configuration> Configurations) {
        this.Configurations = Configurations;
    }

    public List<Object> getContainers() {
        return Containers;
    }

    public void setContainers(List<Object> Containers) {
        this.Containers = Containers;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    public String getDeploymentType() {
        return DeploymentType;
    }

    public void setDeploymentType(String DeploymentType) {
        this.DeploymentType = DeploymentType;
    }

    public HorizontalPodAutoscaler getHorizontalPodAutoscaler() {
        return HorizontalPodAutoscaler;
    }

    public void setHorizontalPodAutoscaler(HorizontalPodAutoscaler HorizontalPodAutoscaler) {
        this.HorizontalPodAutoscaler = HorizontalPodAutoscaler;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    public Map<String, Object> getLabels() {
        return Labels;
    }

    public void setLabels(Map<String, Object> Labels) {
        this.Labels = Labels;
    }

    public String getLoadBalancerIPAddress() {
        return LoadBalancerIPAddress;
    }

    public void setLoadBalancerIPAddress(String LoadBalancerIPAddress) {
        this.LoadBalancerIPAddress = LoadBalancerIPAddress;
    }

    public Map<String, Object> getMatchLabels() {
        return MatchLabels;
    }

    public void setMatchLabels(Map<String, Object> MatchLabels) {
        this.MatchLabels = MatchLabels;
    }

    public Metadata getMetadata() {
        return Metadata;
    }

    public void setMetadata(Metadata Metadata) {
        this.Metadata = Metadata;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getNamespace() {
        return Namespace;
    }

    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    public List<Pod> getPods() {
        return Pods;
    }

    public void setPods(List<Pod> Pods) {
        this.Pods = Pods;
    }

    public List<PublishedPort> getPublishedPorts() {
        return PublishedPorts;
    }

    public void setPublishedPorts(List<PublishedPort> PublishedPorts) {
        this.PublishedPorts = PublishedPorts;
    }

    public K8sApplicationResource getResource() {
        return Resource;
    }

    public void setResource(K8sApplicationResource Resource) {
        this.Resource = Resource;
    }

    public String getResourcePool() {
        return ResourcePool;
    }

    public void setResourcePool(String ResourcePool) {
        this.ResourcePool = ResourcePool;
    }

    public Integer getRunningPodsCount() {
        return RunningPodsCount;
    }

    public void setRunningPodsCount(Integer RunningPodsCount) {
        this.RunningPodsCount = RunningPodsCount;
    }

    public String getServiceId() {
        return ServiceId;
    }

    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    public String getServiceType() {
        return ServiceType;
    }

    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    public List<Service> getServices() {
        return Services;
    }

    public void setServices(List<Service> Services) {
        this.Services = Services;
    }

    public String getStackId() {
        return StackId;
    }

    public void setStackId(String StackId) {
        this.StackId = StackId;
    }

    public String getStackName() {
        return StackName;
    }

    public void setStackName(String StackName) {
        this.StackName = StackName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public Integer getTotalPodsCount() {
        return TotalPodsCount;
    }

    public void setTotalPodsCount(Integer TotalPodsCount) {
        this.TotalPodsCount = TotalPodsCount;
    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String Uid) {
        this.Uid = Uid;
    }

}