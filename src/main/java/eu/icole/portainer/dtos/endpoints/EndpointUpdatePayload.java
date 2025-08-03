package eu.icole.portainer.dtos.endpoints;

import eu.icole.portainer.dtos.portainer.KubernetesData;
import eu.icole.portainer.dtos.portainer.Pair;
import eu.icole.portainer.dtos.portainer.TeamAccessPolicies;
import eu.icole.portainer.dtos.portainer.UserAccessPolicies;

import java.util.List;

public class EndpointUpdatePayload {

    private String azureApplicationID;
    private String azureAuthenticationKey;
    private String azureTenantID;
    private Integer edgeCheckinInterval;
    private List<Pair> gpus;
    private Integer groupID;
    private KubernetesData kubernetes;
    private String name;
    private String publicURL;
    private Integer status;
    private List<Integer> tagIDs;
    private TeamAccessPolicies teamAccessPolicies;
    private Boolean tls;
    private Boolean tlsskipClientVerify;
    private Boolean tlsskipVerify;
    private String url;
    private UserAccessPolicies userAccessPolicies;

    public EndpointUpdatePayload() {
    }

    public EndpointUpdatePayload(String azureApplicationID, String azureAuthenticationKey, String azureTenantID, Integer edgeCheckinInterval, List<Pair> gpus, Integer groupID, KubernetesData kubernetes, String name, String publicURL, Integer status, List<Integer> tagIDs, TeamAccessPolicies teamAccessPolicies, Boolean tls, Boolean tlsskipClientVerify, Boolean tlsskipVerify, String url, UserAccessPolicies userAccessPolicies) {
        this.azureApplicationID = azureApplicationID;
        this.azureAuthenticationKey = azureAuthenticationKey;
        this.azureTenantID = azureTenantID;
        this.edgeCheckinInterval = edgeCheckinInterval;
        this.gpus = gpus;
        this.groupID = groupID;
        this.kubernetes = kubernetes;
        this.name = name;
        this.publicURL = publicURL;
        this.status = status;
        this.tagIDs = tagIDs;
        this.teamAccessPolicies = teamAccessPolicies;
        this.tls = tls;
        this.tlsskipClientVerify = tlsskipClientVerify;
        this.tlsskipVerify = tlsskipVerify;
        this.url = url;
        this.userAccessPolicies = userAccessPolicies;
    }

    public String getAzureApplicationID() {
        return azureApplicationID;
    }

    public void setAzureApplicationID(String azureApplicationID) {
        this.azureApplicationID = azureApplicationID;
    }

    public String getAzureAuthenticationKey() {
        return azureAuthenticationKey;
    }

    public void setAzureAuthenticationKey(String azureAuthenticationKey) {
        this.azureAuthenticationKey = azureAuthenticationKey;
    }

    public String getAzureTenantID() {
        return azureTenantID;
    }

    public void setAzureTenantID(String azureTenantID) {
        this.azureTenantID = azureTenantID;
    }

    public Integer getEdgeCheckinInterval() {
        return edgeCheckinInterval;
    }

    public void setEdgeCheckinInterval(Integer edgeCheckinInterval) {
        this.edgeCheckinInterval = edgeCheckinInterval;
    }

    public List<Pair> getGpus() {
        return gpus;
    }

    public void setGpus(List<Pair> gpus) {
        this.gpus = gpus;
    }

    public Integer getGroupID() {
        return groupID;
    }

    public void setGroupID(Integer groupID) {
        this.groupID = groupID;
    }

    public KubernetesData getKubernetes() {
        return kubernetes;
    }

    public void setKubernetes(KubernetesData kubernetes) {
        this.kubernetes = kubernetes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublicURL() {
        return publicURL;
    }

    public void setPublicURL(String publicURL) {
        this.publicURL = publicURL;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<Integer> getTagIDs() {
        return tagIDs;
    }

    public void setTagIDs(List<Integer> tagIDs) {
        this.tagIDs = tagIDs;
    }

    public TeamAccessPolicies getTeamAccessPolicies() {
        return teamAccessPolicies;
    }

    public void setTeamAccessPolicies(TeamAccessPolicies teamAccessPolicies) {
        this.teamAccessPolicies = teamAccessPolicies;
    }

    public Boolean getTls() {
        return tls;
    }

    public void setTls(Boolean tls) {
        this.tls = tls;
    }

    public Boolean getTlsskipClientVerify() {
        return tlsskipClientVerify;
    }

    public void setTlsskipClientVerify(Boolean tlsskipClientVerify) {
        this.tlsskipClientVerify = tlsskipClientVerify;
    }

    public Boolean getTlsskipVerify() {
        return tlsskipVerify;
    }

    public void setTlsskipVerify(Boolean tlsskipVerify) {
        this.tlsskipVerify = tlsskipVerify;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UserAccessPolicies getUserAccessPolicies() {
        return userAccessPolicies;
    }

    public void setUserAccessPolicies(UserAccessPolicies userAccessPolicies) {
        this.userAccessPolicies = userAccessPolicies;
    }

}