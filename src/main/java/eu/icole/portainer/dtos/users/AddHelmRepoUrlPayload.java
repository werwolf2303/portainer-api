package eu.icole.portainer.dtos.users;


public class AddHelmRepoUrlPayload {

    private String url;

    public AddHelmRepoUrlPayload() {
    }

    public AddHelmRepoUrlPayload(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}