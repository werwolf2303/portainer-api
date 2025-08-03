package eu.icole.portainer.dtos.portainer;


public class LDAPSearchSettings {

    private String BaseDN;
    private String Filter;
    private String UserNameAttribute;

    public LDAPSearchSettings() {
    }

    public LDAPSearchSettings(String BaseDN, String Filter, String UserNameAttribute) {
        this.BaseDN = BaseDN;
        this.Filter = Filter;
        this.UserNameAttribute = UserNameAttribute;
    }

    public String getBaseDN() {
        return BaseDN;
    }

    public void setBaseDN(String BaseDN) {
        this.BaseDN = BaseDN;
    }

    public String getFilter() {
        return Filter;
    }

    public void setFilter(String Filter) {
        this.Filter = Filter;
    }

    public String getUserNameAttribute() {
        return UserNameAttribute;
    }

    public void setUserNameAttribute(String UserNameAttribute) {
        this.UserNameAttribute = UserNameAttribute;
    }

}