package eu.icole.portainer.dtos.portainer;


public class UserThemeSettings {

    private String color;

    public UserThemeSettings() {
    }

    public UserThemeSettings(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}