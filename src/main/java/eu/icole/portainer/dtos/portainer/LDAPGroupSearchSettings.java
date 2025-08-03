package eu.icole.portainer.dtos.portainer;


public class LDAPGroupSearchSettings {

    private String GroupAttribute;
    private String GroupBaseDN;
    private String GroupFilter;

    public LDAPGroupSearchSettings() {
    }

    public LDAPGroupSearchSettings(String GroupAttribute, String GroupBaseDN, String GroupFilter) {
        this.GroupAttribute = GroupAttribute;
        this.GroupBaseDN = GroupBaseDN;
        this.GroupFilter = GroupFilter;
    }

    public String getGroupAttribute() {
        return GroupAttribute;
    }

    public void setGroupAttribute(String GroupAttribute) {
        this.GroupAttribute = GroupAttribute;
    }

    public String getGroupBaseDN() {
        return GroupBaseDN;
    }

    public void setGroupBaseDN(String GroupBaseDN) {
        this.GroupBaseDN = GroupBaseDN;
    }

    public String getGroupFilter() {
        return GroupFilter;
    }

    public void setGroupFilter(String GroupFilter) {
        this.GroupFilter = GroupFilter;
    }

}