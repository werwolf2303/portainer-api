package eu.icole.portainer.dtos.kubernetes;


public class K8sIngressPath {

    private Boolean HasService;
    private String Host;
    private String IngressName;
    private String Path;
    private String PathType;
    private Integer Port;
    private String ServiceName;

    public K8sIngressPath() {
    }

    public K8sIngressPath(Boolean HasService, String Host, String IngressName, String Path, String PathType, Integer Port, String ServiceName) {
        this.HasService = HasService;
        this.Host = Host;
        this.IngressName = IngressName;
        this.Path = Path;
        this.PathType = PathType;
        this.Port = Port;
        this.ServiceName = ServiceName;
    }

    public Boolean getHasService() {
        return HasService;
    }

    public void setHasService(Boolean HasService) {
        this.HasService = HasService;
    }

    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getIngressName() {
        return IngressName;
    }

    public void setIngressName(String IngressName) {
        this.IngressName = IngressName;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public String getPathType() {
        return PathType;
    }

    public void setPathType(String PathType) {
        this.PathType = PathType;
    }

    public Integer getPort() {
        return Port;
    }

    public void setPort(Integer Port) {
        this.Port = Port;
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

}