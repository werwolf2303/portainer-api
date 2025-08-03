package eu.icole.portainer.dtos.filesystem;


public class DirEntry {

    private String content;
    private Boolean isFile;
    private String name;
    private Integer permissions;

    public DirEntry() {
    }

    public DirEntry(String content, Boolean isFile, String name, Integer permissions) {
        this.content = content;
        this.isFile = isFile;
        this.name = name;
        this.permissions = permissions;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIsFile() {
        return isFile;
    }

    public void setIsFile(Boolean isFile) {
        this.isFile = isFile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPermissions() {
        return permissions;
    }

    public void setPermissions(Integer permissions) {
        this.permissions = permissions;
    }

}