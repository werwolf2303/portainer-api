package eu.icole.portainer.dtos.portainer;

import com.google.gson.annotations.SerializedName;
import eu.icole.portainer.dtos.portainer.TemplateEnvSelect;

import java.util.List;

public class TemplateEnv {

    @SerializedName("default")
    private String default_;
    private String description;
    private String label;
    private String name;
    private Boolean preset;
    private List<TemplateEnvSelect> select;

    public TemplateEnv() {
    }

    public TemplateEnv(String default_, String description, String label, String name, Boolean preset, List<TemplateEnvSelect> select) {
        this.default_ = default_;
        this.description = description;
        this.label = label;
        this.name = name;
        this.preset = preset;
        this.select = select;
    }

    public String getDefault_() {
        return default_;
    }

    public void setDefault_(String default_) {
        this.default_ = default_;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPreset() {
        return preset;
    }

    public void setPreset(Boolean preset) {
        this.preset = preset;
    }

    public List<TemplateEnvSelect> getSelect() {
        return select;
    }

    public void setSelect(List<TemplateEnvSelect> select) {
        this.select = select;
    }

}