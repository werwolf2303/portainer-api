package eu.icole.portainer.dtos.portainer;


public class EndpointPostInitMigrations {

    private Boolean MigrateGPUs;
    private Boolean MigrateIngresses;

    public EndpointPostInitMigrations() {
    }

    public EndpointPostInitMigrations(Boolean MigrateGPUs, Boolean MigrateIngresses) {
        this.MigrateGPUs = MigrateGPUs;
        this.MigrateIngresses = MigrateIngresses;
    }

    public Boolean getMigrateGPUs() {
        return MigrateGPUs;
    }

    public void setMigrateGPUs(Boolean MigrateGPUs) {
        this.MigrateGPUs = MigrateGPUs;
    }

    public Boolean getMigrateIngresses() {
        return MigrateIngresses;
    }

    public void setMigrateIngresses(Boolean MigrateIngresses) {
        this.MigrateIngresses = MigrateIngresses;
    }

}