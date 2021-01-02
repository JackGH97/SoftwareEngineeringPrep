package com.hawkins.Hackerrank;

public class DynamicProgMaxArray {

    static int maxSubsetSum(int[] arr) {

        for(int i = 0; i<arr.length-1; i+=2){
            arr[i] = Math.abs(arr[i] + arr[i-1]);
        }

        return  arr[arr.length-1];
    }
}
