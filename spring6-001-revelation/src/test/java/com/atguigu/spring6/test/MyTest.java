package com.atguigu.spring6.test;

import com.atguigu.spring6.controller.UserController;
import org.junit.Test;

public class MyTest {

    @Test
    public void test() {

        UserController userController = new UserController();

        userController.login("hello", "");

    }
}
