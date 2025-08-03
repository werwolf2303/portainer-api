package eu.icole.portainer.dtos;

import eu.icole.portainer.Utils;
import eu.icole.portainer.dtos.portainer.Edge;
import eu.icole.portainer.dtos.portainer.Tag;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EndpointsPostPayload {
    private String Name;
    private EndpointCreationTypes EndpointCreationType;
    private String ContainerEngine;
    private String URL;
    private String PublicURL;
    private int GroupId;
    private boolean TLS;
    private boolean TLSSkipVerify;
    private boolean TLSSkipClientVerify;
    private File TLSCACertFile;
    private File TLSCertFile;
    private File TLSKeyFile;
    private String AzureApplicationID;
    private String AzureTenantID;
    private String AzureAuthenticationKey;
    private List<Integer> TagIds;
    private int EdgeCheckinInterval;
    private String EdgeTunnelServerAddress;
    private String Gpus;


    public EndpointsPostPayload(String name, EndpointCreationTypes endpointCreationType, String containerEngine, String URL, String publicURL, int groupId, boolean TLS, boolean TLSSkipVerify, boolean TLSSkipClientVerify, File TLSCACertFile, File TLSCertFile, File TLSKeyFile, String azureApplicationID, String azureTenantID, String azureAuthenticationKey, List<Integer> tagIds, int edgeCheckinInterval, String edgeTunnelServerAddress, String gpus) {
        Name = name;
        EndpointCreationType = endpointCreationType;
        ContainerEngine = containerEngine;
        this.URL = URL;
        PublicURL = publicURL;
        GroupId = groupId;
        this.TLS = TLS;
        this.TLSSkipVerify = TLSSkipVerify;
        this.TLSSkipClientVerify = TLSSkipClientVerify;
        this.TLSCACertFile = TLSCACertFile;
        this.TLSCertFile = TLSCertFile;
        this.TLSKeyFile = TLSKeyFile;
        AzureApplicationID = azureApplicationID;
        AzureTenantID = azureTenantID;
        AzureAuthenticationKey = azureAuthenticationKey;
        TagIds = tagIds;
        EdgeCheckinInterval = edgeCheckinInterval;
        EdgeTunnelServerAddress = edgeTunnelServerAddress;
        Gpus = gpus;

        // Required
        if (name == null) {
            throw new IllegalArgumentException("Name is required");
        }

        // Required
        if (this.EndpointCreationType == null) {
            throw new IllegalArgumentException("EndpointCreationType is required");
        }

        if (this.ContainerEngine != null && !this.ContainerEngine.equals("docker") && !this.ContainerEngine.equals("podman")) {
            throw new IllegalArgumentException("Invalid container engine");
        }

        // Defaults to local if not specified
        if (this.URL == null) {
            // Cannot be empty if EndpointCreationType is set to 4 (Edge agent environment)
            if (this.EndpointCreationType.value == 4) {
                throw new IllegalArgumentException("URL cannot be empty if EndpointCreationType is Edge agent environment");
            }

            if (Utils.isWindows()) {
                this.URL = "//./pipe/docker_engine";
            }else {
                this.URL = "/var/run/docker.sock";
            }
        }

        // Defaults to URL if not specified (example: docker.mydomain.tld:2375)
        if (this.PublicURL == null) this.PublicURL = this.URL;

        // If not specified will default to 1 (unassigned)
        if (this.GroupId == -1) this.GroupId = 1;

        // Must be true if EndpointCreationType is set to 2 (Agent environment)
        if (!this.TLS && EndpointCreationType.value == 2) {
            throw new IllegalArgumentException("TLS is required for Agent environment");
        }

        // Must be true if EndpointCreationType is set to 2 (Agent environment)
        if (!this.TLSSkipVerify && EndpointCreationType.value == 2) {
            throw new IllegalArgumentException("TLSSkipVerify is required for Agent environment");
        }

        // Must be true if EndpointCreationType is set to 2 (Agent environment)
        if (!this.TLSSkipClientVerify && EndpointCreationType.value == 2) {
            throw new IllegalArgumentException("TLSSkipClientVerify is required for Agent environment");
        }

        // Required if environment(endpoint) type is set to 3
        if (this.AzureApplicationID == null && EndpointCreationType.value == 3) {
            throw new IllegalArgumentException("AzureApplicationID is required for Azure environment");
        }

        // Required if environment(endpoint) type is set to 3
        if (this.AzureTenantID == null && EndpointCreationType.value == 3) {
            throw new IllegalArgumentException("AzureTenantID is required for Azure environment");
        }

        // Required if environment(endpoint) type is set to 3
        if (this.AzureAuthenticationKey == null && EndpointCreationType.value == 3) {
            throw new IllegalArgumentException("AzureAuthenticationKey is required for Azure environment");
        }

        if (this.EdgeTunnelServerAddress == null) {
            throw new IllegalArgumentException("EdgeTunnelServerAddress is required");
        }
    }

    public String getName() {
        return Name;
    }

    public int getEndpointCreationType() {
        return EndpointCreationType.value;
    }

    public String getContainerEngine() {
        return ContainerEngine;
    }

    public String getURL() {
        return URL;
    }

    public String getPublicURL() {
        return PublicURL;
    }

    public int getGroupId() {
        return GroupId;
    }

    public boolean isTLS() {
        return TLS;
    }

    public boolean isTLSSkipVerify() {
        return TLSSkipVerify;
    }

    public File getTLSCACertFile() {
        return TLSCACertFile;
    }

    public File getTLSCertFile() {
        return TLSCertFile;
    }

    public File getTLSKeyFile() {
        return TLSKeyFile;
    }

    public String getAzureApplicationID() {
        return AzureApplicationID;
    }

    public String getAzureTenantID() {
        return AzureTenantID;
    }

    public String getAzureAuthenticationKey() {
        return AzureAuthenticationKey;
    }

    public List<Integer> getTagIds() {
        return TagIds;
    }

    public int getEdgeCheckinInterval() {
        return EdgeCheckinInterval;
    }

    public String getEdgeTunnelServerAddress() {
        return EdgeTunnelServerAddress;
    }

    public String getGpus() {
        return Gpus;
    }


    public enum EndpointCreationTypes {
        LocalDocker(1),
        Agent(2),
        Azure(3),
        EdgeAgent(4),
        LocalKubernetes(5);

        public final int value;
        EndpointCreationTypes(int value) {
            this.value = value;
        }
    }

    public static class Builder {
        private String Name;
        private EndpointCreationTypes EndpointCreationType;
        private String ContainerEngine;
        private String URL;
        private String PublicURL;
        private int GroupId = -1;
        private boolean TLS;
        private boolean TLSSkipVerify;
        private boolean TLSSkipClientVerify;
        private File TLSCACertFile;
        private File TLSCertFile;
        private File TLSKeyFile;
        private String AzureApplicationID;
        private String AzureTenantID;
        private String AzureAuthenticationKey;
        private List<Integer> TagIds = new ArrayList<>();
        private int EdgeCheckinInterval;
        private String EdgeTunnelServerAddress;
        private String Gpus;

        /**
         * Name that will be used to identify this environment(endpoint) (example: my-environment)
         */
        public Builder setTLSKeyFile(File TLSKeyFile) {
            this.TLSKeyFile = TLSKeyFile;
            return this;
        }

        /**
         * Environment(Endpoint) type
         */
        public Builder setName(String name) {
            Name = name;
            return this;
        }

        /**
         * Container engine used by the environment(endpoint)
         */
        public Builder setEndpointCreationType(EndpointCreationTypes endpointCreationType) {
            EndpointCreationType = endpointCreationType;
            return this;
        }

        /**
         * Container engine used by the environment(endpoint). Value must be one of: 'docker' or 'podman'
         */
        public Builder setContainerEngine(String containerEngine) {
            ContainerEngine = containerEngine;
            return this;
        }

        /**
         * URL or IP address of a Docker host (example: docker.mydomain.tld:2375). Defaults to local if not specified (Linux: /var/run/docker.sock, Windows: //./pipe/docker_engine). Cannot be empty if EndpointCreationType is set to 4 (Edge agent environment)
         */
        public Builder setURL(String URL) {
            this.URL = URL;
            return this;
        }

        /**
         * URL or IP address where exposed containers will be reachable. Defaults to URL if not specified (example: docker.mydomain.tld:2375)
         */
        public Builder setPublicURL(String publicURL) {
            PublicURL = publicURL;
            return this;
        }

        /**
         * Environment(Endpoint) group identifier. If not specified will default to 1 (unassigned).
         */
        public Builder setGroupId(int groupId) {
            GroupId = groupId;
            return this;
        }

        /**
         * Require TLS to connect against this environment(endpoint). Must be true if EndpointCreationType is set to 2 (Agent environment)
         */
        public Builder setTLS(boolean TLS) {
            this.TLS = TLS;
            return this;
        }

        /**
         * Skip server verification when using TLS. Must be true if EndpointCreationType is set to 2 (Agent environment)
         */
        public Builder setTLSSkipVerify(boolean TLSSkipVerify) {
            this.TLSSkipVerify = TLSSkipVerify;
            return this;
        }

        /**
         * Skip client verification when using TLS. Must be true if EndpointCreationType is set to 2 (Agent environment)
         */
        public Builder setTLSSkipClientVerify(boolean TLSSkipClientVerify) {
            this.TLSSkipClientVerify = TLSSkipClientVerify;
            return this;
        }

        /**
         * TLS CA certificate file
         */
        public Builder setTLSCACertFile(File TLSCACertFile) {
            this.TLSCACertFile = TLSCACertFile;
            return this;
        }

        /**
         * TLS client certificate file
         */
        public Builder setTLSCertFile(File TLSCertFile) {
            this.TLSCertFile = TLSCertFile;
            return this;
        }

        /**
         * TLS client key file
         */
        public Builder SetTLSKeyFile(File TLSKeyFile) {
            this.TLSKeyFile = TLSKeyFile;
            return this;
        }

        /**
         * Azure application ID. Required if environment(endpoint) type is set to 3
         */
        public Builder setAzureApplicationID(String azureApplicationID) {
            AzureApplicationID = azureApplicationID;
            return this;
        }

        /**
         * Azure tenant ID. Required if environment(endpoint) type is set to 3
         */
        public Builder setAzureTenantID(String azureTenantID) {
            AzureTenantID = azureTenantID;
            return this;
        }

        /**
         * Azure authentication key. Required if environment(endpoint) type is set to 3
         */
        public Builder setAzureAuthenticationKey(String azureAuthenticationKey) {
            AzureAuthenticationKey = azureAuthenticationKey;
            return this;
        }

        /**
         * List of tag identifiers to which this environment(endpoint) is associated
         */
        public Builder setTagIds(List<Integer> tagIds) {
            TagIds = tagIds;
            return this;
        }

        /**
         * The check in interval for edge agent (in seconds)
         */
        public Builder setEdgeCheckinInterval(int edgeCheckinInterval) {
            EdgeCheckinInterval = edgeCheckinInterval;
            return this;
        }

        /**
         * URL or IP address that will be used to establish a reverse tunnel
         */
        public Builder setEdgeTunnelServerAddress(String edgeTunnelServerAddress) {
            EdgeTunnelServerAddress = edgeTunnelServerAddress;
            return this;
        }

        /**
         * List of GPUs - json stringified array of {name, value} structs
         */
        public Builder setGpus(String gpus) {
            Gpus = gpus;
            return this;
        }

        public EndpointsPostPayload build() {
            return new EndpointsPostPayload(
                    Name,
                    EndpointCreationType,
                    ContainerEngine,
                    URL,
                    PublicURL,
                    GroupId,
                    TLS,
                    TLSSkipVerify,
                    TLSSkipClientVerify,
                    TLSCACertFile,
                    TLSCertFile,
                    TLSKeyFile,
                    AzureApplicationID,
                    AzureTenantID,
                    AzureAuthenticationKey,
                    TagIds,
                    EdgeCheckinInterval,
                    EdgeTunnelServerAddress,
                    Gpus
            );
        }
    }
}
