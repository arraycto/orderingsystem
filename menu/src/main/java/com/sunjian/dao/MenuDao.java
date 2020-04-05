package com.sunjian.dao;

import com.sunjian.entity.Menu;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author sunjian
 * @date 2020/4/4 17:37
 */
@Mapper
public interface MenuDao {
    @Select("select m.id mid,m.name mname,m.price,m.flavor,t.id tid,t.name tname from t_menu m,t_type t where m.tid = t.id order by mid limit #{index}, #{limit}")
    public List<Menu> findAll(int index, int limit);

    @Select("select count(*) from t_menu")
    public int count();

    @Insert("insert into t_menu(name, price, flavor, tid)values(#{name}, #{price}, #{flavor}, #{type.id})")
    public void save(Menu menu);

    @Select("select id mid,name mname,price,flavor,tid from t_menu where id = #{id}")
    public Menu findById(Integer id);

    @Update("update menu set neme = #{name}, price = #{price}, flavor = #{flavor}, tid = #{type.id} where id = #{id}")
    public void update(Menu menu);

    @Delete("delete from t_menu where id = #{id}")
    public void deleteById(Integer id);
}
