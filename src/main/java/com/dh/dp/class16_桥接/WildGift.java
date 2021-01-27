package com.dh.dp.class16_桥接;

public class WildGift extends Gift {
    public WildGift(GiftImpl impl) {
        this.impl = impl;
    }
}
