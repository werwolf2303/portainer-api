package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.EdgeStackDeploymentStatus;
import eu.icole.portainer.dtos.portainer.EdgeStackStatusDetails;
import eu.icole.portainer.dtos.portainer.StackDeploymentInfo;

import java.util.List;

public class EdgeStackStatus {

    private Integer Type;
    private StackDeploymentInfo deploymentInfo;
    private EdgeStackStatusDetails details;
    private Integer endpointID;
    private String error;
    private Boolean readyRePullImage;
    private List<EdgeStackDeploymentStatus> status;

    public EdgeStackStatus() {
    }

    public EdgeStackStatus(Integer Type, StackDeploymentInfo deploymentInfo, EdgeStackStatusDetails details, Integer endpointID, String error, Boolean readyRePullImage, List<EdgeStackDeploymentStatus> status) {
        this.Type = Type;
        this.deploymentInfo = deploymentInfo;
        this.details = details;
        this.endpointID = endpointID;
        this.error = error;
        this.readyRePullImage = readyRePullImage;
        this.status = status;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public StackDeploymentInfo getDeploymentInfo() {
        return deploymentInfo;
    }

    public void setDeploymentInfo(StackDeploymentInfo deploymentInfo) {
        this.deploymentInfo = deploymentInfo;
    }

    public EdgeStackStatusDetails getDetails() {
        return details;
    }

    public void setDetails(EdgeStackStatusDetails details) {
        this.details = details;
    }

    public Integer getEndpointID() {
        return endpointID;
    }

    public void setEndpointID(Integer endpointID) {
        this.endpointID = endpointID;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public Boolean getReadyRePullImage() {
        return readyRePullImage;
    }

    public void setReadyRePullImage(Boolean readyRePullImage) {
        this.readyRePullImage = readyRePullImage;
    }

    public List<EdgeStackDeploymentStatus> getStatus() {
        return status;
    }

    public void setStatus(List<EdgeStackDeploymentStatus> status) {
        this.status = status;
    }

}