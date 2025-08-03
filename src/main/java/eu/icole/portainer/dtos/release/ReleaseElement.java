package eu.icole.portainer.dtos.release;


public class ReleaseElement {

    private String app_version;
    private String chart;
    private String name;
    private String namespace;
    private String revision;
    private String status;
    private String updated;

    public ReleaseElement() {
    }

    public ReleaseElement(String app_version, String chart, String name, String namespace, String revision, String status, String updated) {
        this.app_version = app_version;
        this.chart = chart;
        this.name = name;
        this.namespace = namespace;
        this.revision = revision;
        this.status = status;
        this.updated = updated;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public String getChart() {
        return chart;
    }

    public void setChart(String chart) {
        this.chart = chart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

}