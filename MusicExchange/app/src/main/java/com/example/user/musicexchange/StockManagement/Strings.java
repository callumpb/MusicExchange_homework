package com.example.user.musicexchange.StockManagement;

/**
 * Created by user on 03/11/2017.
 */

public class Strings extends Instruments {

    private String type;
    private int numberOfStrings;
//    private Strings[] numberOfStrings;

    public Strings(int cost, int retailPrice, int markup, String type) {
        super(cost, retailPrice, markup);

        this.type = type;
        this.numberOfStrings = numberOfStrings;
//        this.numberOfStrings = new Strings[6];
    }

    public String getType() {
        return this.type;
    }

//    public Strings[] getNumberOfStrings() {
    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }

    //sell method should probably be changed
    @Override
    public boolean sell() {
        return true;
    }

    @Override
    public String play() {
        return "guitar noise";
    }
}
