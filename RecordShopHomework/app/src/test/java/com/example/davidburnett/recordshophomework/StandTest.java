package com.example.davidburnett.recordshophomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 09/09/2017.
 */
public class StandTest {

    Stand stand;

    @Before
    public void before(){
        stand = new Stand("Tall stand", 12.50, 23.80);
    }

    @Test
    public void testStandInfo(){
        assertEquals("Tall stand", stand.getName());
        assertEquals(12.50, stand.getBuyPrice(), 1e-6);
        assertEquals(23.80, stand.getSellPrice(), 1e-6);
    }

    @Test
    public void testStandMarkUp(){
        assertEquals(1.904, stand.markUp(), 1e-6);
    }

}