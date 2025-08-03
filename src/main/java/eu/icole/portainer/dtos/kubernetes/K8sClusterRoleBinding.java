package eu.icole.portainer.dtos.kubernetes;

import eu.icole.portainer.dtos.v1.RoleRef;
import eu.icole.portainer.dtos.v1.Subject;

import java.util.List;

public class K8sClusterRoleBinding {

    private String creationDate;
    private Boolean isSystem;
    private String name;
    private String namespace;
    private RoleRef roleRef;
    private List<Subject> subjects;
    private String uid;

    public K8sClusterRoleBinding() {
    }

    public K8sClusterRoleBinding(String creationDate, Boolean isSystem, String name, String namespace, RoleRef roleRef, List<Subject> subjects, String uid) {
        this.creationDate = creationDate;
        this.isSystem = isSystem;
        this.name = name;
        this.namespace = namespace;
        this.roleRef = roleRef;
        this.subjects = subjects;
        this.uid = uid;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Boolean isSystem) {
        this.isSystem = isSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public RoleRef getRoleRef() {
        return roleRef;
    }

    public void setRoleRef(RoleRef roleRef) {
        this.roleRef = roleRef;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

}