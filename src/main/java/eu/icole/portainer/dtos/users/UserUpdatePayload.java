package eu.icole.portainer.dtos.users;

import eu.icole.portainer.dtos.users.ThemePayload;

public class UserUpdatePayload {

    private String newPassword;
    private String password;
    private Integer role;
    private ThemePayload theme;
    private Boolean useCache;
    private String username;

    public UserUpdatePayload() {
    }

    public UserUpdatePayload(String newPassword, String password, Integer role, ThemePayload theme, Boolean useCache, String username) {
        this.newPassword = newPassword;
        this.password = password;
        this.role = role;
        this.theme = theme;
        this.useCache = useCache;
        this.username = username;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public ThemePayload getTheme() {
        return theme;
    }

    public void setTheme(ThemePayload theme) {
        this.theme = theme;
    }

    public Boolean getUseCache() {
        return useCache;
    }

    public void setUseCache(Boolean useCache) {
        this.useCache = useCache;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}