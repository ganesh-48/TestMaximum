package com.maximumtest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaximumTest {
    private static MaximumNumber maximumNumber;

    @Test
    public void givenThreeMaximumNumbersAndPrintIntegerMaximumNumber() {
        Integer int1=30;
        Integer int2=42;
        Integer int3=4;
        Integer int4=6;
        Integer int5=34;
        maximumNumber = new MaximumNumber(int1, int2, int3, int4, int5);
        Object result = maximumNumber.findMaximum();
        Assertions.assertEquals(int2, result);
    }

    @Test
    public void givenThreeMaximumNumbersAndPrintFloatMaximumNumber() {
        Float float1=1.5f;
        Float float2=1.1f;
        Float float3=5.5f;
        Float float4=0.5f;
        Float float5=4.2f;
        maximumNumber = new MaximumNumber(float1, float2, float3, float4, float5);
        Object result = maximumNumber.findMaximum();
        Assertions.assertEquals(float3, result);
    }

    @Test
    public void givenThreeMaximumNumbersAndPrintStringMaximumNumber() {
        String str1="Peach";
        String str2="Apple";
        String str3="Banana";
        String str4 = "Orange";
        String str5 = "Pineapple";
        maximumNumber = new MaximumNumber(str1, str2, str3, str4, str5);
        Object result = maximumNumber.findMaximum();
        Assertions.assertEquals(str4, result);
    }
}
