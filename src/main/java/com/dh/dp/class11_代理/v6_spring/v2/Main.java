package com.dh.dp.class11_代理.v6_spring.v2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app_auto.xml");
        Tank t = (Tank) context.getBean("tank");
        t.move();
    }
}
