package com.bridge;

public class Chocolate implements StoreItem {
    @Override
    public String getName() {
        return "Chocolate";
    }

    @Override
    public String getSize() {
        return "chocolate size";
    }

    @Override
    public Byte[] getPicture() {
        return new Byte[0];
    }
}
