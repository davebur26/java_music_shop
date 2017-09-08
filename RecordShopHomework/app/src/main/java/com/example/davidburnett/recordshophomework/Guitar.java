package com.example.davidburnett.recordshophomework;

/**
 * Created by davidburnett on 08/09/2017.
 */

public class Guitar extends Instrument {
    private int numberOfStrings;

    public Guitar(String colour, String material, Double buyPrice, Double sellPrice, int numberOfStrings) {
        super(colour, material, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
