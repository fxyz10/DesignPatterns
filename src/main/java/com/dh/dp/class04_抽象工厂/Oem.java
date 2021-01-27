package com.dh.dp.class04_抽象工厂;

// 代工厂
public abstract class Oem {
    abstract Phone createPhone();
    abstract Notebook createNotebook();
    abstract Computer createComputer();
}
