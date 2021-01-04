package com.hawkins.Hackerrank;

import java.util.Arrays;

public class RecursiveDigitSum {

    //converted to long due to integer overflow
    // O(
    public static void main(String[] args) {
        System.out.println(superDigit("148",3));
    }

    static int superDigit(String n, int k) {
        long superDigit;
        int[] digits = n.chars().map(c -> c-'0').toArray();
        superDigit = (long) Arrays.stream(digits).sum() * k;
        superDigit = recursionH(String.valueOf(superDigit));
        return (int) superDigit;
    }

    static long recursionH(String total){
        if(total.length() != 1){
            int[] digits = total.chars().map(c -> c-'0').toArray();
            return recursionH(String.valueOf((long)Arrays.stream(digits).sum()));
        }else {
            return Long.parseLong(total);
        }
    }




}
