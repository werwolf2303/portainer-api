package eu.icole.portainer.exceptions;

public class PortainerException extends Exception {
    public PortainerException() {
    }

    public PortainerException(String message) {
        super(message);
    }

    public PortainerException(String message, Exception exception) {
        super(message, exception);
    }
}
