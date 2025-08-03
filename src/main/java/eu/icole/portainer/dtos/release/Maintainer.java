package eu.icole.portainer.dtos.release;


public class Maintainer {

    private String email;
    private String name;
    private String url;

    public Maintainer() {
    }

    public Maintainer(String email, String name, String url) {
        this.email = email;
        this.name = name;
        this.url = url;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}