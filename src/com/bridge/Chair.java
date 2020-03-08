package com.bridge;

public class Chair implements StoreItem{
    @Override
    public String getName() {
        return "Chair";
    }

    @Override
    public String getSize() {
        return "3 * 1.25 * 1.25";
    }

    @Override
    public Byte[] getPicture() {
        return new Byte[0];
    }
}
