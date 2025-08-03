package eu.icole.portainer.dtos.backup;


public class BackupPayload {

    private String password;

    public BackupPayload() {
    }

    public BackupPayload(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}