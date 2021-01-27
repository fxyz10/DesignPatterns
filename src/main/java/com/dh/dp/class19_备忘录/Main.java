package com.dh.dp.class19_备忘录;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writePerson();
        readPerson();
    }

    public static void readPerson() throws IOException, ClassNotFoundException {
        File f = new File("D:\\conf\\p1");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person p = (Person) ois.readObject();
        System.out.println(p.toString());
        ois.close();
        fis.close();
    }

    public static void writePerson() throws IOException {
        Person p = new Person("zhangsan", 20);
        File f = new File("D:\\conf\\p1");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p);
        oos.close();
        fos.close();
    }

}

class Person implements Serializable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
