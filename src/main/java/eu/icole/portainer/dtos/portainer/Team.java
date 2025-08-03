package eu.icole.portainer.dtos.portainer;


public class Team {

    private Integer Id;
    private String Name;

    public Team() {
    }

    public Team(Integer Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

}