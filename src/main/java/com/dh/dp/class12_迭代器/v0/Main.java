package com.dh.dp.class12_迭代器.v0;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        List<Integer> l = new Vector<>();
//        l.add(1);
//        l.add(3);
//        l.add(2);
//        Collections.sort(l);
//        System.out.println(l.toString());
        Collection_ l = new LinkedList_();
        for (int i = 0; i < 15; i ++) {
            l.add(i);
        }

    }
}
