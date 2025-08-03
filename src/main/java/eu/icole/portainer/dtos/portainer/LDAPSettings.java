package eu.icole.portainer.dtos.portainer;

import eu.icole.portainer.dtos.portainer.LDAPGroupSearchSettings;
import eu.icole.portainer.dtos.portainer.LDAPSearchSettings;
import eu.icole.portainer.dtos.portainer.TLSConfiguration;

import java.util.List;

public class LDAPSettings {

    private Boolean AnonymousMode;
    private Boolean AutoCreateUsers;
    private List<LDAPGroupSearchSettings> GroupSearchSettings;
    private String Password;
    private String ReaderDN;
    private List<LDAPSearchSettings> SearchSettings;
    private Boolean StartTLS;
    private TLSConfiguration TLSConfig;
    private String URL;

    public LDAPSettings() {
    }

    public LDAPSettings(Boolean AnonymousMode, Boolean AutoCreateUsers, List<LDAPGroupSearchSettings> GroupSearchSettings, String Password, String ReaderDN, List<LDAPSearchSettings> SearchSettings, Boolean StartTLS, TLSConfiguration TLSConfig, String URL) {
        this.AnonymousMode = AnonymousMode;
        this.AutoCreateUsers = AutoCreateUsers;
        this.GroupSearchSettings = GroupSearchSettings;
        this.Password = Password;
        this.ReaderDN = ReaderDN;
        this.SearchSettings = SearchSettings;
        this.StartTLS = StartTLS;
        this.TLSConfig = TLSConfig;
        this.URL = URL;
    }

    public Boolean getAnonymousMode() {
        return AnonymousMode;
    }

    public void setAnonymousMode(Boolean AnonymousMode) {
        this.AnonymousMode = AnonymousMode;
    }

    public Boolean getAutoCreateUsers() {
        return AutoCreateUsers;
    }

    public void setAutoCreateUsers(Boolean AutoCreateUsers) {
        this.AutoCreateUsers = AutoCreateUsers;
    }

    public List<LDAPGroupSearchSettings> getGroupSearchSettings() {
        return GroupSearchSettings;
    }

    public void setGroupSearchSettings(List<LDAPGroupSearchSettings> GroupSearchSettings) {
        this.GroupSearchSettings = GroupSearchSettings;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getReaderDN() {
        return ReaderDN;
    }

    public void setReaderDN(String ReaderDN) {
        this.ReaderDN = ReaderDN;
    }

    public List<LDAPSearchSettings> getSearchSettings() {
        return SearchSettings;
    }

    public void setSearchSettings(List<LDAPSearchSettings> SearchSettings) {
        this.SearchSettings = SearchSettings;
    }

    public Boolean getStartTLS() {
        return StartTLS;
    }

    public void setStartTLS(Boolean StartTLS) {
        this.StartTLS = StartTLS;
    }

    public TLSConfiguration getTLSConfig() {
        return TLSConfig;
    }

    public void setTLSConfig(TLSConfiguration TLSConfig) {
        this.TLSConfig = TLSConfig;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

}