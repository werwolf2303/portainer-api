package eu.icole.portainer.dtos.portainer;

import java.util.Map;

public class DiagnosticsData {

    private Map<String, Object> DNS;
    private String Log;
    private Map<String, Object> Proxy;
    private Map<String, Object> Telnet;

    public DiagnosticsData() {
    }

    public DiagnosticsData(Map<String, Object> DNS, String Log, Map<String, Object> Proxy, Map<String, Object> Telnet) {
        this.DNS = DNS;
        this.Log = Log;
        this.Proxy = Proxy;
        this.Telnet = Telnet;
    }

    public Map<String, Object> getDNS() {
        return DNS;
    }

    public void setDNS(Map<String, Object> DNS) {
        this.DNS = DNS;
    }

    public String getLog() {
        return Log;
    }

    public void setLog(String Log) {
        this.Log = Log;
    }

    public Map<String, Object> getProxy() {
        return Proxy;
    }

    public void setProxy(Map<String, Object> Proxy) {
        this.Proxy = Proxy;
    }

    public Map<String, Object> getTelnet() {
        return Telnet;
    }

    public void setTelnet(Map<String, Object> Telnet) {
        this.Telnet = Telnet;
    }

}