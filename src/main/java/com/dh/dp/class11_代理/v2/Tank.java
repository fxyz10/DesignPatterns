package com.dh.dp.class11_代理.v2;

import java.util.Random;

public class Tank implements Movable {
    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        new TankProxy(new Tank()).move();
    }
}

class TankProxy implements Movable{
    Tank tank;
    public TankProxy(Tank tank) {
        this.tank = tank;
    }
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        tank.move();
        long end = System.currentTimeMillis();
        System.out.println("坦克运行" + (end - start) / 1000.0 + "秒");
    }
}

interface Movable{
    void move();
}
