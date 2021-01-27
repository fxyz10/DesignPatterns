package com.dh.dp.class12_迭代器.v2;

public class Main {
    public static void main(String[] args) {
        Collection_<String> l = new ArrayList_<>();
        //Collection_<String> l = new LinkedList_<>();
        for (int i = 0; i < 15; i ++) {
            l.add(i + "_s");
        }
        System.out.println(l.size());
        Iterator_<String> i = l.iterator();
        while (i.hasNext()) {
            String o = i.next();
            System.out.println(o);
        }
    }
}
