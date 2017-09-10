package com.example.davidburnett.recordshophomework;

/**
 * Created by davidburnett on 08/09/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable{
    private int numberOfStrings;

    public Guitar(String name, String colour, String material, Double buyPrice, Double sellPrice, int numberOfStrings, InstrumentFamily family) {
        super(name, colour, material, buyPrice, sellPrice, family);
        this.numberOfStrings = numberOfStrings;
    }


    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {return "twang";}
}
