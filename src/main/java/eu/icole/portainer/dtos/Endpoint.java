package eu.icole.portainer.dtos;

import java.util.List;

public class Endpoint {
    private String AMTDeviceGUID;
    private List<Integer> AuthorizedTeams;
    private AzureCredentials AzureCredentials;
    private String ComposeSyntaxMaxVersion;
    private String ContainerEngine;
    private int EdgeCheckinInterval;
    private String EdgeID;
    private String EdgeKey;
    private boolean EnableGPUManagement;
    private List<Pair> Gpus;
    private int GroupId;
    private boolean Heartbeat;
    private int Id;
    private EndpointPostInitMigration PostInitMigration;
    private String PublicURL;
    private List<DockerSnapshot> Snapshots;
    private int Status;
    private boolean TLS;
    private String TLSCACert;
    private String TLSCert;
    private TLSConfiguration TLSConfig;
    private String TLSKey;
    private List<Integer> TagIds;
    private TeamAccessPolicies TeamAccessPolicies;
    private String Type;
    private String URL;
    private UserAccessPolicies UserAccessPolicies;
    private boolean UserTrusted;
    private Agent agent;
    private EnvironmentEdgeSettings edge;
    private int queryDate;
    private EndpointSecuritySettings securitySettings;

    public static class Agent {
        private String version;

        public String getVersion() {
            return version;
        }
    }

    public String getAMTDeviceGUID() {
        return AMTDeviceGUID;
    }

    public List<Integer> getAuthorizedTeams() {
        return AuthorizedTeams;
    }

    public AzureCredentials getAzureCredentials() {
        return AzureCredentials;
    }

    public String getComposeSyntaxMaxVersion() {
        return ComposeSyntaxMaxVersion;
    }

    public String getContainerEngine() {
        return ContainerEngine;
    }

    public int getEdgeCheckinInterval() {
        return EdgeCheckinInterval;
    }

    public String getEdgeID() {
        return EdgeID;
    }

    public String getEdgeKey() {
        return EdgeKey;
    }

    public boolean isEnableGPUManagement() {
        return EnableGPUManagement;
    }

    public List<Pair> getGpus() {
        return Gpus;
    }

    public int getGroupId() {
        return GroupId;
    }

    public boolean isHeartbeat() {
        return Heartbeat;
    }

    public int getId() {
        return Id;
    }

    public EndpointPostInitMigration getPostInitMigration() {
        return PostInitMigration;
    }

    public String getPublicURL() {
        return PublicURL;
    }

    public List<DockerSnapshot> getSnapshots() {
        return Snapshots;
    }

    public int getStatus() {
        return Status;
    }

    public boolean isTLS() {
        return TLS;
    }

    public String getTLSCACert() {
        return TLSCACert;
    }

    public String getTLSCert() {
        return TLSCert;
    }

    public TLSConfiguration getTLSConfig() {
        return TLSConfig;
    }

    public String getTLSKey() {
        return TLSKey;
    }

    public List<Integer> getTagIds() {
        return TagIds;
    }

    public TeamAccessPolicies getTeamAccessPolicies() {
        return TeamAccessPolicies;
    }

    public String getType() {
        return Type;
    }

    public String getURL() {
        return URL;
    }

    public UserAccessPolicies getUserAccessPolicies() {
        return UserAccessPolicies;
    }

    public boolean isUserTrusted() {
        return UserTrusted;
    }

    public Agent getAgent() {
        return agent;
    }

    public EnvironmentEdgeSettings getEdge() {
        return edge;
    }

    public int getQueryDate() {
        return queryDate;
    }

    public EndpointSecuritySettings getSecuritySettings() {
        return securitySettings;
    }
}
