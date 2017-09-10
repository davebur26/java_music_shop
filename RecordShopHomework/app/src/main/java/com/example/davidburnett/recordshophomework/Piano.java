package com.example.davidburnett.recordshophomework;

/**
 * Created by davidburnett on 08/09/2017.
 */

public class Piano extends Instrument implements Playable, Sellable{
    private int numberOfKeys;

    public Piano(String name, String colour, String material, Double buyPrice, Double sellPrice, int numberOfKeys, InstrumentFamily family){
        super(name, colour, material, buyPrice, sellPrice, family);
        this.numberOfKeys = numberOfKeys;
    }


    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public String play(){
        return "pia pia piano";
    }

}
