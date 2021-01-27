package com.dh.dp.class11_代理.v6_spring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TimeProxy {
    @Before("execution(void com.dh.dp.class11_代理.v6_spring.v2.Tank.move())")
    public void before() {
        System.out.println("method start.." + System.currentTimeMillis());
    }

    @After("execution(void com.dh.dp.class11_代理.v6_spring.v2.Tank.move())")
    public void after() {
        System.out.println("method stop.." + System.currentTimeMillis());
    }
}
