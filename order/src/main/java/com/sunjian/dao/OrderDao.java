package com.sunjian.dao;

import com.sunjian.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.aspectj.weaver.ast.Or;

import java.util.List;

/**
 * @author sunjian
 * @date 2020/4/4 19:07
 */
@Mapper
public interface OrderDao {

    @Select("select o.id oid, o.date, o.state, u.id uid, u.nickname nickname, u.gender gender, u.telephone telephone, u.registerdate registerdate, u.address address,\n" +
            "m.id mid, m.name, m.price, m.flavor, a.id aid, a.username\n" +
            "from t_order o, t_admin a, t_menu m, t_user u where a.id = o.aid and m.id = o.mid and u.id = o.uid;")
    public List<Order> findAllByUid(Integer uid, int index, int limit);

    public void save(Order order);

    public int countByUid(Integer uid);

    public void deleteByMid(Integer mid);

    public void deleteByUid(Integer uid);

    public List<Order> findAllByState(int state, int index, int limit);

    public int countByState(int state);

    public void updateState(Integer id, Integer aid, Integer state);


}
