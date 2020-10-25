package com.hawkins.AlgoExpert.Easy;

public class BubbleSort {

    // Best: O(n) time | O(1) space
    // Average: O(n^2) time | O(1) space
    // Worst: O(n^2) time | O(1) space
    public static int[] bubbleSort(int[] array) {
        // Write your code here.
        for(int unOrdered = array.length-1; unOrdered > 0; unOrdered--){
            for(int j = 0; j < unOrdered; j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                }
            }
        }
        return array;
    }

    public static int[] swap(int [] array, int i, int j){
        if(i == j){
            return array;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return array;
    }
}
