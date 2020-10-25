package com.hawkins.AlgoExpert.Easy;

import java.util.Hashtable;
import java.util.List;

public class TwoNumberSum {

    public static void main(String[] args) {

        List<Integer> sequence;
    }

    // O(n^2) time | O(1)space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(i != j){
                    int cSum = array[i] + array[j];
                    if(cSum == targetSum){
                        return new int[]{array[i], array[j]};
                    }
                }
            }
        }
        return new int[0];
    }


    //{3, 5, -4, 8, 11, 1, -1, 6};
    // O(n) Time | O(n)space
    public static int[] twoNumberSumSet(int[] array, int targetSum) {
        // Write your code here.
        Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>(array.length);
        for(int i = 0; i < array.length; i++){
            int target = targetSum - array[i];
            if(target == array[i]){

            }
            else if(table.contains(target)){
                return new int[]{array[i], target};
            }
            else{
                table.put(i,array[i]);
            }
        }

        return new int[0];
    }
}

