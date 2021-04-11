package com.maximumtest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    private static MaximumNumber maximumNumber=new MaximumNumber();

    @Test
    public void givenMaximumNumberAtFirstPositionShouldReturnSameNumber() {
        Integer [] intArray = {10 , 9 , 3};
        Integer result = maximumNumber.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(10), result);
    }

    @Test
    public void givenMaximumNumberAtSecondPositionShouldReturnSameNumber() {
        Integer [] intArray = {1 , 48 , 5};
        Integer result = maximumNumber.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(48), result);
    }

    @Test
    public void givenMaximumNumberAtThirdPositionShouldReturnSameNumber() {
        Integer [] intArray = {1 , 48 , 54};
        Integer result = maximumNumber.findMaximum(intArray);
        Assertions.assertEquals(Integer.valueOf(54), result);
    }

    @Test
    public void givenMaximumNumberAtFirstPositionShouldReturnFloatSameNumber() {
        Double [] doulbeArray = {5.8, 1.2, 3.4};
        Double result = maximumNumber.findMaximum(doulbeArray);
        Assertions.assertEquals(Double.valueOf(5.8), result);
    }
    
    @Test
    public void givenMaximumNumberAtSecondPositionShouldReturnFloatSameNumber() {
        Double [] doulbeArray = {5.2, 8.9, 2.1};
        Double result = maximumNumber.findMaximum(doulbeArray);
        Assertions.assertEquals(Double.valueOf(8.9), result);
    }


    @Test
    public void givenMaximumNumberAtThirdPositionShouldReturnFloatSameNumber() {
        Double [] doulbeArray = {5.9, 2.1, 7.6};
        Double result = maximumNumber.findMaximum(doulbeArray);
        Assertions.assertEquals(Double.valueOf(7.6), result);
    }

    @Test
    public void givenMaximumNumberAtFirstPositionShouldReturnStringSameNumber() {
        String [] stringArray = {"Banana", "Apple", "Peach"};
        String result = maximumNumber.findMaximum(stringArray);
        Assertions.assertEquals("Banana", result);
    }

    @Test
    public void givenMaximumNumberAtSecondPositionShouldReturnStringSameNumber() {
        String [] stringArray = {"Peach", "apple", "Banana"};
        String result = maximumNumber.findMaximum(stringArray);
        Assertions.assertEquals("apple", result);
    }

    @Test
    public void givenMaximumNumberAtThirdPositionShouldReturnStringSameNumber() {
        String [] stringArray = {"Banana", "Apple", "Peach"};
        String result = maximumNumber.findMaximum(stringArray);
        Assertions.assertEquals("Peach", result);
    }
}
