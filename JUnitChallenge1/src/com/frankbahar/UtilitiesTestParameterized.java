package com.frankbahar;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class UtilitiesTestParameterized {
    private Utilities utilities;
    private String stringIn;
    private String stringOut;

    public UtilitiesTestParameterized(String stringIn, String stringOut) {
        this.stringIn = stringIn;
        this.stringOut = stringOut;
    }

    @org.junit.Before
    public void setup() {
        utilities = new Utilities();
        System.out.println("Running a test...");
    }

    @Parameterized.Parameters
    public static String [][] testConditions(){
        return (new String[][]{
                {"ABCDEFF",  "ABCDEF"},
                {"AB88EFFG", "AB8EFG"},
                {"112233445566", "123456"},
                {"ZYZQQB", "ZYZQB"},
                {"A","A"}
        });
    }

//    public static Collection<Object[]> testConditions(){
//        return Arrays.asList(new String[][]{
//                {"ABCDEFF",  "ABCDEF"},
//                {"AB88EFFG", "AB8EFG"},
//                {"112233445566", "123456"},
//                {"ZYZQQB", "ZYZQB"},
//                {"A","A"}
//        });
//    }
@Test
public void  removePairs() throws  Exception{
    String actual= utilities.removePairs(stringIn);
    assertEquals(stringOut,actual);
}


}
