package eu.icole.portainer.dtos.ldap;

import eu.icole.portainer.dtos.portainer.LDAPSettings;

public class CheckPayload {

    private LDAPSettings ldapsettings;

    public CheckPayload() {
    }

    public CheckPayload(LDAPSettings ldapsettings) {
        this.ldapsettings = ldapsettings;
    }

    public LDAPSettings getLdapsettings() {
        return ldapsettings;
    }

    public void setLdapsettings(LDAPSettings ldapsettings) {
        this.ldapsettings = ldapsettings;
    }

}