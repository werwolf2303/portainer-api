package eu.icole.portainer.dtos.auth;


public class OauthPayload {

    private String code;

    public OauthPayload() {
    }

    public OauthPayload(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}