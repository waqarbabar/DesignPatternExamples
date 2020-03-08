package com.bridge;

public class FullScreenDisplay extends Display {

    public FullScreenDisplay(StoreItem storeItem) {
        super(storeItem);
    }

    @Override
    public String displayItem() {
        return "Displaying in FullScreen with the name : " + this.storeItem.getName() + " with the size: " + this.storeItem.getSize()
                + " with the image: " + this.storeItem.getPicture();
    }
}
