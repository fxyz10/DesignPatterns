package com.dh.dp.class16_桥接;

public class WarmGift extends Gift {

    public WarmGift(GiftImpl impl) {
        this.impl = impl;
    }
}
