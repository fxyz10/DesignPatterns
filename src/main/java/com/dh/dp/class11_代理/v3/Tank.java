package com.dh.dp.class11_代理.v3;

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
//        Tank t = new Tank();
//        TankTimeProxy ttp = new TankTimeProxy(t);
//        TankLogProxy tlp = new TankLogProxy(ttp);
//        tlp.move();

        new TankLogProxy(new TankTimeProxy(new Tank())).move();
    }
}

class TankTimeProxy implements Movable{
    Movable m;
    public TankTimeProxy(Movable m) {
        this.m = m;
    }
    @Override
    public void move() {
        long start = System.currentTimeMillis();
        m.move();
        long end = System.currentTimeMillis();
        System.out.println("坦克运行" + (end - start) / 1000.0 + "秒");
    }
}

class TankLogProxy implements Movable{
    Movable m;
    public TankLogProxy(Movable m) {
        this.m = m;
    }
    @Override
    public void move() {
        System.out.println("坦克开始运行");
        m.move();
        System.out.println("坦克结束运行");
    }
}

interface Movable{
    void move();
}
