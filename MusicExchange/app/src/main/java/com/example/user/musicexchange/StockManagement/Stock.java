package com.example.user.musicexchange.StockManagement;

import com.example.user.musicexchange.behaviours.Sellable;

/**
 * Created by user on 03/11/2017.
 */

public abstract class Stock implements Sellable {

    private int cost;
    private int retailPrice;
    private int markup;

    public Stock(int cost, int retailPrice, int markup) {
        this.cost = cost;
        this.retailPrice = retailPrice;
        this.markup = markup;
    }

    public int getCost() {
        return this.cost;
    }

    public int getRetailPrice() {
        return this.retailPrice;
    }

    public int getMarkup() {
        return this.markup;
    }

    public int getMarkup(int markup) {
        this.markup = this.retailPrice -= this.cost;
        return this.markup;
    }
}
