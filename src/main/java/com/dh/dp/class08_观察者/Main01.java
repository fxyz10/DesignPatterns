package com.dh.dp.class08_观察者;

import java.util.ArrayList;
import java.util.List;

class Child{
    private boolean cry = false;
    private List<Observer> list = new ArrayList();
    {
        list.add(new Dad());
        list.add(new Mum());
        list.add(new Dog());
    }
    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        for (Observer o : list) {
            o.actionOnWakeUp();
        }
    }
}

interface Observer{
    void actionOnWakeUp();
}

class Dad implements Observer{

    private void feed() {
        System.out.println("Dad feeding");
    }
    public void actionOnWakeUp() {
        feed();
    }
}

class Mum implements Observer{

    private void hug() {
        System.out.println("Mum hugging");
    }
    public void actionOnWakeUp() {
        hug();
    }
}

class Dog implements Observer{

    private void wang() {
        System.out.println("Dog wang");
    }
    public void actionOnWakeUp() {
        wang();
    }
}

public class Main01 {

    public static void main(String[] args) {
        Child c = new Child();
        c.wakeUp();
    }
}
