package com.dh.dp.class11_代理.v1;

import java.util.Random;

public class Tank implements Movable{
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        new Tank2().move();
    }
}

class Tank2 extends Tank{
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        super.move();
        long end = System.currentTimeMillis();
        System.out.println("坦克运行" + (end - start) / 1000.0 + "秒");
    }
}

interface Movable{
    void move();
}
