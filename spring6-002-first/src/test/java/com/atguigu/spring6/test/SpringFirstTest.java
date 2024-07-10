package com.atguigu.spring6.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFirstTest {

    @Test
    public void test() {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

        Object bean = applicationContext.getBean("userBean");
        System.out.println(bean);

        Object dao = applicationContext.getBean("dao");
        System.out.println(dao);
    }
}
