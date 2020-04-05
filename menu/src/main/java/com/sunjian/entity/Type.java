package com.sunjian.entity;

import lombok.Data;
import org.apache.ibatis.annotations.Insert;

/**
 * @author sunjian
 * @date 2020/4/4 21:10
 */
@Data
public class Type {
    private Integer id;
    private String name;
}
