package eu.icole.portainer.dtos.portainer;


public class APIKey {

    private Integer dateCreated;
    private String description;
    private String digest;
    private Integer id;
    private Integer lastUsed;
    private String prefix;
    private Integer userId;

    public APIKey() {
    }

    public APIKey(Integer dateCreated, String description, String digest, Integer id, Integer lastUsed, String prefix, Integer userId) {
        this.dateCreated = dateCreated;
        this.description = description;
        this.digest = digest;
        this.id = id;
        this.lastUsed = lastUsed;
        this.prefix = prefix;
        this.userId = userId;
    }

    public Integer getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Integer dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Integer lastUsed) {
        this.lastUsed = lastUsed;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

}