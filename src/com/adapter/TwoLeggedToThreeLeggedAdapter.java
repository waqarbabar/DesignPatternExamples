package com.adapter;

public class TwoLeggedToThreeLeggedAdapter implements PlugAdapter {

    private ThreeLeggedSocket threeLeggedSocket;

    public TwoLeggedToThreeLeggedAdapter (ThreeLeggedSocket threeLeggedSocket){
        this.threeLeggedSocket = threeLeggedSocket;
    }

    @Override
    public void dockPlugIntoSocket() {
        System.out.println("changed two legged plug into three legged plug");
        this.threeLeggedSocket.acceptThreeLeggedPlug();
    }
}
