package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.*;

import java.util.List;

public class Container {

    private List<String> args;
    private List<String> command;
    private List<EnvVar> env;
    private List<EnvFromSource> envFrom;
    private String image;
    private String imagePullPolicy;
    private Lifecycle lifecycle;
    private Probe livenessProbe;
    private String name;
    private List<ContainerPort> ports;
    private Probe readinessProbe;
    private List<ContainerResizePolicy> resizePolicy;
    private ResourceRequirements resources;
    private String restartPolicy;
    private SecurityContext securityContext;
    private Probe startupProbe;
    private Boolean stdin;
    private Boolean stdinOnce;
    private String terminationMessagePath;
    private String terminationMessagePolicy;
    private Boolean tty;
    private List<VolumeDevice> volumeDevices;
    private List<VolumeMount> volumeMounts;
    private String workingDir;

    public Container() {
    }

    public Container(List<String> args, List<String> command, List<EnvVar> env, List<EnvFromSource> envFrom, String image, String imagePullPolicy, Lifecycle lifecycle, Probe livenessProbe, String name, List<ContainerPort> ports, Probe readinessProbe, List<ContainerResizePolicy> resizePolicy, ResourceRequirements resources, String restartPolicy, SecurityContext securityContext, Probe startupProbe, Boolean stdin, Boolean stdinOnce, String terminationMessagePath, String terminationMessagePolicy, Boolean tty, List<VolumeDevice> volumeDevices, List<VolumeMount> volumeMounts, String workingDir) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.envFrom = envFrom;
        this.image = image;
        this.imagePullPolicy = imagePullPolicy;
        this.lifecycle = lifecycle;
        this.livenessProbe = livenessProbe;
        this.name = name;
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resizePolicy = resizePolicy;
        this.resources = resources;
        this.restartPolicy = restartPolicy;
        this.securityContext = securityContext;
        this.startupProbe = startupProbe;
        this.stdin = stdin;
        this.stdinOnce = stdinOnce;
        this.terminationMessagePath = terminationMessagePath;
        this.terminationMessagePolicy = terminationMessagePolicy;
        this.tty = tty;
        this.volumeDevices = volumeDevices;
        this.volumeMounts = volumeMounts;
        this.workingDir = workingDir;
    }

    public List<String> getArgs() {
        return args;
    }

    public void setArgs(List<String> args) {
        this.args = args;
    }

    public List<String> getCommand() {
        return command;
    }

    public void setCommand(List<String> command) {
        this.command = command;
    }

    public List<EnvVar> getEnv() {
        return env;
    }

    public void setEnv(List<EnvVar> env) {
        this.env = env;
    }

    public List<EnvFromSource> getEnvFrom() {
        return envFrom;
    }

    public void setEnvFrom(List<EnvFromSource> envFrom) {
        this.envFrom = envFrom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(String imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public Lifecycle getLifecycle() {
        return lifecycle;
    }

    public void setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    public Probe getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(Probe livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ContainerPort> getPorts() {
        return ports;
    }

    public void setPorts(List<ContainerPort> ports) {
        this.ports = ports;
    }

    public Probe getReadinessProbe() {
        return readinessProbe;
    }

    public void setReadinessProbe(Probe readinessProbe) {
        this.readinessProbe = readinessProbe;
    }

    public List<ContainerResizePolicy> getResizePolicy() {
        return resizePolicy;
    }

    public void setResizePolicy(List<ContainerResizePolicy> resizePolicy) {
        this.resizePolicy = resizePolicy;
    }

    public ResourceRequirements getResources() {
        return resources;
    }

    public void setResources(ResourceRequirements resources) {
        this.resources = resources;
    }

    public String getRestartPolicy() {
        return restartPolicy;
    }

    public void setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
    }

    public SecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(SecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public Probe getStartupProbe() {
        return startupProbe;
    }

    public void setStartupProbe(Probe startupProbe) {
        this.startupProbe = startupProbe;
    }

    public Boolean getStdin() {
        return stdin;
    }

    public void setStdin(Boolean stdin) {
        this.stdin = stdin;
    }

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public void setStdinOnce(Boolean stdinOnce) {
        this.stdinOnce = stdinOnce;
    }

    public String getTerminationMessagePath() {
        return terminationMessagePath;
    }

    public void setTerminationMessagePath(String terminationMessagePath) {
        this.terminationMessagePath = terminationMessagePath;
    }

    public String getTerminationMessagePolicy() {
        return terminationMessagePolicy;
    }

    public void setTerminationMessagePolicy(String terminationMessagePolicy) {
        this.terminationMessagePolicy = terminationMessagePolicy;
    }

    public Boolean getTty() {
        return tty;
    }

    public void setTty(Boolean tty) {
        this.tty = tty;
    }

    public List<VolumeDevice> getVolumeDevices() {
        return volumeDevices;
    }

    public void setVolumeDevices(List<VolumeDevice> volumeDevices) {
        this.volumeDevices = volumeDevices;
    }

    public List<VolumeMount> getVolumeMounts() {
        return volumeMounts;
    }

    public void setVolumeMounts(List<VolumeMount> volumeMounts) {
        this.volumeMounts = volumeMounts;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public void setWorkingDir(String workingDir) {
        this.workingDir = workingDir;
    }

}