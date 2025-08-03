package eu.icole.portainer.dtos.release;


public class HookExecution {

    private String completed_at;
    private String phase;
    private String started_at;

    public HookExecution() {
    }

    public HookExecution(String completed_at, String phase, String started_at) {
        this.completed_at = completed_at;
        this.phase = phase;
        this.started_at = started_at;
    }

    public String getCompleted_at() {
        return completed_at;
    }

    public void setCompleted_at(String completed_at) {
        this.completed_at = completed_at;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getStarted_at() {
        return started_at;
    }

    public void setStarted_at(String started_at) {
        this.started_at = started_at;
    }

}