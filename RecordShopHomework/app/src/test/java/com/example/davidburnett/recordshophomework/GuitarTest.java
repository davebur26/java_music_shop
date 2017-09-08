package com.example.davidburnett.recordshophomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 08/09/2017.
 */
public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("Red","Pine",200.00,300.00, 6 );
    }

    @Test
    public void guitarHasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarDetails(){
        assertEquals("Red",guitar.getColour());
        assertEquals("Pine",guitar.getMaterial());
        assertEquals(200.00, guitar.getBuyPrice(), 1e-6);
        assertEquals(300.00, guitar.getSellPrice(), 1e-6);


    }

}