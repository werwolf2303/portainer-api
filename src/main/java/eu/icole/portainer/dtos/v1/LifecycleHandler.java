package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.ExecAction;
import eu.icole.portainer.dtos.v1.HTTPGetAction;
import eu.icole.portainer.dtos.v1.SleepAction;
import eu.icole.portainer.dtos.v1.TCPSocketAction;

public class LifecycleHandler {

    private ExecAction exec;
    private HTTPGetAction httpGet;
    private SleepAction sleep;
    private TCPSocketAction tcpSocket;

    public LifecycleHandler() {
    }

    public LifecycleHandler(ExecAction exec, HTTPGetAction httpGet, SleepAction sleep, TCPSocketAction tcpSocket) {
        this.exec = exec;
        this.httpGet = httpGet;
        this.sleep = sleep;
        this.tcpSocket = tcpSocket;
    }

    public ExecAction getExec() {
        return exec;
    }

    public void setExec(ExecAction exec) {
        this.exec = exec;
    }

    public HTTPGetAction getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(HTTPGetAction httpGet) {
        this.httpGet = httpGet;
    }

    public SleepAction getSleep() {
        return sleep;
    }

    public void setSleep(SleepAction sleep) {
        this.sleep = sleep;
    }

    public TCPSocketAction getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(TCPSocketAction tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

}