package eu.icole.portainer.dtos;

public class EndpointPostInitMigration {
    private boolean MigrateGPUs;
    private boolean MigrateIngress;

    public boolean isMigrateGPUs() {
        return MigrateGPUs;
    }

    public boolean isMigrateIngress() {
        return MigrateIngress;
    }
}
