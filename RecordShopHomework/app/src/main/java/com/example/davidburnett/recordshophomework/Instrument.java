package com.example.davidburnett.recordshophomework;

/**
 * Created by davidburnett on 08/09/2017.
 */

public abstract class Instrument {


    private String colour;
    private String material;
    private Double buyPrice;
    private Double sellPrice;
    private String name;
    private InstrumentFamily family;


    public  Instrument(String name, String colour, String material, Double buyPrice, Double sellPrice, InstrumentFamily family) {
        this.name = name;
        this.colour = colour;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public Double markUp(){
        return sellPrice / buyPrice;
    }

    public InstrumentFamily getFamily() {
        return family;
    }
}
