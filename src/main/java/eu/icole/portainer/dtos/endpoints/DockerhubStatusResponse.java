package eu.icole.portainer.dtos.endpoints;


public class DockerhubStatusResponse {

    private Integer limit;
    private Integer remaining;

    public DockerhubStatusResponse() {
    }

    public DockerhubStatusResponse(Integer limit, Integer remaining) {
        this.limit = limit;
        this.remaining = remaining;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getRemaining() {
        return remaining;
    }

    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

}