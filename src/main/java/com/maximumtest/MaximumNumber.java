package com.maximumtest;


/* @Description- Three integer to find the maximum using compareTo method
*  Three float to find the maximum using compareTo method
* Three string to find the maximum using compareTo method
*  using max method to find more than one parameter
 */
public class MaximumNumber<K extends Comparable<K>> {
    private K a;
    private K b;
    private K c;
    private K d;
    private K e;

    public MaximumNumber(K a, K b, K c, K d, K e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public K findMaximum() {
        K findMaximum = MaximumNumber.findMaximum(a, b, c, d, e);
        printMaximum(findMaximum());
        return  findMaximum();
    }

    public void printMaximum(K maximum) {
        System.out.println("Maximum" +maximum);
    }

    //Single generic method to compare different types of data
    public static <K extends Comparable> K findMaximum(K a, K b, K c, K d, K e) {
        K max = b;
        if (b.compareTo(max) > 0 ) {
            max = b;
        }
        if (c.compareTo(max) > 0 ) {
            max = c;
        }
        if (d.compareTo(max) > 0 ) {
            max = d;
        }
        if (e.compareTo(max) > 0 ) {
            max = e;
        }
        return max;
    }
}
