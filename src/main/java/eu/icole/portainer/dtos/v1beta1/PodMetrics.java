package eu.icole.portainer.dtos.v1beta1;

import eu.icole.portainer.dtos.v1.Duration;
import eu.icole.portainer.dtos.v1.ManagedFieldsEntry;
import eu.icole.portainer.dtos.v1.OwnerReference;
import eu.icole.portainer.dtos.v1beta1.ContainerMetrics;

import java.util.List;
import java.util.Map;

public class PodMetrics {

    private Map<String, Object> annotations;
    private String apiVersion;
    private List<ContainerMetrics> containers;
    private String creationTimestamp;
    private Integer deletionGracePeriodSeconds;
    private String deletionTimestamp;
    private List<String> finalizers;
    private String generateName;
    private Integer generation;
    private String kind;
    private Map<String, Object> labels;
    private List<ManagedFieldsEntry> managedFields;
    private String name;
    private String namespace;
    private List<OwnerReference> ownerReferences;
    private String resourceVersion;
    private String selfLink;
    private String timestamp;
    private String uid;
    private Duration window;

    public PodMetrics() {
    }

    public PodMetrics(Map<String, Object> annotations, String apiVersion, List<ContainerMetrics> containers, String creationTimestamp, Integer deletionGracePeriodSeconds, String deletionTimestamp, List<String> finalizers, String generateName, Integer generation, String kind, Map<String, Object> labels, List<ManagedFieldsEntry> managedFields, String name, String namespace, List<OwnerReference> ownerReferences, String resourceVersion, String selfLink, String timestamp, String uid, Duration window) {
        this.annotations = annotations;
        this.apiVersion = apiVersion;
        this.containers = containers;
        this.creationTimestamp = creationTimestamp;
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
        this.deletionTimestamp = deletionTimestamp;
        this.finalizers = finalizers;
        this.generateName = generateName;
        this.generation = generation;
        this.kind = kind;
        this.labels = labels;
        this.managedFields = managedFields;
        this.name = name;
        this.namespace = namespace;
        this.ownerReferences = ownerReferences;
        this.resourceVersion = resourceVersion;
        this.selfLink = selfLink;
        this.timestamp = timestamp;
        this.uid = uid;
        this.window = window;
    }

    public Map<String, Object> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Map<String, Object> annotations) {
        this.annotations = annotations;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public List<ContainerMetrics> getContainers() {
        return containers;
    }

    public void setContainers(List<ContainerMetrics> containers) {
        this.containers = containers;
    }

    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public Integer getDeletionGracePeriodSeconds() {
        return deletionGracePeriodSeconds;
    }

    public void setDeletionGracePeriodSeconds(Integer deletionGracePeriodSeconds) {
        this.deletionGracePeriodSeconds = deletionGracePeriodSeconds;
    }

    public String getDeletionTimestamp() {
        return deletionTimestamp;
    }

    public void setDeletionTimestamp(String deletionTimestamp) {
        this.deletionTimestamp = deletionTimestamp;
    }

    public List<String> getFinalizers() {
        return finalizers;
    }

    public void setFinalizers(List<String> finalizers) {
        this.finalizers = finalizers;
    }

    public String getGenerateName() {
        return generateName;
    }

    public void setGenerateName(String generateName) {
        this.generateName = generateName;
    }

    public Integer getGeneration() {
        return generation;
    }

    public void setGeneration(Integer generation) {
        this.generation = generation;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Map<String, Object> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, Object> labels) {
        this.labels = labels;
    }

    public List<ManagedFieldsEntry> getManagedFields() {
        return managedFields;
    }

    public void setManagedFields(List<ManagedFieldsEntry> managedFields) {
        this.managedFields = managedFields;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public List<OwnerReference> getOwnerReferences() {
        return ownerReferences;
    }

    public void setOwnerReferences(List<OwnerReference> ownerReferences) {
        this.ownerReferences = ownerReferences;
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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public Duration getWindow() {
        return window;
    }

    public void setWindow(Duration window) {
        this.window = window;
    }

}