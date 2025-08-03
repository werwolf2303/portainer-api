package eu.icole.portainer.olddtos;

import java.util.ArrayList;
import java.util.List;

public class EndpointsGetPayload {
    private int start;
    private int limit;
    private int order;
    private String search;
    private List<Integer> groupIds;
    private List<Integer> status;
    private List<Integer> types;
    private List<Integer> tagIds;
    private boolean tagsPartialMatch;
    private List<Integer> endpointIds;
    private boolean provisioned;
    private List<String> agentVersions;
    private boolean edgeAsync;
    private boolean edgeDeviceUntrusted;
    private int edgeCheckInPassedSeconds;
    private boolean excludeSnapshots;
    private String name;
    private String edgeStackStatus;

    public EndpointsGetPayload(int start, int limit, int order, String search, List<Integer> groupIds, List<Integer> status, List<Integer> types, List<Integer> tagIds, boolean tagsPartialMatch, List<Integer> endpointIds, boolean provisioned, List<String> agentVersions, boolean edgeAsync, boolean edgeDeviceUntrusted, int edgeCheckInPassedSeconds, boolean excludeSnapshots, String name, String edgeStackStatus) {
        this.start = start;
        this.limit = limit;
        this.order = order;
        this.search = search;
        this.groupIds = groupIds;
        this.status = status;
        this.types = types;
        this.tagIds = tagIds;
        this.tagsPartialMatch = tagsPartialMatch;
        this.endpointIds = endpointIds;
        this.provisioned = provisioned;
        this.agentVersions = agentVersions;
        this.edgeAsync = edgeAsync;
        this.edgeDeviceUntrusted = edgeDeviceUntrusted;
        this.edgeCheckInPassedSeconds = edgeCheckInPassedSeconds;
        this.excludeSnapshots = excludeSnapshots;
        this.name = name;
        this.edgeStackStatus = edgeStackStatus;
    }

    public int getStart() {
        return start;
    }

    public int getLimit() {
        return limit;
    }

    public int getOrder() {
        return order;
    }

    public String getSearch() {
        return search;
    }

    public List<Integer> getGroupIds() {
        return groupIds;
    }

    public List<Integer> getStatus() {
        return status;
    }

    public List<Integer> getTypes() {
        return types;
    }

    public List<Integer> getTagIds() {
        return tagIds;
    }

    public boolean isTagsPartialMatch() {
        return tagsPartialMatch;
    }

    public List<Integer> getEndpointIds() {
        return endpointIds;
    }

    public boolean isProvisioned() {
        return provisioned;
    }

    public List<String> getAgentVersions() {
        return agentVersions;
    }

    public boolean isEdgeAsync() {
        return edgeAsync;
    }

    public boolean isEdgeDeviceUntrusted() {
        return edgeDeviceUntrusted;
    }

    public int getEdgeCheckInPassedSeconds() {
        return edgeCheckInPassedSeconds;
    }

    public boolean isExcludeSnapshots() {
        return excludeSnapshots;
    }

    public String getName() {
        return name;
    }

    public String getEdgeStackStatus() {
        return edgeStackStatus;
    }

    public static class Builder {
        private int start;
        private int limit;
        private int order;
        private String search;
        private List<Integer> groupIds = new ArrayList<>();
        private List<Integer> status = new ArrayList<>();
        private List<Integer> types = new ArrayList<>();
        private List<Integer> tagIds = new ArrayList<>();
        private boolean tagsPartialMatch;
        private List<Integer> endpointIds = new ArrayList<>();
        private boolean provisioned;
        private List<String> agentVersions = new ArrayList<>();
        private boolean edgeAsync;
        private boolean edgeDeviceUntrusted;
        private int edgeCheckInPassedSeconds;
        private boolean excludeSnapshots;
        private String name;
        private String edgeStackStatus;

        public Builder setStart(int start) {
            this.start = start;
            return this;
        }

        public Builder setLimit(int limit) {
            this.limit = limit;
            return this;
        }

        public Builder setOrder(int order) {
            this.order = order;
            return this;
        }

        public Builder setSearch(String search) {
            this.search = search;
            return this;
        }

        public Builder setGroupIds(List<Integer> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder setStatus(List<Integer> status) {
            this.status = status;
            return this;
        }

        public Builder setTypes(List<Integer> types) {
            this.types = types;
            return this;
        }

        public Builder setTagIds(List<Integer> tagIds) {
            this.tagIds = tagIds;
            return this;
        }

        public Builder setTagsPartialMatch(boolean tagsPartialMatch) {
            this.tagsPartialMatch = tagsPartialMatch;
            return this;
        }

        public Builder setEndpointIds(List<Integer> endpointIds) {
            this.endpointIds = endpointIds;
            return this;
        }

        public Builder setProvisioned(boolean provisioned) {
            this.provisioned = provisioned;
            return this;
        }

        public Builder setAgentVersions(List<String> agentVersions) {
            this.agentVersions = agentVersions;
            return this;
        }

        public Builder setEdgeAsync(boolean edgeAsync) {
            this.edgeAsync = edgeAsync;
            return this;
        }

        public Builder setEdgeDeviceUntrusted(boolean edgeDeviceUntrusted) {
            this.edgeDeviceUntrusted = edgeDeviceUntrusted;
            return this;
        }

        public Builder setEdgeCheckInPassedSeconds(int edgeCheckInPassedSeconds) {
            this.edgeCheckInPassedSeconds = edgeCheckInPassedSeconds;
            return this;
        }

        public Builder setExcludeSnapshots(boolean excludeSnapshots) {
            this.excludeSnapshots = excludeSnapshots;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEdgeStackStatus(String edgeStackStatus) {
            this.edgeStackStatus = edgeStackStatus;
            return this;
        }

        public EndpointsGetPayload build() {
            return new EndpointsGetPayload(
                    start,
                    limit,
                    order,
                    search,
                    groupIds,
                    status,
                    types,
                    tagIds,
                    tagsPartialMatch,
                    endpointIds,
                    provisioned,
                    agentVersions,
                    edgeAsync,
                    edgeDeviceUntrusted,
                    edgeCheckInPassedSeconds,
                    excludeSnapshots,
                    name,
                    edgeStackStatus
            );
        }
    }
}
