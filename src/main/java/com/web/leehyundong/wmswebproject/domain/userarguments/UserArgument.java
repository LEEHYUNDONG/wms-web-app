package com.web.leehyundong.wmswebproject.domain.userarguments;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name="user_arguments")
public class UserArgument {
    @Id
    @Column(nullable = false)
    private String object_name;

    private String package_name;

    @Column(nullable = false)
    private String argument_name;

    @Column
    private Long object_id;


    @Column
    private String overload;

    @Column
    private Integer subprogram_id;

    @Column
    private Integer position;


    @Column
    private Long sequence;

    @Column
    private Integer data_level;

    @Column
    private String data_type;


    @Column
    private String defaulted;

    @Column
    private Long default_value;

    @Column
    private Integer default_length;

    @Column
    private String in_out;

    @Column

    private Integer data_length;



    @Column
    private Integer data_precision;

    @Column
    private Integer data_scale;

    @Column
    private Integer radix;

    @Column
    private String character_set_name;

    @Column
    private String type_owner;
    @Column
    private String type_name;
    @Column
    private String type_subname;
    @Column
    private String type_link;

//    @Column
//    private String type_object_type;

    @Column
    private String pls_type;

    @Column
    private Integer char_length;

    @Column
    private String char_used;

//    @Column
//    private Integer origin_con_id;


    @Builder
    public UserArgument(String object_name, String package_name, String argument_name) {
        this.object_name = object_name;
        this.package_name = package_name;
        this.argument_name = argument_name;
    }


    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name;
    }

    public String getPackage_name() {
        return package_name;
    }

    public void setPackage_name(String package_name) {
        this.package_name = package_name;
    }

    public String getArgument_name() {
        return argument_name;
    }

    public void setArgument_name(String argument_name) {
        this.argument_name = argument_name;
    }

    public Long getObject_id() {
        return object_id;
    }

    public void setObject_id(Long object_id) {
        this.object_id = object_id;
    }

    public String getOverload() {
        return overload;
    }

    public void setOverload(String overload) {
        this.overload = overload;
    }

    public Integer getSubprogram_id() {
        return subprogram_id;
    }

    public void setSubprogram_id(Integer subprogram_id) {
        this.subprogram_id = subprogram_id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public Integer getData_level() {
        return data_level;
    }

    public void setData_level(Integer data_level) {
        this.data_level = data_level;
    }

    public String getData_type() {
        return data_type;
    }

    public void setData_type(String data_type) {
        this.data_type = data_type;
    }

    public String getDefaulted() {
        return defaulted;
    }

    public void setDefaulted(String defaulted) {
        this.defaulted = defaulted;
    }

    public Long getDefault_value() {
        return default_value;
    }

    public void setDefault_value(Long default_value) {
        this.default_value = default_value;
    }

    public Integer getDefault_length() {
        return default_length;
    }

    public void setDefault_length(Integer default_length) {
        this.default_length = default_length;
    }

    public String getIn_out() {
        return in_out;
    }

    public void setIn_out(String in_out) {
        this.in_out = in_out;
    }

    public Integer getData_length() {
        return data_length;
    }

    public void setData_length(Integer data_length) {
        this.data_length = data_length;
    }

    public Integer getData_precision() {
        return data_precision;
    }

    public void setData_precision(Integer data_precision) {
        this.data_precision = data_precision;
    }

    public Integer getData_scale() {
        return data_scale;
    }

    public void setData_scale(Integer data_scale) {
        this.data_scale = data_scale;
    }

    public Integer getRadix() {
        return radix;
    }

    public void setRadix(Integer radix) {
        this.radix = radix;
    }

    public String getCharacter_set_name() {
        return character_set_name;
    }

    public void setCharacter_set_name(String character_set_name) {
        this.character_set_name = character_set_name;
    }

    public String getType_owner() {
        return type_owner;
    }

    public void setType_owner(String type_owner) {
        this.type_owner = type_owner;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getType_subname() {
        return type_subname;
    }

    public void setType_subname(String type_subname) {
        this.type_subname = type_subname;
    }

    public String getType_link() {
        return type_link;
    }

    public void setType_link(String type_link) {
        this.type_link = type_link;
    }

//    public String getType_object_type() {
//        return type_object_type;
//    }
//
//    public void setType_object_type(String type_object_type) {
//        this.type_object_type = type_object_type;
//    }

    public String getPls_type() {
        return pls_type;
    }

    public void setPls_type(String pls_type) {
        this.pls_type = pls_type;
    }

    public Integer getChar_length() {
        return char_length;
    }

    public void setChar_length(Integer char_length) {
        this.char_length = char_length;
    }

    public String getChar_used() {
        return char_used;
    }

    public void setChar_used(String char_used) {
        this.char_used = char_used;
    }

//    public Integer getOrigin_con_id() {
//        return origin_con_id;
//    }
//
//    public void setOrigin_con_id(Integer origin_con_id) {
//        this.origin_con_id = origin_con_id;
//    }
}
