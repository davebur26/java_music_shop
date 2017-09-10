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
        piano = new Piano ("Grand", "White", "Steel", 1000.00, 2000.00, 235 , InstrumentFamily.KEYBOARD);
    }

    @Test
    public void testNumberOfKeys(){
        assertEquals(235, piano.getNumberOfKeys());
    }

    @Test
    public void testPianoPlay(){
        assertEquals("pia pia piano", piano.play());
    }

}