package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.intstr.IntOrString;
import eu.icole.portainer.dtos.v1.HTTPHeader;

import java.util.List;

public class HTTPGetAction {

    private String host;
    private List<HTTPHeader> httpHeaders;
    private String path;
    private IntOrString port;
    private String scheme;

    public HTTPGetAction() {
    }

    public HTTPGetAction(String host, List<HTTPHeader> httpHeaders, String path, IntOrString port, String scheme) {
        this.host = host;
        this.httpHeaders = httpHeaders;
        this.path = path;
        this.port = port;
        this.scheme = scheme;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public List<HTTPHeader> getHttpHeaders() {
        return httpHeaders;
    }

    public void setHttpHeaders(List<HTTPHeader> httpHeaders) {
        this.httpHeaders = httpHeaders;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public IntOrString getPort() {
        return port;
    }

    public void setPort(IntOrString port) {
        this.port = port;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

}