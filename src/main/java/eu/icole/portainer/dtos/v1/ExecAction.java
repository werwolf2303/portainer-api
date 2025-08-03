package eu.icole.portainer.dtos.v1;

import java.util.List;

public class ExecAction {

    private List<String> command;

    public ExecAction() {
    }

    public ExecAction(List<String> command) {
        this.command = command;
    }

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

}