package com.dh.dp.class02_策略;

public class DealWechat implements DealStrategy {
    @Override
    public void dealMethod(String option) {
        System.out.println("微信");
    }
}
