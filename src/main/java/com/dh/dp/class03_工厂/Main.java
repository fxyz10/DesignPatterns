package com.dh.dp.class03_工厂;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        Moveable m = new CarFactory().createCar();
        m.go();
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("1").add("2").add("3");
        System.out.println(sj.toString());
    }
}
