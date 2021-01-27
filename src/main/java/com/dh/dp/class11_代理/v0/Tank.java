package com.dh.dp.class11_代理.v0;

import java.util.Random;

public class Tank implements Movable{

    @Override
    public void move() {
        long start = System.currentTimeMillis();
        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        long end = System.currentTimeMillis();
        System.out.println("坦克运行" + (end - start) / 1000.0 + "秒");
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

interface Movable{
    void move();
}
