package com.example.davidburnett.recordshophomework;

/**
 * Created by davidburnett on 09/09/2017.
 */

public class Book implements Sellable {

    private String name;
    private Double buyPrice;
    private Double sellPrice;

    public Book(String name, Double buyPrice, Double sellPrice){
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getName() {
        return name;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public Double markUp(){
        Double markUp = sellPrice / buyPrice ;
        return markUp;
    }
}
