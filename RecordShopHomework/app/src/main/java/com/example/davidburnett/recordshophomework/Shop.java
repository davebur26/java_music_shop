package com.example.davidburnett.recordshophomework;

import java.util.ArrayList;

/**
 * Created by davidburnett on 09/09/2017.
 */

public class Shop {
    private ArrayList<Sellable> catalogue;


    public Shop(){
        this.catalogue = new ArrayList<>();
    }

    public ArrayList<Sellable> getCatalogue() {
        return catalogue;
    }

    public void addItemToCatalogue(Sellable item){
        this.catalogue.add(item);

    }

    public void removeItemFromCatalogue(String itemToRemove){
        for(int i = this.catalogue.size() -1; i >= 0; i--){
            String currentItemName = this.catalogue.get(i).getName();
            System.out.println(currentItemName);
            if(currentItemName.equals(itemToRemove)) this.catalogue.remove(i);
        }

    }

    public Double calculateProfitFromCatalogue(){
        Double totalProfit = 0.00;
        for(int i = this.catalogue.size() -1; i >= 0; i--) {
            Double itemProfit = this.catalogue.get(i).getSellPrice() - this.getCatalogue().get(i).getBuyPrice();
            totalProfit = totalProfit + itemProfit;
        }
        return totalProfit;

    }

}
