package com.example.user.musicexchange.StockManagement;

import com.example.user.musicexchange.behaviours.Playable;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Instruments extends Stock implements Playable {
    public Instruments(int cost, int retailPrice, int markup) {
        super(cost, retailPrice, markup);
    }

    //String type?
    public String Play() {
        return "noise";
    }
}
