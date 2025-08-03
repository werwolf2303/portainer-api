package eu.icole.portainer.dtos.system;

import eu.icole.portainer.dtos.build.BuildInfo;
import eu.icole.portainer.dtos.build.DependenciesInfo;
import eu.icole.portainer.dtos.build.RuntimeInfo;

public class VersionResponse {

    private String LatestVersion;
    private String ServerEdition;
    private Boolean UpdateAvailable;
    private String VersionSupport;
    private BuildInfo build;
    private String databaseVersion;
    private DependenciesInfo dependencies;
    private RuntimeInfo runtime;
    private String serverVersion;

    public VersionResponse() {
    }

    public VersionResponse(String LatestVersion, String ServerEdition, Boolean UpdateAvailable, String VersionSupport, BuildInfo build, String databaseVersion, DependenciesInfo dependencies, RuntimeInfo runtime, String serverVersion) {
        this.LatestVersion = LatestVersion;
        this.ServerEdition = ServerEdition;
        this.UpdateAvailable = UpdateAvailable;
        this.VersionSupport = VersionSupport;
        this.build = build;
        this.databaseVersion = databaseVersion;
        this.dependencies = dependencies;
        this.runtime = runtime;
        this.serverVersion = serverVersion;
    }

    public String getLatestVersion() {
        return LatestVersion;
    }

    public void setLatestVersion(String LatestVersion) {
        this.LatestVersion = LatestVersion;
    }

    public String getServerEdition() {
        return ServerEdition;
    }

    public void setServerEdition(String ServerEdition) {
        this.ServerEdition = ServerEdition;
    }

    public Boolean getUpdateAvailable() {
        return UpdateAvailable;
    }

    public void setUpdateAvailable(Boolean UpdateAvailable) {
        this.UpdateAvailable = UpdateAvailable;
    }

    public String getVersionSupport() {
        return VersionSupport;
    }

    public void setVersionSupport(String VersionSupport) {
        this.VersionSupport = VersionSupport;
    }

    public BuildInfo getBuild() {
        return build;
    }

    public void setBuild(BuildInfo build) {
        this.build = build;
    }

    public String getDatabaseVersion() {
        return databaseVersion;
    }

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    public DependenciesInfo getDependencies() {
        return dependencies;
    }

    public void setDependencies(DependenciesInfo dependencies) {
        this.dependencies = dependencies;
    }

    public RuntimeInfo getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeInfo runtime) {
        this.runtime = runtime;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

}