package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.*;

import java.util.List;
import java.util.Map;

public class Endpoint {

    private String AMTDeviceGUID;
    private List<Integer> AuthorizedTeams;
    private List<Integer> AuthorizedUsers;
    private AzureCredentials AzureCredentials;
    private String ComposeSyntaxMaxVersion;
    private String ContainerEngine;
    private Integer EdgeCheckinInterval;
    private String EdgeID;
    private String EdgeKey;
    private Boolean EnableGPUManagement;
    private List<Pair> Gpus;
    private Integer GroupId;
    private Boolean Heartbeat;
    private Integer Id;
    private Boolean IsEdgeDevice;
    private KubernetesData Kubernetes;
    private String Name;
    private EndpointPostInitMigrations PostInitMigrations;
    private String PublicURL;
    private List<DockerSnapshot> Snapshots;
    private Integer Status;
    private Boolean TLS;
    private String TLSCACert;
    private String TLSCert;
    private TLSConfiguration TLSConfig;
    private String TLSKey;
    private List<Integer> TagIds;
    private List<String> Tags;
    private TeamAccessPolicies TeamAccessPolicies;
    private Integer Type;
    private String URL;
    private UserAccessPolicies UserAccessPolicies;
    private Boolean UserTrusted;
    private Map<String, Object> agent;
    private EnvironmentEdgeSettings edge;
    private Integer lastCheckInDate;
    private Integer queryDate;
    private EndpointSecuritySettings securitySettings;

    public Endpoint() {
    }

    public Endpoint(String AMTDeviceGUID, List<Integer> AuthorizedTeams, List<Integer> AuthorizedUsers, AzureCredentials AzureCredentials, String ComposeSyntaxMaxVersion, String ContainerEngine, Integer EdgeCheckinInterval, String EdgeID, String EdgeKey, Boolean EnableGPUManagement, List<Pair> Gpus, Integer GroupId, Boolean Heartbeat, Integer Id, Boolean IsEdgeDevice, KubernetesData Kubernetes, String Name, EndpointPostInitMigrations PostInitMigrations, String PublicURL, List<DockerSnapshot> Snapshots, Integer Status, Boolean TLS, String TLSCACert, String TLSCert, TLSConfiguration TLSConfig, String TLSKey, List<Integer> TagIds, List<String> Tags, TeamAccessPolicies TeamAccessPolicies, Integer Type, String URL, UserAccessPolicies UserAccessPolicies, Boolean UserTrusted, Map<String, Object> agent, EnvironmentEdgeSettings edge, Integer lastCheckInDate, Integer queryDate, EndpointSecuritySettings securitySettings) {
        this.AMTDeviceGUID = AMTDeviceGUID;
        this.AuthorizedTeams = AuthorizedTeams;
        this.AuthorizedUsers = AuthorizedUsers;
        this.AzureCredentials = AzureCredentials;
        this.ComposeSyntaxMaxVersion = ComposeSyntaxMaxVersion;
        this.ContainerEngine = ContainerEngine;
        this.EdgeCheckinInterval = EdgeCheckinInterval;
        this.EdgeID = EdgeID;
        this.EdgeKey = EdgeKey;
        this.EnableGPUManagement = EnableGPUManagement;
        this.Gpus = Gpus;
        this.GroupId = GroupId;
        this.Heartbeat = Heartbeat;
        this.Id = Id;
        this.IsEdgeDevice = IsEdgeDevice;
        this.Kubernetes = Kubernetes;
        this.Name = Name;
        this.PostInitMigrations = PostInitMigrations;
        this.PublicURL = PublicURL;
        this.Snapshots = Snapshots;
        this.Status = Status;
        this.TLS = TLS;
        this.TLSCACert = TLSCACert;
        this.TLSCert = TLSCert;
        this.TLSConfig = TLSConfig;
        this.TLSKey = TLSKey;
        this.TagIds = TagIds;
        this.Tags = Tags;
        this.TeamAccessPolicies = TeamAccessPolicies;
        this.Type = Type;
        this.URL = URL;
        this.UserAccessPolicies = UserAccessPolicies;
        this.UserTrusted = UserTrusted;
        this.agent = agent;
        this.edge = edge;
        this.lastCheckInDate = lastCheckInDate;
        this.queryDate = queryDate;
        this.securitySettings = securitySettings;
    }

    public String getAMTDeviceGUID() {
        return AMTDeviceGUID;
    }

    public void setAMTDeviceGUID(String AMTDeviceGUID) {
        this.AMTDeviceGUID = AMTDeviceGUID;
    }

    public List<Integer> getAuthorizedTeams() {
        return AuthorizedTeams;
    }

    public void setAuthorizedTeams(List<Integer> AuthorizedTeams) {
        this.AuthorizedTeams = AuthorizedTeams;
    }

    public List<Integer> getAuthorizedUsers() {
        return AuthorizedUsers;
    }

    public void setAuthorizedUsers(List<Integer> AuthorizedUsers) {
        this.AuthorizedUsers = AuthorizedUsers;
    }

    public AzureCredentials getAzureCredentials() {
        return AzureCredentials;
    }

    public void setAzureCredentials(AzureCredentials AzureCredentials) {
        this.AzureCredentials = AzureCredentials;
    }

    public String getComposeSyntaxMaxVersion() {
        return ComposeSyntaxMaxVersion;
    }

