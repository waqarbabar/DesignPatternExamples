package com.bridge;

public class ThumbnailDisplay extends Display {

    public ThumbnailDisplay(StoreItem storeItem) {
        super(storeItem);
    }
    @Override
    public String displayItem() {
        return "Displaying in thumbnail with the name : " + this.storeItem.getName() + " with the size: " + this.storeItem.getSize()
                + " with the image: " + this.storeItem.getPicture();
    }
}
