package com.hawkins.Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;

public class Candies {


    public static void main(String[] args) {

        int[] test = new int[] {2 ,4, 2 ,6, 1,7 ,8, 9, 2 ,1};
        System.out.println(candies(6,test));
    }


    static long candies(int n, int[] arr) {
        if (arr.length == 0) return 0;
        arr[0] = Math.max(0, arr[0]);
        if (arr.length == 1) return 1l;

        int[] candies = Arrays.copyOf(arr,arr.length);
        Arrays.fill(candies,1);

        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1] > arr[i]) && !(candies[i] < candies[i+1]))
                candies[i+1] = candies[i] + 1;
        }

        for(int i=arr.length-1;i>0;i--){
            if((arr[i] < arr[i-1])
                    && !(candies[i-1] > candies[i]))
            {
                candies[i-1] = candies[i] + 1;
            }
        }

        return Arrays.stream(candies).sum();
    }
}
