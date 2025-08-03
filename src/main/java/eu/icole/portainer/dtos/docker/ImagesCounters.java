package eu.icole.portainer.dtos.docker;


public class ImagesCounters {

    private Integer size;
    private Integer total;

    public ImagesCounters() {
    }

    public ImagesCounters(Integer size, Integer total) {
        this.size = size;
        this.total = total;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

}