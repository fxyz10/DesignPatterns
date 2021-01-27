package com.dh.dp.class02_策略;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void shareOptions(String type, List<DealContext> list) {
        for (DealContext dealContext : list) {
            DealStrategy dealStrategy = dealContext.getDeal();
            dealStrategy.dealMethod(type);
        }
    }

    public static void main(String[] args) {
        List<DealContext> list = new ArrayList<>();
        list.add(new DealContext("sina", new DealSina()));
        list.add(new DealContext("qq", new DealQQ()));
        list.add(new DealContext("wechat", new DealWechat()));
        shareOptions("sina", list);
        System.out.println("========");
        shareOptions("qq", list);
        System.out.println("========");
        shareOptions("wechat", list);
    }
}
