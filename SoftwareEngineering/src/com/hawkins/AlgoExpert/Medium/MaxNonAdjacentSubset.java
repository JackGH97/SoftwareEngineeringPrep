package com.hawkins.AlgoExpert.Medium;

public class MaxNonAdjacentSubset {

    // O(n) time || O(1) space
    public static int maxSubsetSumNoAdjacent(int[] array) {
        // Write your code here.
        if(array.length < 1){
            return 0;
        } else if(array.length == 1){
            return array[0];
        }
        int second = array[0];
        int first = Math.max(array[0],array[1]);
        for(int i = 2; i < array.length; i++){
            int current= Math.max(first,second + array[i]);
            second = first;
            first = current;
        }
        return first;
    }
}
