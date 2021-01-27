package com.dh.dp.class12_迭代器.v1;

public class Main {
    public static void main(String[] args) {

        Collection_ l = new LinkedList_();
        for (int i = 0; i < 15; i ++) {
            l.add(i);
        }
        Iterator_ it = l.iterator();
        while (it.hasNext()) {
            Object o = it.next();
            System.out.println(o);
        }

    }
}
