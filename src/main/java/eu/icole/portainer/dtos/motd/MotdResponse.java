package eu.icole.portainer.dtos.motd;

import java.util.List;
import java.util.Map;

public class MotdResponse {

    private Map<String, Object> ContentLayout;
    private List<Integer> Hash;
    private String Message;
    private String Style;
    private String Title;

    public MotdResponse() {
    }

    public MotdResponse(Map<String, Object> ContentLayout, List<Integer> Hash, String Message, String Style, String Title) {
        this.ContentLayout = ContentLayout;
        this.Hash = Hash;
        this.Message = Message;
        this.Style = Style;
        this.Title = Title;
    }

    public Map<String, Object> getContentLayout() {
        return ContentLayout;
    }

    public void setContentLayout(Map<String, Object> ContentLayout) {
        this.ContentLayout = ContentLayout;
    }

    public List<Integer> getHash() {
        return Hash;
    }

    public void setHash(List<Integer> Hash) {
        this.Hash = Hash;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String Message) {
        this.Message = Message;
    }

    public String getStyle() {
        return Style;
    }

    public void setStyle(String Style) {
        this.Style = Style;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

}