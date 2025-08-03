package eu.icole.portainer.dtos.release;

import eu.icole.portainer.dtos.release.Dependency;
import eu.icole.portainer.dtos.release.Maintainer;

import java.util.List;
import java.util.Map;

public class Metadata {

    private Map<String, Object> annotations;
    private String apiVersion;
    private String appVersion;
    private String condition;
    private List<Dependency> dependencies;
    private Boolean deprecated;
    private String description;
    private String home;
    private String icon;
    private List<String> keywords;
    private String kubeVersion;
    private List<Maintainer> maintainers;
    private String name;
    private List<String> sources;
    private String tags;
    private String type;
    private String version;

    public Metadata() {
    }

    public Metadata(Map<String, Object> annotations, String apiVersion, String appVersion, String condition, List<Dependency> dependencies, Boolean deprecated, String description, String home, String icon, List<String> keywords, String kubeVersion, List<Maintainer> maintainers, String name, List<String> sources, String tags, String type, String version) {
        this.annotations = annotations;
        this.apiVersion = apiVersion;
        this.appVersion = appVersion;
        this.condition = condition;
        this.dependencies = dependencies;
        this.deprecated = deprecated;
        this.description = description;
        this.home = home;
        this.icon = icon;
        this.keywords = keywords;
        this.kubeVersion = kubeVersion;
        this.maintainers = maintainers;
        this.name = name;
        this.sources = sources;
        this.tags = tags;
        this.type = type;
        this.version = version;
    }

    public Map<String, Object> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
        this.annotations = annotations;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<Dependency> dependencies) {
        this.dependencies = dependencies;
    }

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public String getKubeVersion() {
        return kubeVersion;
    }

    public void setKubeVersion(String kubeVersion) {
        this.kubeVersion = kubeVersion;
    }

    public List<Maintainer> getMaintainers() {
        return maintainers;
    }

    public void setMaintainers(List<Maintainer> maintainers) {
        this.maintainers = maintainers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}