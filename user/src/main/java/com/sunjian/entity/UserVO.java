package com.sunjian.entity;

import lombok.Data;

import java.util.List;

/**
 * @author sunjian
 * @date 2020/4/4 21:47
 */
@Data
public class UserVO {
    private int code;
    private String msg;
    private int count;
    private List<User> data;
}
