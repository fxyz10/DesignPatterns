package com.dh.dp.class04_抽象工厂;

public class Fushikang extends Oem {
    @Override
    Phone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    Notebook createNotebook() {
        return new XiaomiNotebook();
    }

    @Override
    Computer createComputer() {
        return new XiaomiComputer();
    }
}
