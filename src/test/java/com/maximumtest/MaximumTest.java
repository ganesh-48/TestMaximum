package com.maximumtest;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MaximumTest {
    private static MaximumNumber maximumNumber;

    @Test
    public void givenThreeMaximumNumbersAndPrintIntegerMaximumNumber() {
        Integer int1=30;
        Integer int2=42;
        Integer int3=4;
        maximumNumber = new MaximumNumber(int1, int2, int3);
        Object result = maximumNumber.findMaximum();
        Assertions.assertEquals(int2, result);
    }

    @Test
    public void givenThreeMaximumNumbersAndPrintFloatMaximumNumber() {
        Float float1=1.5f;
        Float float2=1.1f;
        Float float3=5.5f;
        maximumNumber = new MaximumNumber(float1, float2, float3);
        Object result = maximumNumber.findMaximum();
        Assertions.assertEquals(float3, result);
    }

    @Test
    public void givenThreeMaximumNumbersAndPrintStringMaximumNumber() {
        String str1="Peach";
        String str2="Apple";
        String str3="Banana";
        maximumNumber = new MaximumNumber(str1, str2, str3);
        Object result = maximumNumber.findMaximum();
        Assertions.assertEquals(str1, result);
    }
}
