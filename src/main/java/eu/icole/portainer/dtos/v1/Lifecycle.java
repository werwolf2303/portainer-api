package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.LifecycleHandler;

public class Lifecycle {

    private LifecycleHandler postStart;
    private LifecycleHandler preStop;

    public Lifecycle() {
    }

    public Lifecycle(LifecycleHandler postStart, LifecycleHandler preStop) {
        this.postStart = postStart;
        this.preStop = preStop;
    }

    public LifecycleHandler getPostStart() {
        return postStart;
    }

    public void setPostStart(LifecycleHandler postStart) {
        this.postStart = postStart;
    }

    public LifecycleHandler getPreStop() {
        return preStop;
    }

    public void setPreStop(LifecycleHandler preStop) {
        this.preStop = preStop;
    }

}