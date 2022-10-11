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

//    @Column
//    private Long default_value;

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

    @Column
    private String type_object_type;

    @Column
    private String pls_type;

    @Column
    private Integer char_length;

    @Column
    private String char_used;

    @Column
    private Integer origin_con_id;


    @Builder
    public UserArgument(String object_name, String package_name, String argument_name) {
        this.object_name = object_name;
        this.package_name = package_name;
        this.argument_name = argument_name;
    }

}
