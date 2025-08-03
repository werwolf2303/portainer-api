package eu.icole.portainer.dtos.templates;

import eu.icole.portainer.dtos.portainer.Template;

import java.util.List;

public class ListResponse {

    private List<Template> templates;
    private String version;

    public ListResponse() {
    }

    public ListResponse(List<Template> templates, String version) {
        this.templates = templates;
        this.version = version;
    }

    public List<Template> getTemplates() {
        return templates;
    }

    public void setTemplates(List<Template> templates) {
        this.templates = templates;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}