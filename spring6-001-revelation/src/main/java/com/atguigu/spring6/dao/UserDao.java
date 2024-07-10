package com.atguigu.spring6.dao;

public interface UserDao {

    void selectUserByUsernameAndPassword(String username, String password);
}
