package com.dh.dp.class21_状态.v1;

public class MM {
    String name;
    MMState state = new MMHappyState();

    public void smile() {
        state.smile();
    }

    public void cry() {
        state.cry();
    }

    public void say() {
        state.say();
    }
}
