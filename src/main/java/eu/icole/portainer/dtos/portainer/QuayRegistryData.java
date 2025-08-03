package eu.icole.portainer.dtos.portainer;


public class QuayRegistryData {

    private String OrganisationName;
    private Boolean UseOrganisation;

    public QuayRegistryData() {
    }

    public QuayRegistryData(String OrganisationName, Boolean UseOrganisation) {
        this.OrganisationName = OrganisationName;
        this.UseOrganisation = UseOrganisation;
    }

    public String getOrganisationName() {
        return OrganisationName;
    }

    public void setOrganisationName(String OrganisationName) {
        this.OrganisationName = OrganisationName;
    }

    public Boolean getUseOrganisation() {
        return UseOrganisation;
    }

    public void setUseOrganisation(Boolean UseOrganisation) {
        this.UseOrganisation = UseOrganisation;
    }

}