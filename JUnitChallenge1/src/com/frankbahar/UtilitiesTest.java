package com.frankbahar;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities utilities;

    @org.junit.Before
    public void setup(){
        utilities = new Utilities();
        System.out.println("Running a test...");
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] ca= {'h','e','l','l','o'};

        char[] expected ={'e','l'};
        assertArrayEquals(expected, utilities.everyNthChar(ca,2));
        assertArrayEquals(ca, utilities.everyNthChar(ca,6));
    }

    @org.junit.Test
    public void removePairs() {
        String actual= utilities.removePairs("AABCDDEFF");
        assertEquals("ABCDEF",actual);
        actual= utilities.removePairs("ABCABDEEF");
        assertEquals("This msg not correct" ,"ABCABDEF",actual);
        assertEquals("" ,"");
        actual= utilities.removePairs("AA");
        assertEquals("A",actual);
        assertNull("Did not get  null return argument passed null" ,utilities.removePairs(null));
        actual= utilities.removePairs("0");
        assertEquals("0",actual);
    }

    @org.junit.Test
    public void removePairs_new() {
        String actual= utilities.removePairs("ABCDEFF");
        assertEquals("ABCDEF",actual);
        actual= utilities.removePairs("AB88EFFG");
        assertEquals("AB8EFG",actual);
        actual= utilities.removePairs("112233445566");
        assertEquals("123456" ,actual);
        actual= utilities.removePairs("ZYZQQB");
        assertEquals("ZYZQB",actual);
        actual= utilities.removePairs("A");
        assertEquals("A",actual);
    }

    @org.junit.Test
    public void converter() {
        int result = utilities.converter(10,5);
        assertEquals(300,result);
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_arithmeticException() throws Exception{
        int result= utilities.converter(10,0);
    }

    @org.junit.Test
    public void nullifOddLength() {
        String myString = "Frankb";
        assertNotNull(myString,utilities.nullifOddLength(myString));
        String myString1 = "Frank";
        assertNull(utilities.nullifOddLength(myString1));
    }
}