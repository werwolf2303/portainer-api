package eu.icole.portainer.dtos.v1;


public class WindowsSecurityContextOptions {

    private String gmsaCredentialSpec;
    private String gmsaCredentialSpecName;
    private Boolean hostProcess;
    private String runAsUserName;

    public WindowsSecurityContextOptions() {
    }

    public WindowsSecurityContextOptions(String gmsaCredentialSpec, String gmsaCredentialSpecName, Boolean hostProcess, String runAsUserName) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
        this.hostProcess = hostProcess;
        this.runAsUserName = runAsUserName;
    }

    public String getGmsaCredentialSpec() {
        return gmsaCredentialSpec;
    }

    public void setGmsaCredentialSpec(String gmsaCredentialSpec) {
        this.gmsaCredentialSpec = gmsaCredentialSpec;
    }

    public String getGmsaCredentialSpecName() {
        return gmsaCredentialSpecName;
    }

    public void setGmsaCredentialSpecName(String gmsaCredentialSpecName) {
        this.gmsaCredentialSpecName = gmsaCredentialSpecName;
    }

    public Boolean getHostProcess() {
        return hostProcess;
    }

    public void setHostProcess(Boolean hostProcess) {
        this.hostProcess = hostProcess;
    }

    public String getRunAsUserName() {
        return runAsUserName;
    }

    public void setRunAsUserName(String runAsUserName) {
        this.runAsUserName = runAsUserName;
    }

}