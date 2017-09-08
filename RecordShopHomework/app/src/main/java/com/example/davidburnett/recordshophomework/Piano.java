package com.example.davidburnett.recordshophomework;

/**
 * Created by davidburnett on 08/09/2017.
 */

public class Piano extends Instrument{
    private int numberOfKeys;

    public Piano(String colour, String material, Double buyPrice, Double sellPrice, int numberOfKeys){
        super(colour, material, buyPrice, sellPrice);
        this.numberOfKeys = numberOfKeys;
    }


    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
