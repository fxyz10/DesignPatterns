package com.dh.dp.class01_单例;

public class Dcl {
    private static volatile Dcl dcl;

    public Dcl() {
    }

    public static Dcl getInstance() {
        if (dcl == null) {
            synchronized (Dcl.class) {
                if (dcl == null) {
                    dcl = new Dcl();
                }
            }
        }
        return dcl;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i ++) {
            new Thread(() -> System.out.println(Dcl.getInstance().hashCode())).start();
        }
    }
}
