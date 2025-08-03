package eu.icole.portainer.dtos.containers;


public class ContainerGpusResponse {

    private String gpus;

    public ContainerGpusResponse() {
    }

    public ContainerGpusResponse(String gpus) {
        this.gpus = gpus;
    }

    public String getGpus() {
        return gpus;
    }

    public void setGpus(String gpus) {
        this.gpus = gpus;
    }

}