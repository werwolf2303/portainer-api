package eu.icole.portainer.dtos.v1;

import java.util.List;

public class Capabilities {

    private List<String> add;
    private List<String> drop;

    public Capabilities() {
    }

    public Capabilities(List<String> add, List<String> drop) {
        this.add = add;
        this.drop = drop;
    }

    public List<String> getAdd() {
        return add;
    }

    public void setAdd(List<String> add) {
        this.add = add;
    }

    public List<String> getDrop() {
        return drop;
    }

    public void setDrop(List<String> drop) {
        this.drop = drop;
    }

}