package com.bridge;

public class Book implements StoreItem{
    @Override
    public String getName() {
        return "Book";
    }

    @Override
    public String getSize() {
        return "book size";
    }

    @Override
    public Byte[] getPicture() {
        return new Byte[0];
    }
}
