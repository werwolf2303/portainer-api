package eu.icole.portainer.dtos.portainer;


public class TemplateRepository {

    private String stackfile;
    private String url;

    public TemplateRepository() {
    }

    public TemplateRepository(String stackfile, String url) {
        this.stackfile = stackfile;
        this.url = url;
    }

    public String getStackfile() {
        return stackfile;
    }

    public void setStackfile(String stackfile) {
        this.stackfile = stackfile;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}