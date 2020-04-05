package com.sunjian.entity;

import lombok.Data;

/**
 * @author sunjian
 * @date 2020/4/4 17:35
 */
@Data
public class Menu {
    private Integer id;
    private String name;
    private Double price;
    private String flavor;
    private Type type;
}
