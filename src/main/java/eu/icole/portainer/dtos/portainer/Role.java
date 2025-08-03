package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.Authorizations;

public class Role {

    private Authorizations Authorizations;
    private String Description;
    private Integer Id;
    private String Name;
    private Integer Priority;

    public Role() {
    }

    public Role(Authorizations Authorizations, String Description, Integer Id, String Name, Integer Priority) {
        this.Authorizations = Authorizations;
        this.Description = Description;
        this.Id = Id;
        this.Name = Name;
        this.Priority = Priority;
    }

    public Authorizations getAuthorizations() {
        return Authorizations;
    }

    public void setAuthorizations(Authorizations Authorizations) {
        this.Authorizations = Authorizations;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
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

    public Integer getPriority() {
        return Priority;
    }

    public void setPriority(Integer Priority) {
        this.Priority = Priority;
    }

}