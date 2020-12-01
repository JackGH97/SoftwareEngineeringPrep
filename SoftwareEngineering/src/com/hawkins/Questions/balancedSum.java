package com.hawkins.Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class balancedSum {


    /*
    We define two pointers i and j to traverse the array from left and right,
    left_sum and right_sum to store sum from right and left respectively

    If left_sum is lesser than increment i and if right_sum is lesser than decrement j
    and, find a position where left_sum == right_sum and i and j are next to each other
    */
    public static void main(String[] args) {
//
        int arr[] = {2, 3, 4, 1, 4, 5};
        System.out.println(pivotValue(arr));
    }

    public static int pivotValue(int[] arr){
        int sum = IntStream.of(arr).sum();
        int leftS = 0;

        for(int i = 0; i < arr.length; i++){
            if(sum - leftS - arr[i] == leftS){
                return arr[i];
            }
            leftS += arr[i];
        }
        return -1;
    }

}
