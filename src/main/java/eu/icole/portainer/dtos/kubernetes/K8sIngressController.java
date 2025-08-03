package eu.icole.portainer.dtos.kubernetes;

import com.google.gson.annotations.SerializedName;

public class K8sIngressController {

    private Boolean Availability;
    private String ClassName;
    private String Name;
    @SerializedName("New")
    private Boolean New_;
    private String Type;
    private Boolean Used;

    public K8sIngressController() {
    }

    public K8sIngressController(Boolean Availability, String ClassName, String Name, Boolean New_, String Type, Boolean Used) {
        this.Availability = Availability;
        this.ClassName = ClassName;
        this.Name = Name;
        this.New_ = New_;
        this.Type = Type;
        this.Used = Used;
    }

    public Boolean getAvailability() {
        return Availability;
    }

    public void setAvailability(Boolean Availability) {
        this.Availability = Availability;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Boolean getNew_() {
        return New_;
    }

    public void setNew_(Boolean New_) {
        this.New_ = New_;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public Boolean getUsed() {
        return Used;
    }

    public void setUsed(Boolean Used) {
        this.Used = Used;
    }

}