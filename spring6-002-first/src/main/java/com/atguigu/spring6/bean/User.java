package com.atguigu.spring6.bean;

public class User {
    @Override
    public String toString() {
        return "User{}";
    }

    //   我不是
    public void hello() {
        User user = new User();
        user.hello();
    }

}
