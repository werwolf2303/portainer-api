package eu.icole.portainer.dtos.helm;


public class InstallChartPayload {

    private String chart;
    private String name;
    private String namespace;
    private String repo;
    private String values;

    public InstallChartPayload() {
    }

    public InstallChartPayload(String chart, String name, String namespace, String repo, String values) {
        this.chart = chart;
        this.name = name;
        this.namespace = namespace;
        this.repo = repo;
        this.values = values;
    }

    public String getChart() {
        return chart;
    }

    public void setChart(String chart) {
        this.chart = chart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getValues() {
        return values;
    }

    public void setValues(String values) {
        this.values = values;
    }

}