package com.bridge;

public abstract class Display {

    protected StoreItem storeItem;

    public Display(StoreItem storeItem) {
        this.storeItem = storeItem;
    }

    public abstract String displayItem();

}
