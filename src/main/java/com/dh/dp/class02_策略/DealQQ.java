package com.dh.dp.class02_策略;

public class DealQQ implements DealStrategy {
    @Override
    public void dealMethod(String option) {
        System.out.println("QQ");
    }
}
