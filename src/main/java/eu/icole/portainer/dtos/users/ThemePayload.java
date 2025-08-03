package eu.icole.portainer.dtos.users;


public class ThemePayload {

    private String color;

    public ThemePayload() {
    }

    public ThemePayload(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}