package com.sunjian.dao;

import com.sunjian.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author sunjian
 * @date 2020/4/4 17:57
 */
@Mapper
public interface UserDao {
    @Select("select * from t_user order by id limit #{index}, #{limit}")
    public List<User> findAll(@Param("index") int index, @Param("limit") int limit);

    @Select("select count(*) from t_user")
    public int count();

    @Select("select * from t_user where id = #{id}")
    public User findById(@Param("id") Integer id);

    @Insert("insert into t_user(username, password, nickname, gender, telephone, registerdate, address)values(#{username}, #{password}, #{nickname}, #{gender}, #{telephone}, #{registerdate}, #{address})")
    public void save(User user);

    @Update("update t_user set username = #{username}, password = #{password}, nickname = #{nickname}, gender = #{gender}, telephone = #{telephone}, registerdate = #{registerdate}, address = #{address} where id = #{id}")
    public void update(User user);

    @Delete("delete from t_user where id = #{id}")
    public void deleteById(@Param("id") Integer id);
}
