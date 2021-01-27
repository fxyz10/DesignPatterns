package com.dh.dp.class08_观察者;

import java.util.ArrayList;
import java.util.List;

class Child2{
    private boolean cry = false;
    private List<Observer2> l = new ArrayList();
    {
        l.add(new Dad2());
        l.add((event) -> {
            System.out.println("eee");
        });
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        cry = true;
        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);
        for (Observer2 o : l) {
            o.actionOnWakeUp(event);
        }
    }

}

abstract class Event<T>{
    abstract T getSource();
}

class WakeUpEvent extends Event<Child2>{
    long timestamp;
    String loc;
    Child2 child2;

    public WakeUpEvent(long timestamp, String loc, Child2 child2) {
        this.timestamp = timestamp;
        this.loc = loc;
        this.child2 = child2;
    }

    @Override
    Child2 getSource() {
        return child2;
    }
}

interface Observer2 {
    void actionOnWakeUp(WakeUpEvent event);
}

class Dad2 implements Observer2 {

    private void feed() {
        System.out.println("Dad feeding");
    }

    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }
}

public class Main02 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.wakeUp();
    }
}
