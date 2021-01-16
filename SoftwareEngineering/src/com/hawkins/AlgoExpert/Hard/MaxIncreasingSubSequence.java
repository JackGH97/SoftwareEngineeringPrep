package com.hawkins.AlgoExpert.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxIncreasingSubSequence {

    public static void main(String[] args) {
        System.out.println(maxSumIncreasingSubsequence(new int[]{10,70,20,30,50,11,30}));
    }
    public static int maxSumIncreasingSubsequence(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        int maxSum = 0;
        for(int i =0; i <array.length; i++){
            int currentSum = array[i];
            int currentHighest = array[i];
            ArrayList<Integer> innerlist = new ArrayList<>();
            innerlist.add(array[i]);
            for(int j = i+1; j < array.length; j++) {
                if (array[j] > currentHighest) {
                    innerlist.add(array[j]);
                    currentHighest = array[j];
                    currentSum += array[j];
                    if(i == 0){
                        System.out.println(currentSum);
                    }

                }
            }
            if(currentSum > maxSum){
                list.clear();
                list = innerlist;
                maxSum = currentSum;
            }
        }

        System.out.println(list);

        return maxSum;

    }
}
