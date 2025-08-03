package eu.icole.portainer.dtos.gitops;


public class RepositoryFilePreviewPayload {

    private String password;
    private String reference;
    private String repository;
    private String targetFile;
    private Boolean tlsskipVerify;
    private String username;

    public RepositoryFilePreviewPayload() {
    }

    public RepositoryFilePreviewPayload(String password, String reference, String repository, String targetFile, Boolean tlsskipVerify, String username) {
        this.password = password;
        this.reference = reference;
        this.repository = repository;
        this.targetFile = targetFile;
        this.tlsskipVerify = tlsskipVerify;
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getTargetFile() {
        return targetFile;
    }

    public void setTargetFile(String targetFile) {
        this.targetFile = targetFile;
    }

    public Boolean getTlsskipVerify() {
        return tlsskipVerify;
    }

    public void setTlsskipVerify(Boolean tlsskipVerify) {
        this.tlsskipVerify = tlsskipVerify;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}