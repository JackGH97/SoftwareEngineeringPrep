package com.hawkins;

import static org.junit.Assert.*;

public class UtilitiesTest {
    Utilities util;
    @org.junit.Before
    public void setUp() throws Exception {
        util = new Utilities();
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] output = util.everyNthChar(new char[]{'h','e','l','l','o'},2);
        assertArrayEquals(new char[]{'e','l'},output );
        char[] output1 = util.everyNthChar(new char[]{'h','e','l','l','o'},6);
        assertArrayEquals(new char[]{'h','e','l','l','o'},output1 );
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF",util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF",util.removePairs("ABCCABDEEF"));
        assertEquals("A",util.removePairs("A"));
        assertEquals("",util.removePairs(""));
        assertNull(null,util.removePairs(null));
    }

    @org.junit.Test
    public void converter() throws Exception{
        assertEquals(300, util.converter(10,5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException(){
        util.converter(10,0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNotNull(util.nullIfOddLength("ab"));
        assertNull(util.nullIfOddLength("aba"));
    }
}