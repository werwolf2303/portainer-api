package eu.icole.portainer.dtos.v1beta1;

import com.google.gson.annotations.SerializedName;
import eu.icole.portainer.dtos.v1beta1.NodeMetrics;

import java.util.List;

public class NodeMetricsList {

    private String apiVersion;
    @SerializedName("continue")
    private String continue_;
    private List<NodeMetrics> items;
    private String kind;
    private Integer remainingItemCount;
    private String resourceVersion;
    private String selfLink;

    public NodeMetricsList() {
    }

    public NodeMetricsList(String apiVersion, String continue_, List<NodeMetrics> items, String kind, Integer remainingItemCount, String resourceVersion, String selfLink) {
        this.apiVersion = apiVersion;
        this.continue_ = continue_;
        this.items = items;
        this.kind = kind;
        this.remainingItemCount = remainingItemCount;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getContinue_() {
        return continue_;
    }

    public void setContinue_(String continue_) {
        this.continue_ = continue_;
    }

    public List<NodeMetrics> getItems() {
        return items;
    }

    public void setItems(List<NodeMetrics> items) {
        this.items = items;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getRemainingItemCount() {
        return remainingItemCount;
    }

    public void setRemainingItemCount(Integer remainingItemCount) {
        this.remainingItemCount = remainingItemCount;
    }

    public String getResourceVersion() {
        return resourceVersion;
    }

    public void setResourceVersion(String resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public String getSelfLink() {
        return selfLink;
    }

    public void setSelfLink(String selfLink) {
        this.selfLink = selfLink;
    }

}