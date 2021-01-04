package com.hawkins.Hackerrank;

import java.util.Arrays;

public class FlippingBits {


    public static void main(String[] args) {
        System.out.println(flippingBits(802743475));

    }

    static long flippingBits(long n) {

        String result = Long.toBinaryString(n);
        char[] rWP = String.format("%32s", result).replaceAll(" ", "0").toCharArray();

        for(int i = 0; i < rWP.length; i++){
            if(rWP[i] == '0'){
                rWP[i] = '1';
            }else {
                rWP[i] = '0';
            }
        }

        return Long.parseLong(new String(rWP),2);
    }

}
