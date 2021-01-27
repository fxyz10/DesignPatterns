package com.dh.dp.class18_原型.v1;

/**
 * 浅克隆
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p2.name + "  " + p2.age);
        System.out.println(p2.loc);

        System.out.println(p1 == p2);           // false
        System.out.println(p1.loc == p2.loc);   // true
        p1.loc.street = "bj";
        System.out.println(p2.loc.street);
    }
}

class Person implements Cloneable {
    String name = "zhangsan";
    int age = 20;
    Location loc = new Location("sh", 20);

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Location {
    String street;
    int roomNo;

    public Location(String street, int roomNo) {
        this.street = street;
        this.roomNo = roomNo;
    }

    @Override
    public String toString() {
        return "Location{" +
                "street='" + street + '\'' +
                ", roomNo=" + roomNo +
                '}';
    }
}
