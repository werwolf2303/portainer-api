package eu.icole.portainer.dtos.registries;

import eu.icole.portainer.dtos.portainer.EcrData;
import eu.icole.portainer.dtos.portainer.QuayRegistryData;
import eu.icole.portainer.dtos.portainer.RegistryAccesses;

public class RegistryUpdatePayload {

    private Boolean authentication;
    private String baseURL;
    private EcrData ecr;
    private String name;
    private String password;
    private QuayRegistryData quay;
    private RegistryAccesses registryAccesses;
    private String url;
    private String username;

    public RegistryUpdatePayload() {
    }

    public RegistryUpdatePayload(Boolean authentication, String baseURL, EcrData ecr, String name, String password, QuayRegistryData quay, RegistryAccesses registryAccesses, String url, String username) {
        this.authentication = authentication;
        this.baseURL = baseURL;
        this.ecr = ecr;
        this.name = name;
        this.password = password;
        this.quay = quay;
        this.registryAccesses = registryAccesses;
        this.url = url;
        this.username = username;
    }

    public Boolean getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Boolean authentication) {
        this.authentication = authentication;
    }

    public String getBaseURL() {
        return baseURL;
    }

    public void setBaseURL(String baseURL) {
        this.baseURL = baseURL;
    }

    public EcrData getEcr() {
        return ecr;
    }

    public void setEcr(EcrData ecr) {
        this.ecr = ecr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public QuayRegistryData getQuay() {
        return quay;
    }

    public void setQuay(QuayRegistryData quay) {
        this.quay = quay;
    }

    public RegistryAccesses getRegistryAccesses() {
        return registryAccesses;
    }

    public void setRegistryAccesses(RegistryAccesses registryAccesses) {
        this.registryAccesses = registryAccesses;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}