package com.hawkins.Hackerrank;

public class TimeComplexityPrimality {


    //O(n^(1/2))
    // O(sqr(n))
    static String primality(int n) {
        if (n < 2) {
            return "Not Prime";
        } else if (n == 2) {
            return "Prime";
        } else if (n % 2 == 0) {
            return "Not Prime";
        }
        for (int i = 2; i <=(int) Math.sqrt(n); i ++) {
            if (n % i == 0) {
                return "Not Prime";
            }
        }
        return "Prime";
    }
}
