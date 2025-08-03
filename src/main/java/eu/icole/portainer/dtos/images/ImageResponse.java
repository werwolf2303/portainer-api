package eu.icole.portainer.dtos.images;

import java.util.List;

public class ImageResponse {

    private Integer created;
    private String id;
    private String nodeName;
    private Integer size;
    private List<String> tags;
    private Boolean used;

    public ImageResponse() {
    }

    public ImageResponse(Integer created, String id, String nodeName, Integer size, List<String> tags, Boolean used) {
        this.created = created;
        this.id = id;
        this.nodeName = nodeName;
        this.size = size;
        this.tags = tags;
        this.used = used;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

}