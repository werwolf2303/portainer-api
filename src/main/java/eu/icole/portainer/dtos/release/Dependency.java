package eu.icole.portainer.dtos.release;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Dependency {

    private String alias;
    private String condition;
    private Boolean enabled;
    @SerializedName("import-values")
    private List<Object> importValues;
    private String name;
    private String repository;
    private List<String> tags;
    private String version;

    public Dependency() {
    }

    public Dependency(String alias, String condition, Boolean enabled, List<Object> importValues, String name, String repository, List<String> tags, String version) {
        this.alias = alias;
        this.condition = condition;
        this.enabled = enabled;
        this.importValues = importValues;
        this.name = name;
        this.repository = repository;
        this.tags = tags;
        this.version = version;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<Object> getImportValues() {
        return importValues;
    }

    public void setImportValues(List<Object> importValues) {
        this.importValues = importValues;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}