package com.web.leehyundong.wmswebproject.domain.usersource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSourceComposite implements Serializable {
    private String name;
    private Long line;
    private String text;
}
