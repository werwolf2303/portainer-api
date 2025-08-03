package eu.icole.portainer.dtos.release;

import eu.icole.portainer.dtos.release.HookExecution;

import java.util.List;

public class Hook {

    private List<String> delete_policies;
    private List<String> events;
    private String kind;
    private HookExecution last_run;
    private String manifest;
    private String name;
    private String path;
    private Integer weight;

    public Hook() {
    }

    public Hook(List<String> delete_policies, List<String> events, String kind, HookExecution last_run, String manifest, String name, String path, Integer weight) {
        this.delete_policies = delete_policies;
        this.events = events;
        this.kind = kind;
        this.last_run = last_run;
        this.manifest = manifest;
        this.name = name;
        this.path = path;
        this.weight = weight;
    }

    public List<String> getDelete_policies() {
        return delete_policies;
    }

    public void setDelete_policies(List<String> delete_policies) {
        this.delete_policies = delete_policies;
    }

    public List<String> getEvents() {
        return events;
    }

    public void setEvents(List<String> events) {
        this.events = events;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public HookExecution getLast_run() {
        return last_run;
    }

    public void setLast_run(HookExecution last_run) {
        this.last_run = last_run;
    }

    public String getManifest() {
        return manifest;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}