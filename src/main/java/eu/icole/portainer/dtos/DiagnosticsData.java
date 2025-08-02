package eu.icole.portainer.dtos;

import java.util.Map;

public class DiagnosticsData {
    private Map<String, String> DNS;
    private Map<String, String> Log;
    private Map<String, String> Proxy;
    private Map<String, String> Telnet;

    public Map<String, String> getDNS() {
        return DNS;
    }

    public Map<String, String> getLog() {
        return Log;
    }

    public Map<String, String> getProxy() {
        return Proxy;
    }

    public Map<String, String> getTelnet() {
        return Telnet;
    }
}
