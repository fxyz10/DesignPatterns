package com.dh.dp.class02_策略;

public class DealSina implements DealStrategy {
    @Override
    public void dealMethod(String option) {
        System.out.println("新浪");
    }
}
