package com.example.davidburnett.recordshophomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 09/09/2017.
 */
public class ShopTest {

    Shop shop;
    Guitar guitar;
    Guitar guitar2;
    Piano piano;
    Book book;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("Gibson","Blue","Oak",400.00,500.00, 6, InstrumentFamily.STRINGS);
        guitar2 = new Guitar("Fender","Red","Pine",350.00,400.00, 5, InstrumentFamily.STRINGS);
        piano = new Piano ("Grand", "White", "Steel", 1000.00, 2000.00, 235, InstrumentFamily.KEYBOARD);
        book = new Book ("classical", 20.00, 30.00);


    }

//    @Test
//    public void testssCatalgoueIsEmpty(){
//        assertEquals([],shop.getCatalogue());
//    }

    @Test
    public void testCatalogueContainsItems(){
        shop.addItemToCatalogue(guitar);
        assertEquals(1,shop.getCatalogue().size());
        shop.addItemToCatalogue(guitar2);
        assertEquals(2,shop.getCatalogue().size());
        assertEquals("Gibson",shop.getCatalogue().get(0).getName());
        assertEquals("Fender",shop.getCatalogue().get(1).getName());
        shop.removeItemFromCatalogue("Gibson");
        assertEquals(1,shop.getCatalogue().size());
        shop.addItemToCatalogue(piano);
        shop.addItemToCatalogue(book);
        assertEquals(3,shop.getCatalogue().size());
        shop.removeItemFromCatalogue("classical");
        assertEquals(2,shop.getCatalogue().size());



    }

    @Test
    public void testTotalCatalogueProfit(){
        shop.addItemToCatalogue(guitar);
        shop.addItemToCatalogue(guitar2);
        shop.addItemToCatalogue(piano);
        shop.addItemToCatalogue(book);
        assertEquals(1160.00,shop.calculateProfitFromCatalogue(), 1e-6);
    }



}