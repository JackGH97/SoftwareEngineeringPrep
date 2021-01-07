package com.hawkins.AlgoExpert.Revisit.Easy;

import java.util.Arrays;

public class TwoNumberSum {

    // O(n) passes + O(log(n) for the sort - > O(nlog(n)) Time || O(1) Space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        //log(n)
        Arrays.sort(array);
        int left = 0;
        int right = array.length-1;

        while(left < right){
            int currentSum = array[left] + array[right];
            if(currentSum == targetSum){
                return new int[]{array[left],array[right]};
            }
            else if (currentSum < targetSum){
                left++;
            }
            else if (currentSum >targetSum){
                right--;
            }
        }


        return  new int[0];
    }
}
