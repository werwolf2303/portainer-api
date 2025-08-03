package eu.icole.portainer.dtos.portainer;


public class EdgeStackDeploymentStatus {

    private Integer Version;
    private String error;
    private Integer rollbackTo;
    private Integer time;
    private Integer type;

    public EdgeStackDeploymentStatus() {
    }

    public EdgeStackDeploymentStatus(Integer Version, String error, Integer rollbackTo, Integer time, Integer type) {
        this.Version = Version;
        this.error = error;
        this.rollbackTo = rollbackTo;
        this.time = time;
        this.type = type;
    }

    public Integer getVersion() {
        return Version;
    }

    public void setVersion(Integer Version) {
        this.Version = Version;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Integer getRollbackTo() {
        return rollbackTo;
    }

    public void setRollbackTo(Integer rollbackTo) {
        this.rollbackTo = rollbackTo;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}