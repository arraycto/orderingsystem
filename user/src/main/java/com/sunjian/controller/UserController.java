package com.sunjian.controller;

import com.sunjian.dao.UserDao;
import com.sunjian.entity.User;
import com.sunjian.entity.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sunjian
 * @date 2020/4/4 18:45
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/findAll/{page}/{limit}")
    public UserVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit){
        UserVO userVO = new UserVO();
        userVO.setCode(0);
        userVO.setMsg("");
        userVO.setCount(userDao.count());
        userVO.setData(userDao.findAll((page - 1)* limit, limit));
        return userVO;
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable("id") Integer id){
        return userDao.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user){
        userDao.save(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user){
        userDao.update(user);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        userDao.deleteById(id);
    }
}
