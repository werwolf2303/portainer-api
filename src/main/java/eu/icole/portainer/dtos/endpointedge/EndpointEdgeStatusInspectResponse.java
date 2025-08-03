package eu.icole.portainer.dtos.endpointedge;

import eu.icole.portainer.dtos.endpointedge.EdgeJobResponse;
import eu.icole.portainer.dtos.endpointedge.StackStatusResponse;

import java.util.List;

public class EndpointEdgeStatusInspectResponse {

    private Integer checkin;
    private String credentials;
    private Integer port;
    private List<EdgeJobResponse> schedules;
    private List<StackStatusResponse> stacks;
    private String status;

    public EndpointEdgeStatusInspectResponse() {
    }

    public EndpointEdgeStatusInspectResponse(Integer checkin, String credentials, Integer port, List<EdgeJobResponse> schedules, List<StackStatusResponse> stacks, String status) {
        this.checkin = checkin;
        this.credentials = credentials;
        this.port = port;
        this.schedules = schedules;
        this.stacks = stacks;
        this.status = status;
    }

    public Integer getCheckin() {
        return checkin;
    }

    public void setCheckin(Integer checkin) {
        this.checkin = checkin;
    }

    public String getCredentials() {
        return credentials;
    }

    public void setCredentials(String credentials) {
        this.credentials = credentials;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public List<EdgeJobResponse> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<EdgeJobResponse> schedules) {
        this.schedules = schedules;
    }

    public List<StackStatusResponse> getStacks() {
        return stacks;
    }

    public void setStacks(List<StackStatusResponse> stacks) {
        this.stacks = stacks;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}