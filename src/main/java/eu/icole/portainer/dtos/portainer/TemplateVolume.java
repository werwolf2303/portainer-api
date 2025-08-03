package eu.icole.portainer.dtos.portainer;


public class TemplateVolume {

    private String bind;
    private String container;
    private Boolean readonly;

    public TemplateVolume() {
    }

    public TemplateVolume(String bind, String container, Boolean readonly) {
        this.bind = bind;
        this.container = container;
        this.readonly = readonly;
    }

    public String getBind() {
        return bind;
    }

    public void setBind(String bind) {
        this.bind = bind;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

}