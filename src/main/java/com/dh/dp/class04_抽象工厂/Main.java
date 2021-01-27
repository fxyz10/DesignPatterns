package com.dh.dp.class04_抽象工厂;

public class Main {
    public static void main(String[] args) {
        Oem f = new Fushikang();
        Phone p = f.createPhone();
        Notebook n = f.createNotebook();
        Computer c = f.createComputer();
        p.call();
        n.work();
        c.game();

    }
}
