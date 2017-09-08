package com.example.davidburnett.recordshophomework;

/**
 * Created by davidburnett on 08/09/2017.
 */

public abstract class Instrument {


    private String colour;
    private String material;
    private Double buyPrice;
    private Double sellPrice;


    public  Instrument(String colour, String material, Double buyPrice, Double sellPrice) {
        this.colour = colour;
        this.material = material;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
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
}
