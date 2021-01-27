package com.dh.dp.class17_命令;

public class Main {
    public static void main(String[] args) {
        Content c = new Content();
        Command ic = new InsertCommand(c);
        ic.doit();
        ic.undo();
        System.out.println(c.msg);
    }
}
