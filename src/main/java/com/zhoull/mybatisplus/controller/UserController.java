package com.zhoull.mybatisplus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zhoull.mybatisplus.common.utils.Query;
import com.zhoull.mybatisplus.entity.User;
import com.zhoull.mybatisplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author charlie
 * @since 2019-09-16
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserService userService;

    @RequestMapping(path = "/page", method = RequestMethod.POST)
    public IPage<User> selectPage(@RequestBody Map<String, Object> params){
         return userService.page(new Query<User>().getPage(params), new QueryWrapper<>());
    }

}
