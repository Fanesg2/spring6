package com.atguigu.spring6.dao.impl;

import com.atguigu.spring6.dao.UserDao;

public class UserDaoImplForMySQL implements UserDao {
    @Override
    public void selectUserByUsernameAndPassword(String username, String password) {

        System.out.println("正在连接Mysql......");
        System.out.println("正在通过查询用户名和密码来查询用户中******");
    }
}
