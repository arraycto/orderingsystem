package com.sunjian.dao;

import com.sunjian.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author sunjian
 * @date 2020/4/4 16:07
 */
@Mapper
public interface AdminDao {
    @Select("select * from t_user where username = #{username} and password = #{password}")
    public Admin login(@Param("username") String username, @Param("password") String password);
}
