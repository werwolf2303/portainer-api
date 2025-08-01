package eu.icole.portainer.dtos;

public class OAuthPayload {
    private final String code;

    public OAuthPayload(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