    public void setComposeSyntaxMaxVersion(String ComposeSyntaxMaxVersion) {
        this.ComposeSyntaxMaxVersion = ComposeSyntaxMaxVersion;
    }

    public String getContainerEngine() {
        return ContainerEngine;
    }

    public void setContainerEngine(String ContainerEngine) {
        this.ContainerEngine = ContainerEngine;
    }

    public Integer getEdgeCheckinInterval() {
        return EdgeCheckinInterval;
    }

    public void setEdgeCheckinInterval(Integer EdgeCheckinInterval) {
        this.EdgeCheckinInterval = EdgeCheckinInterval;
    }

    public String getEdgeID() {
        return EdgeID;
    }

    public void setEdgeID(String EdgeID) {
        this.EdgeID = EdgeID;
    }

    public String getEdgeKey() {
        return EdgeKey;
    }

    public void setEdgeKey(String EdgeKey) {
        this.EdgeKey = EdgeKey;
    }

    public Boolean getEnableGPUManagement() {
        return EnableGPUManagement;
    }

    public void setEnableGPUManagement(Boolean EnableGPUManagement) {
        this.EnableGPUManagement = EnableGPUManagement;
    }

    public List<Pair> getGpus() {
        return Gpus;
    }

    public void setGpus(List<Pair> Gpus) {
        this.Gpus = Gpus;
    }

    public Integer getGroupId() {
        return GroupId;
    }

    public void setGroupId(Integer GroupId) {
        this.GroupId = GroupId;
    }

    public Boolean getHeartbeat() {
        return Heartbeat;
    }

    public void setHeartbeat(Boolean Heartbeat) {
        this.Heartbeat = Heartbeat;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Boolean getIsEdgeDevice() {
        return IsEdgeDevice;
    }

    public void setIsEdgeDevice(Boolean IsEdgeDevice) {
        this.IsEdgeDevice = IsEdgeDevice;
    }

    public KubernetesData getKubernetes() {
        return Kubernetes;
    }

    public void setKubernetes(KubernetesData Kubernetes) {
        this.Kubernetes = Kubernetes;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public EndpointPostInitMigrations getPostInitMigrations() {
        return PostInitMigrations;
    }

    public void setPostInitMigrations(EndpointPostInitMigrations PostInitMigrations) {
        this.PostInitMigrations = PostInitMigrations;
    }

    public String getPublicURL() {
        return PublicURL;
    }

    public void setPublicURL(String PublicURL) {
        this.PublicURL = PublicURL;
    }

    public List<DockerSnapshot> getSnapshots() {
        return Snapshots;
    }

    public void setSnapshots(List<DockerSnapshot> Snapshots) {
        this.Snapshots = Snapshots;
    }

    public Integer getStatus() {
        return Status;
    }

    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    public Boolean getTLS() {
        return TLS;
    }

    public void setTLS(Boolean TLS) {
        this.TLS = TLS;
    }

    public String getTLSCACert() {
        return TLSCACert;
    }

    public void setTLSCACert(String TLSCACert) {
        this.TLSCACert = TLSCACert;
    }

    public String getTLSCert() {
        return TLSCert;
    }

    public void setTLSCert(String TLSCert) {
        this.TLSCert = TLSCert;
    }

    public TLSConfiguration getTLSConfig() {
        return TLSConfig;
    }

    public void setTLSConfig(TLSConfiguration TLSConfig) {
        this.TLSConfig = TLSConfig;
    }

    public String getTLSKey() {
        return TLSKey;
    }

    public void setTLSKey(String TLSKey) {
        this.TLSKey = TLSKey;
    }

    public List<Integer> getTagIds() {
        return TagIds;
    }

    public void setTagIds(List<Integer> TagIds) {
        this.TagIds = TagIds;
    }

    public List<String> getTags() {
        return Tags;
    }

    public void setTags(List<String> Tags) {
        this.Tags = Tags;
    }

    public TeamAccessPolicies getTeamAccessPolicies() {
        return TeamAccessPolicies;
    }

    public void setTeamAccessPolicies(TeamAccessPolicies TeamAccessPolicies) {
        this.TeamAccessPolicies = TeamAccessPolicies;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public UserAccessPolicies getUserAccessPolicies() {
        return UserAccessPolicies;
    }

    public void setUserAccessPolicies(UserAccessPolicies UserAccessPolicies) {
        this.UserAccessPolicies = UserAccessPolicies;
    }

    public Boolean getUserTrusted() {
        return UserTrusted;
    }

    public void setUserTrusted(Boolean UserTrusted) {
        this.UserTrusted = UserTrusted;
    }

    public Map<String, Object> getAgent() {
        return agent;
    }

    public void setAgent(Map<String, Object> agent) {
        this.agent = agent;
    }

    public EnvironmentEdgeSettings getEdge() {
        return edge;
    }

    public void setEdge(EnvironmentEdgeSettings edge) {
        this.edge = edge;
    }

    public Integer getLastCheckInDate() {
        return lastCheckInDate;
    }

    public void setLastCheckInDate(Integer lastCheckInDate) {
        this.lastCheckInDate = lastCheckInDate;
    }

    public Integer getQueryDate() {
        return queryDate;
    }

    public void setQueryDate(Integer queryDate) {
        this.queryDate = queryDate;
    }

    public EndpointSecuritySettings getSecuritySettings() {
        return securitySettings;
    }

    public void setSecuritySettings(EndpointSecuritySettings securitySettings) {
        this.securitySettings = securitySettings;
    }

}