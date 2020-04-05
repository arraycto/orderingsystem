package com.sunjian.controller;

import com.sunjian.dao.AdminDao;
import com.sunjian.dao.UserDao;
import com.sunjian.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjian
 * @date 2020/4/4 16:14
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AdminDao adminDao;

    @Autowired
    private UserDao userDao;

    @GetMapping("/login/{username}/{password}/{type}")
    public Account login(@PathVariable("username") String username, @PathVariable("password") String password, @PathVariable("type") String type){
        Account account = null;
        switch (type){
            case "admin":
                account = adminDao.login(username, password);
                break;
            case "user":
                account = userDao.login(username, password);
                break;
        }
        return account;
    }
}
