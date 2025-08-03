package eu.icole.portainer.dtos.portainer;

import com.google.gson.annotations.SerializedName;

public class TemplateEnvSelect {

    @SerializedName("default")
    private Boolean default_;
    private String text;
    private String value;

    public TemplateEnvSelect() {
    }

    public TemplateEnvSelect(Boolean default_, String text, String value) {
        this.default_ = default_;
        this.text = text;
        this.value = value;
    }

    public Boolean getDefault_() {
        return default_;
    }

    public void setDefault_(Boolean default_) {
        this.default_ = default_;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}