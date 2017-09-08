package com.example.davidburnett.recordshophomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 08/09/2017.
 */
public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano ( "White", "Steel", 1000.00, 2000.00, 235 );
    }

    @Test
    public void testNumberOfKeys(){
        assertEquals(235, piano.getNumberOfKeys());
    }

}