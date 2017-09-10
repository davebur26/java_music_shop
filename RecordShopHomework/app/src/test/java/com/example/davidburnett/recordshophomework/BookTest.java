package com.example.davidburnett.recordshophomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by davidburnett on 09/09/2017.
 */
public class BookTest {

    Book book;

    @Before
        public void before(){
        book = new Book ("classical", 20.00, 30.00);

    }

    @Test
    public void testBookInfo(){
        assertEquals("classical", book.getName());
        assertEquals(20.00, book.getBuyPrice(), 1e-6);
        assertEquals(30.00, book.getSellPrice(), 1e-6);
    }

    @Test
    public void testBookMarkUp(){
        assertEquals(1.5, book.markUp(),1e-6);
    }



}