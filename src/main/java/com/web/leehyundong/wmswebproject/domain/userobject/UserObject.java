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
import java.time.LocalDateTime;

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
    private LocalDateTime lastDdlTime;

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

//    @Column(name = "EDITION_NAME", length = 128)
//    private String editionName;

//    @Column(name = "SHARING", length = 18)
//    private String sharing;

//    @Column(name = "EDITIONABLE", length = 1)
//    private String editionable;

//    @Column(name = "ORACLE_MAINTAINED", length = 1)
//    private String oracleMaintained;

//    @Column(name = "APPLICATION", length = 1)
//    private String application;

//    @Column(name = "DEFAULT_COLLATION", length = 100)
//    private String defaultCollation;

//    @Column(name = "DUPLICATED", length = 1)
//    private String duplicated;

//    @Column(name = "SHARDED", length = 1)
//    private String sharded;

//    @Column(name = "IMPORTED_OBJECT", length = 1)
//    private String importedObject;

//    @Column(name = "CREATED_APPID")
//    private Long createdAppid;

//    @Column(name = "CREATED_VSNID")
//    private Long createdVsnid;

//    @Column(name = "MODIFIED_APPID")
//    private Long modifiedAppid;

//    @Column(name = "MODIFIED_VSNID")
//    private Long modifiedVsnid;



    public UserObject(String objectType, String objectName){
        this.objectType = objectType;
        this.objectName = objectName;

    }
    public UserObject(String objectType, String objectName, String lastDdlTime){
        this.objectType = objectType;
        this.objectName = objectName;
        this.lastDdlTime = LocalDateTime.parse(lastDdlTime);
    }


}
