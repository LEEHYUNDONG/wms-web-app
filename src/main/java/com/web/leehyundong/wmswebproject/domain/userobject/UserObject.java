package com.web.leehyundong.wmswebproject.domain.userobject;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name="user_objects")
public class UserObject {

    @Id
    @Column(name = "OBJECT_NAME", length = 128)
    private String objectName;

    @Column(name = "SUBOBJECT_NAME", length = 128)
    private String subobjectName;

    @Column(name = "OBJECT_ID")
    private Long objectId;

    @Column(name = "DATA_OBJECT_ID")
    private Long dataObjectId;

    @Column(name = "OBJECT_TYPE", length = 23)
    private String objectType;

    @Column(name = "CREATED")
    private LocalDate created;

    @Column(name = "LAST_DDL_TIME")
    private LocalDate lastDdlTime;

    @Column(name = "TIMESTAMP", length = 19)
    private String timestamp;

    @Column(name = "STATUS", length = 7)
    private String status;

    @Column(name = "TEMPORARY", length = 1)
    private String temporary;

    @Column(name = "GENERATED", length = 1)
    private String generated;

    @Column(name = "SECONDARY", length = 1)
    private String secondary;

    @Column(name = "NAMESPACE")
    private Long namespace;

    @Column(name = "EDITION_NAME", length = 128)
    private String editionName;

    @Column(name = "SHARING", length = 18)
    private String sharing;

    @Column(name = "EDITIONABLE", length = 1)
    private String editionable;

    @Column(name = "ORACLE_MAINTAINED", length = 1)
    private String oracleMaintained;

    @Column(name = "APPLICATION", length = 1)
    private String application;

    @Column(name = "DEFAULT_COLLATION", length = 100)
    private String defaultCollation;

    @Column(name = "DUPLICATED", length = 1)
    private String duplicated;

    @Column(name = "SHARDED", length = 1)
    private String sharded;

    @Column(name = "IMPORTED_OBJECT", length = 1)
    private String importedObject;

    @Column(name = "CREATED_APPID")
    private Long createdAppid;

    @Column(name = "CREATED_VSNID")
    private Long createdVsnid;

    @Column(name = "MODIFIED_APPID")
    private Long modifiedAppid;

    @Column(name = "MODIFIED_VSNID")
    private Long modifiedVsnid;



    public UserObject(String objectType, String objectName){
        this.objectType = objectType;
        this.objectName = objectName;

    }
    public UserObject(String objectType, String objectName, String lastDdlTime){
        this.objectType = objectType;
        this.objectName = objectName;
        this.lastDdlTime = LocalDate.parse(lastDdlTime);
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getSubobjectName() {
        return subobjectName;
    }

    public void setSubobjectName(String subobjectName) {
        this.subobjectName = subobjectName;
    }

    public Long getObjectId() {
        return objectId;
    }

    public void setObjectId(Long objectId) {
        this.objectId = objectId;
    }

    public Long getDataObjectId() {
        return dataObjectId;
    }

    public void setDataObjectId(Long dataObjectId) {
        this.dataObjectId = dataObjectId;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public LocalDate getLastDdlTime() {
        return lastDdlTime;
    }

    public void setLastDdlTime(LocalDate lastDdlTime) {
        this.lastDdlTime = lastDdlTime;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }

    public String getGenerated() {
        return generated;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public Long getNamespace() {
        return namespace;
    }

    public void setNamespace(Long namespace) {
        this.namespace = namespace;
    }

    public String getEditionName() {
        return editionName;
    }

    public void setEditionName(String editionName) {
        this.editionName = editionName;
    }

    public String getSharing() {
        return sharing;
    }

    public void setSharing(String sharing) {
        this.sharing = sharing;
    }

    public String getEditionable() {
        return editionable;
    }

    public void setEditionable(String editionable) {
        this.editionable = editionable;
    }

    public String getOracleMaintained() {
        return oracleMaintained;
    }

    public void setOracleMaintained(String oracleMaintained) {
        this.oracleMaintained = oracleMaintained;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getDefaultCollation() {
        return defaultCollation;
    }

    public void setDefaultCollation(String defaultCollation) {
        this.defaultCollation = defaultCollation;
    }

    public String getDuplicated() {
        return duplicated;
    }

    public void setDuplicated(String duplicated) {
        this.duplicated = duplicated;
    }

    public String getSharded() {
        return sharded;
    }

    public void setSharded(String sharded) {
        this.sharded = sharded;
    }

    public String getImportedObject() {
        return importedObject;
    }

    public void setImportedObject(String importedObject) {
        this.importedObject = importedObject;
    }

    public Long getCreatedAppid() {
        return createdAppid;
    }

    public void setCreatedAppid(Long createdAppid) {
        this.createdAppid = createdAppid;
    }

    public Long getCreatedVsnid() {
        return createdVsnid;
    }

    public void setCreatedVsnid(Long createdVsnid) {
        this.createdVsnid = createdVsnid;
    }

    public Long getModifiedAppid() {
        return modifiedAppid;
    }

    public void setModifiedAppid(Long modifiedAppid) {
        this.modifiedAppid = modifiedAppid;
    }

    public Long getModifiedVsnid() {
        return modifiedVsnid;
    }

    public void setModifiedVsnid(Long modifiedVsnid) {
        this.modifiedVsnid = modifiedVsnid;
    }
}
