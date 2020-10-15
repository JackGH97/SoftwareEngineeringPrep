package com.hawkins.Algorithms;
/*
Makes assumptions about the data
• Doesn’t use comparisons
• Counts the number of occurrences of each value
• Only works with non-negative discrete values
• O(n) – can achieve this because we’re making assumptions about the data
 */
public class CountingSort {

   // int[] cArray = new int[]{2,5,9,8,2,8,7,10,4,3};

    public static void countingSort(int[] input, int min, int max){

        int[] countArray = new int[(max-min) + 1];

        for(int i = 0 ; i<input.length; i++){
            countArray[input[i]-min]++;
        }

        int j = 0;
        for(int i = min; i<=max; i++){
            while(countArray[i - min] > 0){
                input[j++] = i;
                countArray[i-min]--;
            }
        }

    }
}
