package com.web.leehyundong.wmswebproject.domain.userdependencies;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="user_dependencies")
public class UserDependency {

    @Id
    @Column(name = "NAME", nullable = false, length = 128)
    private String name;

    @Column(name = "TYPE", length = 19)
    private String type;


    @Column(name = "REFERENCED_OWNER", length = 128)
    private String referenced_owner;


    @Column(name = "REFERENCED_NAME", length = 128)
    private String referenced_name;

    @Column(name = "REFERENCED_TYPE", length = 19)
    private String referencedType;

    @Column(name = "REFERENCED_LINK_NAME", length = 128)
    private String referencedLinkName;

    @Column(name = "SCHEMAID")
    private Long schemaid;

    @Column(name = "DEPENDENCY_TYPE", length = 4)
    private String dependencyType;


    public UserDependency(String name, String referenced_owner, String referenced_name, String type){
        this.name = name;
        this.referenced_owner = referenced_owner;
        this.referenced_name = referenced_name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReferenced_owner() {
        return referenced_owner;
    }

    public void setReferenced_owner(String referenced_owner) {
        this.referenced_owner = referenced_owner;
    }

    public String getReferenced_name() {
        return referenced_name;
    }

    public void setReferenced_name(String referenced_name) {
        this.referenced_name = referenced_name;
    }

    public String getReferencedType() {
        return referencedType;
    }

    public void setReferencedType(String referencedType) {
        this.referencedType = referencedType;
    }

    public String getReferencedLinkName() {
        return referencedLinkName;
    }

    public void setReferencedLinkName(String referencedLinkName) {
        this.referencedLinkName = referencedLinkName;
    }

    public Long getSchemaid() {
        return schemaid;
    }

    public void setSchemaid(Long schemaid) {
        this.schemaid = schemaid;
    }

    public String getDependencyType() {
        return dependencyType;
    }

    public void setDependencyType(String dependencyType) {
        this.dependencyType = dependencyType;
    }
}
