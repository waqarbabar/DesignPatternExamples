package com.bridge;

public class BridgeDemo {

    public static void main(String[] args) {

        BridgeDemo demo = new BridgeDemo();

        Book book = new Book();
        Chair chair = new Chair();
        Chocolate chocolate = new Chocolate();

        demo.displayInAllFormats(book);
        demo.displayInAllFormats(chair);
        demo.displayInAllFormats(chocolate);
    }

    private void displayInAllFormats(StoreItem storeItem){
        FullScreenDisplay fullScreenDisplay = new FullScreenDisplay(storeItem);
        System.out.println(fullScreenDisplay.displayItem());
        SmallScreenDisplay smallScreenDisplay = new SmallScreenDisplay(storeItem);
        System.out.println(smallScreenDisplay.displayItem());
        ThumbnailDisplay thumbnailDisplay = new ThumbnailDisplay(storeItem);
        System.out.println(thumbnailDisplay.displayItem());
    }
}
