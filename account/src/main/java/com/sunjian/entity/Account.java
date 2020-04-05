package com.sunjian.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author sunjian
 * @date 2020/4/4 15:47
 */
@Data
public class Account {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date regiterdate;
    private String address;
}
