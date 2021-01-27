package com.dh.dp.class13_访问者;

public class Computer {
    ComputerPart cpu = new Cpu();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();
    public void accept(Visitor v) {
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }

    public static void main(String[] args) {
        PersonelVisitor pv = new PersonelVisitor();
        new Computer().accept(pv);
        System.out.println(pv.totalPrice);
        CorpVisitor cv = new CorpVisitor();
        new Computer().accept(cv);
        System.out.println(cv.totalPrice);
    }
}

abstract class ComputerPart {
    abstract void accept(Visitor v);
    abstract double getPrice();
}

class Cpu extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}

class Memory extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 300;
    }
}

class Board extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 200;
    }
}

interface Visitor {
    void visitCpu(Cpu cpu);
    void visitMemory(Memory memory);
    void visitBoard(Board board);
}

class PersonelVisitor implements Visitor {
    double totalPrice = 0.0;
    @Override
    public void visitCpu(Cpu cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.9;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.9;
    }
}

class CorpVisitor implements Visitor {
    double totalPrice = 0.0;
    @Override
    public void visitCpu(Cpu cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.8;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.8;
    }
}