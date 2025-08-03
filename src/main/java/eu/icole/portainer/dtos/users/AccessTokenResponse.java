package eu.icole.portainer.dtos.users;

import eu.icole.portainer.dtos.portainer.APIKey;

public class AccessTokenResponse {

    private APIKey apiKey;
    private String rawAPIKey;

    public AccessTokenResponse() {
    }

    public AccessTokenResponse(APIKey apiKey, String rawAPIKey) {
        this.apiKey = apiKey;
        this.rawAPIKey = rawAPIKey;
    }

    public APIKey getApiKey() {
        return apiKey;
    }

    public void setApiKey(APIKey apiKey) {
        this.apiKey = apiKey;
    }

    public String getRawAPIKey() {
        return rawAPIKey;
    }

    public void setRawAPIKey(String rawAPIKey) {
        this.rawAPIKey = rawAPIKey;
    }

}