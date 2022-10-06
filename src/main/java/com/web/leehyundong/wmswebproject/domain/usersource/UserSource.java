package com.web.leehyundong.wmswebproject.domain.usersource;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name="user_source")
@IdClass(UserSourceComposite.class)
public class UserSource implements Serializable {

    @Id
    @Column(name = "NAME", length = 128)
    private String name;

    @Column(name = "TYPE", length = 12)
    private String type;

    @Id
    @Column(name = "LINE")
    private Long line;

    @Id
    @Column(name = "TEXT", length = 4000)
    private String text;

    @Column(name = "ORIGIN_CON_ID")
    private Long originConId;

    @Builder
    public UserSource(String name, Long line, String text) {
        this.name = name;
        this.line = line;
        this.text = text;
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

    public Long getLine() {
        return line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getOriginConId() {
        return originConId;
    }

    public void setOriginConId(Long originConId) {
        this.originConId = originConId;
    }
}
