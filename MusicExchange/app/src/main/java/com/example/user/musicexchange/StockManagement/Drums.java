package com.example.user.musicexchange.StockManagement;

/**
 * Created by user on 03/11/2017.
 */

public class Drums extends Instruments {

    private String type;
    private int numberOfDrums;
//    private Drums[] numberOfDrums;

    public Drums(int cost, int retailPrice, int markup, String type) {
        super(cost, retailPrice, markup);

        this.type = type;
        this.numberOfDrums = numberOfDrums;
//      this.numberOfDrums = new Drums[5];

    }

    public String getType() {
        return this.type;
    }

//    public Drums[] getNumberOfDrums() {
    public int getNumberOfDrums() {
        return this.numberOfDrums;
    }

    //sell method should probably be changed
    @Override
    public boolean sell() {
        return true;
    }

    @Override
    public String play() {
        return "drum noise";
    }

}
