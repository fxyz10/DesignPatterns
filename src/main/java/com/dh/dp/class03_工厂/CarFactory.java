package com.dh.dp.class03_工厂;

public class CarFactory {
    public Moveable createCar() {
        System.out.println("car create");
        return new Car();
    }
}
