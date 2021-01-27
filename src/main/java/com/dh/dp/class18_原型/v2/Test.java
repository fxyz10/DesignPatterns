package com.dh.dp.class18_原型.v2;


/**
 * 深克隆
 * String指向常量池 不需要深克隆
 * StringBuilder需要深克隆
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person();
        Person p2 = (Person) p1.clone();
        System.out.println(p2.name + "  " + p2.age);
        System.out.println(p2.loc);

        System.out.println(p1 == p2);           // false
        System.out.println(p1.loc == p2.loc);   // false
        p1.loc.street = "bj";
        System.out.println(p2.loc.street);      // sh

        p1.loc.street.replace("bj", "sh");
        System.out.println(p1.loc.street);      // bj
        System.out.println(p2.loc.street);      // sh

        System.out.println(new StringBuilder("123").reverse());
    }

}

class Person implements Cloneable {
    String name = "zhangsan";
    int age = 20;
    Location loc = new Location("sh", 20);

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        p.loc = (Location) loc.clone();
        return p;
    }
}

class Location implements Cloneable {
    String street;
    // StringBuffer street;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
