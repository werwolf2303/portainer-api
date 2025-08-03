package eu.icole.portainer.dtos.portainer;

import com.google.gson.annotations.SerializedName;
import eu.icole.portainer.dtos.portainer.TeamResourceAccess;
import eu.icole.portainer.dtos.portainer.UserResourceAccess;

import java.util.List;

public class ResourceControl {

    private Integer AccessLevel;
    private Boolean AdministratorsOnly;
    private Integer Id;
    private Integer OwnerId;
    @SerializedName("Public")
    private Boolean Public_;
    private String ResourceId;
    private List<String> SubResourceIds;
    private Boolean System;
    private List<TeamResourceAccess> TeamAccesses;
    private Integer Type;
    private List<UserResourceAccess> UserAccesses;

    public ResourceControl() {
    }

    public ResourceControl(Integer AccessLevel, Boolean AdministratorsOnly, Integer Id, Integer OwnerId, Boolean Public_, String ResourceId, List<String> SubResourceIds, Boolean System, List<TeamResourceAccess> TeamAccesses, Integer Type, List<UserResourceAccess> UserAccesses) {
        this.AccessLevel = AccessLevel;
        this.AdministratorsOnly = AdministratorsOnly;
        this.Id = Id;
        this.OwnerId = OwnerId;
        this.Public_ = Public_;
        this.ResourceId = ResourceId;
        this.SubResourceIds = SubResourceIds;
        this.System = System;
        this.TeamAccesses = TeamAccesses;
        this.Type = Type;
        this.UserAccesses = UserAccesses;
    }

    public Integer getAccessLevel() {
        return AccessLevel;
    }

    public void setAccessLevel(Integer AccessLevel) {
        this.AccessLevel = AccessLevel;
    }

    public Boolean getAdministratorsOnly() {
        return AdministratorsOnly;
    }

    public void setAdministratorsOnly(Boolean AdministratorsOnly) {
        this.AdministratorsOnly = AdministratorsOnly;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Integer getOwnerId() {
        return OwnerId;
    }

    public void setOwnerId(Integer OwnerId) {
        this.OwnerId = OwnerId;
    }

    public Boolean getPublic_() {
        return Public_;
    }

    public void setPublic_(Boolean Public_) {
        this.Public_ = Public_;
    }

    public String getResourceId() {
        return ResourceId;
    }

    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public List<String> getSubResourceIds() {
        return SubResourceIds;
    }

    public void setSubResourceIds(List<String> SubResourceIds) {
        this.SubResourceIds = SubResourceIds;
    }

    public Boolean getSystem() {
        return System;
    }

    public void setSystem(Boolean System) {
        this.System = System;
    }

    public List<TeamResourceAccess> getTeamAccesses() {
        return TeamAccesses;
    }

    public void setTeamAccesses(List<TeamResourceAccess> TeamAccesses) {
        this.TeamAccesses = TeamAccesses;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public List<UserResourceAccess> getUserAccesses() {
        return UserAccesses;
    }

    public void setUserAccesses(List<UserResourceAccess> UserAccesses) {
        this.UserAccesses = UserAccesses;
    }

}