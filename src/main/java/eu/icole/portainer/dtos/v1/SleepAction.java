package eu.icole.portainer.dtos.v1;


public class SleepAction {

    private Integer seconds;

    public SleepAction() {
    }

    public SleepAction(Integer seconds) {
        this.seconds = seconds;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

}