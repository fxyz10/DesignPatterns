package com.dh.dp.class16_桥接;

public class Main {
    public static void main(String[] args) {
        Gift g = new WarmGift(new Book());
        System.out.println(g.impl.toString());
    }
}
