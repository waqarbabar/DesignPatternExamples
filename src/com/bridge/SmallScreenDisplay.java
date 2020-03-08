package com.bridge;

public class SmallScreenDisplay extends Display {

    public SmallScreenDisplay(StoreItem storeItem) {
        super(storeItem);
    }

    @Override
    public String displayItem() {
        return "Displaying in small screen with the name : " + this.storeItem.getName() + " with the size: " + this.storeItem.getSize()
                + " with the image: " + this.storeItem.getPicture();
    }
}
