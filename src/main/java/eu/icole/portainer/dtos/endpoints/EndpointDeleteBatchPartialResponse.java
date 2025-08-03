package eu.icole.portainer.dtos.endpoints;

import java.util.List;

public class EndpointDeleteBatchPartialResponse {

    private List<Integer> deleted;
    private List<Integer> errors;

    public EndpointDeleteBatchPartialResponse() {
    }

    public EndpointDeleteBatchPartialResponse(List<Integer> deleted, List<Integer> errors) {
        this.deleted = deleted;
        this.errors = errors;
    }

    public List<Integer> getDeleted() {
        return deleted;
    }

    public void setDeleted(List<Integer> deleted) {
        this.deleted = deleted;
    }

    public List<Integer> getErrors() {
        return errors;
    }

    public void setErrors(List<Integer> errors) {
        this.errors = errors;
    }

}