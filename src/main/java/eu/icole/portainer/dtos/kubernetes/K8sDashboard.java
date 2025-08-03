package eu.icole.portainer.dtos.kubernetes;


public class K8sDashboard {

    private Integer applicationsCount;
    private Integer configMapsCount;
    private Integer ingressesCount;
    private Integer namespacesCount;
    private Integer secretsCount;
    private Integer servicesCount;
    private Integer volumesCount;

    public K8sDashboard() {
    }

    public K8sDashboard(Integer applicationsCount, Integer configMapsCount, Integer ingressesCount, Integer namespacesCount, Integer secretsCount, Integer servicesCount, Integer volumesCount) {
        this.applicationsCount = applicationsCount;
        this.configMapsCount = configMapsCount;
        this.ingressesCount = ingressesCount;
        this.namespacesCount = namespacesCount;
        this.secretsCount = secretsCount;
        this.servicesCount = servicesCount;
        this.volumesCount = volumesCount;
    }

    public Integer getApplicationsCount() {
        return applicationsCount;
    }

    public void setApplicationsCount(Integer applicationsCount) {
        this.applicationsCount = applicationsCount;
    }

    public Integer getConfigMapsCount() {
        return configMapsCount;
    }

    public void setConfigMapsCount(Integer configMapsCount) {
        this.configMapsCount = configMapsCount;
    }

    public Integer getIngressesCount() {
        return ingressesCount;
    }

    public void setIngressesCount(Integer ingressesCount) {
        this.ingressesCount = ingressesCount;
    }

    public Integer getNamespacesCount() {
        return namespacesCount;
    }

    public void setNamespacesCount(Integer namespacesCount) {
        this.namespacesCount = namespacesCount;
    }

    public Integer getSecretsCount() {
        return secretsCount;
    }

    public void setSecretsCount(Integer secretsCount) {
        this.secretsCount = secretsCount;
    }

    public Integer getServicesCount() {
        return servicesCount;
    }

    public void setServicesCount(Integer servicesCount) {
        this.servicesCount = servicesCount;
    }

    public Integer getVolumesCount() {
        return volumesCount;
    }

    public void setVolumesCount(Integer volumesCount) {
        this.volumesCount = volumesCount;
    }

}