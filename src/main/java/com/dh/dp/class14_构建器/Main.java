package com.dh.dp.class14_构建器;

public class Main {
    public static void main(String[] args) {
        Person p = new Person.PersonBuilder()
                .basicInfo(1, "dh", 28)
//                .score(5)
//                .weight(70)
                .loc("street", "209")
                .build();
        System.out.println(p.toString());
    }
}
