package com.sunjian.controller;

import com.sunjian.dao.MenuDao;
import com.sunjian.dao.TypeDao;
import com.sunjian.entity.Menu;
import com.sunjian.entity.MenuVO;
import com.sunjian.entity.Type;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author sunjian
 * @date 2020/4/4 17:39
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    private MenuDao menuDao;

    @Autowired
    private TypeDao typeDao;

    @GetMapping("/findAll/{page}/{limit}")
    public MenuVO findAll(@PathVariable("page") int page, @PathVariable("limit") int limit){
        MenuVO menuVO = new MenuVO();
        menuVO.setCode(0);
        menuVO.setMsg("");
        menuVO.setCount(menuDao.count());
        menuVO.setData(menuDao.findAll((page - 1)*limit, limit));
        return menuVO;
    }

    @GetMapping("/findAll")
    public List<Type> findAll(){
        return typeDao.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody Menu menu){
        menuDao.save(menu);
    }

    @GetMapping("/findById/{id}")
    public Menu findById(@PathVariable("id") Integer id){
        return menuDao.findById(id);
    }

    @PutMapping("/update")
    public void update(@RequestBody Menu menu){
        menuDao.update(menu);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Integer id){
        menuDao.deleteById(id);
    }
}
