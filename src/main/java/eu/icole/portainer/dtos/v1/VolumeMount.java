package eu.icole.portainer.dtos.v1;


public class VolumeMount {

    private String mountPath;
    private String mountPropagation;
    private String name;
    private Boolean readOnly;
    private String subPath;
    private String subPathExpr;

    public VolumeMount() {
    }

    public VolumeMount(String mountPath, String mountPropagation, String name, Boolean readOnly, String subPath, String subPathExpr) {
        this.mountPath = mountPath;
        this.mountPropagation = mountPropagation;
        this.name = name;
        this.readOnly = readOnly;
        this.subPath = subPath;
        this.subPathExpr = subPathExpr;
    }

    public String getMountPath() {
        return mountPath;
    }

    public void setMountPath(String mountPath) {
        this.mountPath = mountPath;
    }

    public String getMountPropagation() {
        return mountPropagation;
    }

    public void setMountPropagation(String mountPropagation) {
        this.mountPropagation = mountPropagation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getSubPath() {
        return subPath;
    }

    public void setSubPath(String subPath) {
        this.subPath = subPath;
    }

    public String getSubPathExpr() {
        return subPathExpr;
    }

    public void setSubPathExpr(String subPathExpr) {
        this.subPathExpr = subPathExpr;
    }

}