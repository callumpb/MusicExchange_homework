package com.example.user.musicexchange.StockManagement;

/**
 * Created by user on 03/11/2017.
 */

public class Misc extends Stock {

    private String type;

    public Misc(int cost, int retailPrice, int markup) {
        super(cost, retailPrice, markup);

        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public boolean sell() {
        return false;
    }
}
