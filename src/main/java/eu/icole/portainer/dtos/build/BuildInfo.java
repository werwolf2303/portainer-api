package eu.icole.portainer.dtos.build;


public class BuildInfo {

    private String buildNumber;
    private String gitCommit;
    private String goVersion;
    private String imageTag;
    private String nodejsVersion;
    private String webpackVersion;
    private String yarnVersion;

    public BuildInfo() {
    }

    public BuildInfo(String buildNumber, String gitCommit, String goVersion, String imageTag, String nodejsVersion, String webpackVersion, String yarnVersion) {
        this.buildNumber = buildNumber;
        this.gitCommit = gitCommit;
        this.goVersion = goVersion;
        this.imageTag = imageTag;
        this.nodejsVersion = nodejsVersion;
        this.webpackVersion = webpackVersion;
        this.yarnVersion = yarnVersion;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }

    public String getGitCommit() {
        return gitCommit;
    }

    public void setGitCommit(String gitCommit) {
        this.gitCommit = gitCommit;
    }

    public String getGoVersion() {
        return goVersion;
    }

    public void setGoVersion(String goVersion) {
        this.goVersion = goVersion;
    }

    public String getImageTag() {
        return imageTag;
    }

    public void setImageTag(String imageTag) {
        this.imageTag = imageTag;
    }

    public String getNodejsVersion() {
        return nodejsVersion;
    }

    public void setNodejsVersion(String nodejsVersion) {
        this.nodejsVersion = nodejsVersion;
    }

    public String getWebpackVersion() {
        return webpackVersion;
    }

    public void setWebpackVersion(String webpackVersion) {
        this.webpackVersion = webpackVersion;
    }

    public String getYarnVersion() {
        return yarnVersion;
    }

    public void setYarnVersion(String yarnVersion) {
        this.yarnVersion = yarnVersion;
    }

}