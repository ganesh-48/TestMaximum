package com.maximumtest;

public class MaximumNumber<K extends Comparable<K>> {
    private K x;
    private K y;
    private K z;

    public MaximumNumber(K x, K y, K z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public K findMaximum() {
        return MaximumNumber.findMaximum(x, y, z);
    }

    public static <K extends Comparable> K findMaximum(K x, K y, K z) {
        K max = x;
        if (y.compareTo(max) > 0 ) {
            max = y;
        }
        if (z.compareTo(max) > 0 ) {
            max = z;
        }
        return max;
    }
}
