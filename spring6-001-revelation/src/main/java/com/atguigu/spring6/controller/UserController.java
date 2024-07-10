package com.atguigu.spring6.controller;

import com.atguigu.spring6.service.UserService;
import com.atguigu.spring6.service.impl.UserServiceImpl;

public class UserController {

    private UserService userService = new UserServiceImpl();

    public void login(String username, String password) {

        userService.queryUserByUsernameAndPassword(username, password);
    }
}
