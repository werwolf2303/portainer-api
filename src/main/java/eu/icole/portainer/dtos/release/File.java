package eu.icole.portainer.dtos.release;

import java.util.List;

public class File {

    private List<Integer> data;
    private String name;

    public File() {
    }

    public File(List<Integer> data, String name) {
        this.data = data;
        this.name = name;
    }

    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}