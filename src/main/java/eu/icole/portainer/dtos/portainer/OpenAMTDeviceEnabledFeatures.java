package eu.icole.portainer.dtos.portainer;


public class OpenAMTDeviceEnabledFeatures {

    private Boolean IDER;
    private Boolean KVM;
    private Boolean SOL;
    private Boolean redirection;
    private String userConsent;

    public OpenAMTDeviceEnabledFeatures() {
    }

    public OpenAMTDeviceEnabledFeatures(Boolean IDER, Boolean KVM, Boolean SOL, Boolean redirection, String userConsent) {
        this.IDER = IDER;
        this.KVM = KVM;
        this.SOL = SOL;
        this.redirection = redirection;
        this.userConsent = userConsent;
    }

    public Boolean getIDER() {
        return IDER;
    }

    public void setIDER(Boolean IDER) {
        this.IDER = IDER;
    }

    public Boolean getKVM() {
        return KVM;
    }

    public void setKVM(Boolean KVM) {
        this.KVM = KVM;
    }

    public Boolean getSOL() {
        return SOL;
    }

    public void setSOL(Boolean SOL) {
        this.SOL = SOL;
    }

    public Boolean getRedirection() {
        return redirection;
    }

    public void setRedirection(Boolean redirection) {
        this.redirection = redirection;
    }

    public String getUserConsent() {
        return userConsent;
    }

    public void setUserConsent(String userConsent) {
        this.userConsent = userConsent;
    }

}