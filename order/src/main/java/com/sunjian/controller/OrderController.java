package com.sunjian.controller;

import com.sunjian.dao.OrderDao;
import com.sunjian.entity.Order;
import com.sunjian.entity.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sunjian
 * @date 2020/4/4 19:12
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @Autowired
    private OrderDao orderDao;

    @PostMapping("/save")
    public void save(@RequestBody Order order) {
        orderDao.save(order);
    }

    @GetMapping("/findAllByUid/{uid}/{page}/{limit}")
    public OrderVO findAllByUid(@PathVariable("uid") Integer uid, @PathVariable("page") int page, @PathVariable("limit") int limit) {
        OrderVO orderVO = new OrderVO();
        orderVO.setCode(0);
        orderVO.setMsg("");
        orderVO.setCount(orderDao.countByUid(uid));
        orderVO.setData(orderDao.findAllByUid(uid, (page - 1) * limit, limit));
        return orderVO;
    }

    @DeleteMapping("/deleteByMid/{mid}")
    public void deleteByMid(@PathVariable("mid") Integer mid) {
        orderDao.deleteByMid(mid);
    }

    @DeleteMapping("/deleteByUid/{uid}")
    public void deleteByUid(@PathVariable("uid") Integer uid) {
        orderDao.deleteByUid(uid);
    }

    @GetMapping("/findAllByState/{state}/{page}/{limit}")
    public OrderVO findAllByState(@PathVariable("state") int state, @PathVariable("page") int page, @PathVariable("limit") int limit) {
        OrderVO orderVO = new OrderVO();
        orderVO.setCode(0);
        orderVO.setMsg("");
        orderVO.setCount(orderDao.countByState(0));
        orderVO.setData(orderDao.findAllByState(0, (page - 1) * limit, limit));
        return orderVO;
    }

    @PutMapping("/updateState/{id}/{state}/{aid}")
    public void updateState(@PathVariable("id") Integer id, @PathVariable("state") int state, @PathVariable("aid") Integer aid) {
        orderDao.updateState(id, aid, state);
    }
}
