package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ExecAction;
import eu.icole.portainer.dtos.v1.GRPCAction;
import eu.icole.portainer.dtos.v1.HTTPGetAction;
import eu.icole.portainer.dtos.v1.TCPSocketAction;

public class Probe {

    private ExecAction exec;
    private Integer failureThreshold;
    private GRPCAction grpc;
    private HTTPGetAction httpGet;
    private Integer initialDelaySeconds;
    private Integer periodSeconds;
    private Integer successThreshold;
    private TCPSocketAction tcpSocket;
    private Integer terminationGracePeriodSeconds;
    private Integer timeoutSeconds;

    public Probe() {
    }

    public Probe(ExecAction exec, Integer failureThreshold, GRPCAction grpc, HTTPGetAction httpGet, Integer initialDelaySeconds, Integer periodSeconds, Integer successThreshold, TCPSocketAction tcpSocket, Integer terminationGracePeriodSeconds, Integer timeoutSeconds) {
        this.exec = exec;
        this.failureThreshold = failureThreshold;
        this.grpc = grpc;
        this.httpGet = httpGet;
        this.initialDelaySeconds = initialDelaySeconds;
        this.periodSeconds = periodSeconds;
        this.successThreshold = successThreshold;
        this.tcpSocket = tcpSocket;
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        this.timeoutSeconds = timeoutSeconds;
    }

    public ExecAction getExec() {
        return exec;
    }

    public void setExec(ExecAction exec) {
        this.exec = exec;
    }

    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public GRPCAction getGrpc() {
        return grpc;
    }

    public void setGrpc(GRPCAction grpc) {
        this.grpc = grpc;
    }

    public HTTPGetAction getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(HTTPGetAction httpGet) {
        this.httpGet = httpGet;
    }

    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    public TCPSocketAction getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    public Integer getTerminationGracePeriodSeconds() {
        return terminationGracePeriodSeconds;
    }

    public void setTerminationGracePeriodSeconds(Integer terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
    }

    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

}