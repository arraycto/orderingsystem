package com.sunjian.dao;

import com.sunjian.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author sunjian
 * @date 2020/4/4 21:08
 */
@Mapper
public interface TypeDao {
    @Select("select * from t_type")
    public List<Type> findAll();
}
