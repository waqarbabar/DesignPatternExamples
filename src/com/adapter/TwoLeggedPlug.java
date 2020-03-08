package com.adapter;

public class TwoLeggedPlug {

    private PlugAdapter plugAdapter;

    public TwoLeggedPlug (PlugAdapter plugAdapter){
        this.plugAdapter = plugAdapter;
    }

    public void dock () {
        this.plugAdapter.dockPlugIntoSocket();
    }

    public static void main(String[] args) {
        TwoLeggedPlug twoLeggedPlug = new TwoLeggedPlug(new TwoLeggedToThreeLeggedAdapter(new ThreeLeggedSocket()));
        twoLeggedPlug.dock();
    }

}
