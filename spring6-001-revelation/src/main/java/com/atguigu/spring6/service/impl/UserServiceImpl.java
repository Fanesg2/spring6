package com.atguigu.spring6.service.impl;

import com.atguigu.spring6.dao.UserDao;
import com.atguigu.spring6.dao.impl.UserDaoImplForMySQL;
import com.atguigu.spring6.dao.impl.UserDaoImplOracle;
import com.atguigu.spring6.service.UserService;

public class UserServiceImpl implements UserService {

    //    private UserDao userDao = new UserDaoImplForMySQL();
    private UserDao userDao = new UserDaoImplOracle();

    @Override
    public void queryUserByUsernameAndPassword(String username, String password) {

        userDao.selectUserByUsernameAndPassword(username, password);
    }
}
