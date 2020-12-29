package com.hawkins.Hackerrank;

import java.util.Arrays;
import java.util.Collection;

public class GreadyAlgoAbsDiff {


    public static void main(String[] args) {
        int[] testA = new int[]{-59 ,-36 ,-13, 1 ,-53 ,-92, -2, -96, -54, 75};
        System.out.println(minimumAbsoluteDifference(testA));
    }
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i = 0; i< arr.length-1;i++){
            int current = Math.abs(arr[i] - arr[i+1]);
            min = Math.min(min,current);
        }

        return min;



    }



}
