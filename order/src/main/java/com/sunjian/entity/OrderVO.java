package com.sunjian.entity;

import lombok.Data;

import java.util.List;

/**
 * @author sunjian
 * @date 2020/4/4 21:59
 */
@Data
public class OrderVO {
    private int code;
    private String msg;
    private int count;
    private List<Order> data;
}
