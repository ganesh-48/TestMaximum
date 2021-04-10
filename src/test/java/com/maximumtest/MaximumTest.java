package com.maximumtest;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

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
    
    
}
