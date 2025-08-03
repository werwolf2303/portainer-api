package eu.icole.portainer.dtos.registries;

import java.util.List;

public class RegistryConfigurePayload {

    private Boolean authentication;
    private String password;
    private String region;
    private Boolean tls;
    private List<Integer> tlscacertFile;
    private List<Integer> tlscertFile;
    private List<Integer> tlskeyFile;
    private Boolean tlsskipVerify;
    private String username;

    public RegistryConfigurePayload() {
    }

    public RegistryConfigurePayload(Boolean authentication, String password, String region, Boolean tls, List<Integer> tlscacertFile, List<Integer> tlscertFile, List<Integer> tlskeyFile, Boolean tlsskipVerify, String username) {
        this.authentication = authentication;
        this.password = password;
        this.region = region;
        this.tls = tls;
        this.tlscacertFile = tlscacertFile;
        this.tlscertFile = tlscertFile;
        this.tlskeyFile = tlskeyFile;
        this.tlsskipVerify = tlsskipVerify;
        this.username = username;
    }

    public Boolean getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Boolean authentication) {
        this.authentication = authentication;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getTls() {
        return tls;
    }

    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    public List<Integer> getTlscacertFile() {
        return tlscacertFile;
    }

    public void setTlscacertFile(List<Integer> tlscacertFile) {
        this.tlscacertFile = tlscacertFile;
    }

    public List<Integer> getTlscertFile() {
        return tlscertFile;
    }

    public void setTlscertFile(List<Integer> tlscertFile) {
        this.tlscertFile = tlscertFile;
    }

    public List<Integer> getTlskeyFile() {
        return tlskeyFile;
    }

    public void setTlskeyFile(List<Integer> tlskeyFile) {
        this.tlskeyFile = tlskeyFile;
    }

    public Boolean getTlsskipVerify() {
        return tlsskipVerify;
    }

    public void setTlsskipVerify(Boolean tlsskipVerify) {
        this.tlsskipVerify = tlsskipVerify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}