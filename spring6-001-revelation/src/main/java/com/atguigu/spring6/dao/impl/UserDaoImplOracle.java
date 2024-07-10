package com.atguigu.spring6.dao.impl;

import com.atguigu.spring6.dao.UserDao;

public class UserDaoImplOracle implements UserDao {
    @Override
    public void selectUserByUsernameAndPassword(String username, String password) {
        System.out.println("正在连接Oracle数据库*******");
        System.out.println("正在查询用户数据中*****");
    }
}
