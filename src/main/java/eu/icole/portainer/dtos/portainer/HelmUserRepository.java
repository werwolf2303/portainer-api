package eu.icole.portainer.dtos.portainer;


public class HelmUserRepository {

    private Integer Id;
    private String URL;
    private Integer UserId;

    public HelmUserRepository() {
    }

    public HelmUserRepository(Integer Id, String URL, Integer UserId) {
        this.Id = Id;
        this.URL = URL;
        this.UserId = UserId;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer UserId) {
        this.UserId = UserId;
    }

}