package com.sunjian.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author sunjian
 * @date 2020/4/4 17:56
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String nickname;
    private String gender;
    private String telephone;
    private Date registerdate;
    private String address;
}
