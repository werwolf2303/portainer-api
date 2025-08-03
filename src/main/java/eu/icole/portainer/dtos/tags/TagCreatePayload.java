package eu.icole.portainer.dtos.tags;


public class TagCreatePayload {

    private String name;

    public TagCreatePayload() {
    }

    public TagCreatePayload(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}