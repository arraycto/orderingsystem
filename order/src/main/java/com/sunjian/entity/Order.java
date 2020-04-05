package com.sunjian.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author sunjian
 * @date 2020/4/4 19:00
 */
@Data
public class Order {
    private Integer id;

    private Menu menu;
    private Admin admin;
    private User user;
    private Date date;
    private Integer state;
}
