package eu.icole.portainer.dtos.v1;

import eu.icole.portainer.dtos.v1.FieldsV1;

public class ManagedFieldsEntry {

    private String apiVersion;
    private String fieldsType;
    private FieldsV1 fieldsV1;
    private String manager;
    private String operation;
    private String subresource;
    private String time;

    public ManagedFieldsEntry() {
    }

    public ManagedFieldsEntry(String apiVersion, String fieldsType, FieldsV1 fieldsV1, String manager, String operation, String subresource, String time) {
        this.apiVersion = apiVersion;
        this.fieldsType = fieldsType;
        this.fieldsV1 = fieldsV1;
        this.manager = manager;
        this.operation = operation;
        this.subresource = subresource;
        this.time = time;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getFieldsType() {
        return fieldsType;
    }

    public void setFieldsType(String fieldsType) {
        this.fieldsType = fieldsType;
    }

    public FieldsV1 getFieldsV1() {
        return fieldsV1;
    }

    public void setFieldsV1(FieldsV1 fieldsV1) {
        this.fieldsV1 = fieldsV1;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getSubresource() {
        return subresource;
    }

    public void setSubresource(String subresource) {
        this.subresource = subresource;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}