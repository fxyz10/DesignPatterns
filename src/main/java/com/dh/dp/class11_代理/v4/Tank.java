package com.dh.dp.class11_代理.v4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Random;

public class Tank implements Movable {
    @Override
    public void move() {
        System.out.println("tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        //System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        System.getProperties().put("jdk.ProxyGenerator.saveGeneratedFiles", "true");
        Tank t = new Tank();
        Movable m = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                new Class[]{Movable.class},
//                new InvocationHandler() {
//                    @Override
//                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                        System.out.println("method " + method.getName() + " start");
//                        Object o = method.invoke(t, args);
//                        System.out.println("method " + method.getName() + " end");
//                        return o;
//                    }
//                });
                new LogHandler(t));
        m.move();
    }
}

class LogHandler implements InvocationHandler{
    Tank t;
    public LogHandler(Tank t) {
        this.t = t;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method " + method.getName() + " start");
        Object o = method.invoke(t, args);
        System.out.println("method " + method.getName() + " end");
        return o;
    }
}

interface Movable{
    void move();
}