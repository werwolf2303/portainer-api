package eu.icole.portainer.dtos.release;

import eu.icole.portainer.dtos.release.Chart;
import eu.icole.portainer.dtos.release.Hook;

import java.util.List;
import java.util.Map;

public class Release {

    private Chart chart;
    private Map<String, Object> config;
    private List<Hook> hooks;
    private String manifest;
    private String name;
    private String namespace;
    private Integer version;

    public Release() {
    }

    public Release(Chart chart, Map<String, Object> config, List<Hook> hooks, String manifest, String name, String namespace, Integer version) {
        this.chart = chart;
        this.config = config;
        this.hooks = hooks;
        this.manifest = manifest;
        this.name = name;
        this.namespace = namespace;
        this.version = version;
    }

    public Chart getChart() {
        return chart;
    }

    public void setChart(Chart chart) {
        this.chart = chart;
    }

    public Map<String, Object> getConfig() {
        return config;
    }

    public void setConfig(Map<String, Object> config) {
        this.config = config;
    }

    public List<Hook> getHooks() {
        return hooks;
    }

    public void setHooks(List<Hook> hooks) {
        this.hooks = hooks;
    }

    public String getManifest() {
        return manifest;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}