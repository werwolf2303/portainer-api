package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.kubernetes.K8sIngressPath;
import eu.icole.portainer.dtos.kubernetes.K8sIngressTLS;

import java.util.List;
import java.util.Map;

public class K8sIngressInfo {

    private Map<String, Object> Annotations;
    private String ClassName;
    private String CreationDate;
    private List<String> Hosts;
    private Map<String, Object> Labels;
    private String Name;
    private String Namespace;
    private List<K8sIngressPath> Paths;
    private List<K8sIngressTLS> TLS;
    private String Type;
    private String UID;

    public K8sIngressInfo() {
    }

    public K8sIngressInfo(Map<String, Object> Annotations, String ClassName, String CreationDate, List<String> Hosts, Map<String, Object> Labels, String Name, String Namespace, List<K8sIngressPath> Paths, List<K8sIngressTLS> TLS, String Type, String UID) {
        this.Annotations = Annotations;
        this.ClassName = ClassName;
        this.CreationDate = CreationDate;
        this.Hosts = Hosts;
        this.Labels = Labels;
        this.Name = Name;
        this.Namespace = Namespace;
        this.Paths = Paths;
        this.TLS = TLS;
        this.Type = Type;
        this.UID = UID;
    }

    public Map<String, Object> getAnnotations() {
        return Annotations;
    }

    public void setAnnotations(Map<String, Object> Annotations) {
        this.Annotations = Annotations;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String CreationDate) {
        this.CreationDate = CreationDate;
    }

    public List<String> getHosts() {
        return Hosts;
    }

    public void setHosts(List<String> Hosts) {
        this.Hosts = Hosts;
    }

    public Map<String, Object> getLabels() {
        return Labels;
    }

    public void setLabels(Map<String, Object> Labels) {
        this.Labels = Labels;
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

    public List<K8sIngressPath> getPaths() {
        return Paths;
    }

    public void setPaths(List<K8sIngressPath> Paths) {
        this.Paths = Paths;
    }

    public List<K8sIngressTLS> getTLS() {
        return TLS;
    }

    public void setTLS(List<K8sIngressTLS> TLS) {
        this.TLS = TLS;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

}