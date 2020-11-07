package com.hawkins.AlgoExpert.Easy;

public class InserstionSort {

    // O(n^2) | o(1)
    public static int[] insertionSort(int[] array) {
        // Write your code here.
        for(int i = 1; i < array.length; i++){
            for(int j = 0; j < i ; j++){
                if(array[j] > array[i]){
                    swap(array,i,j);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int i, int j){
        if (i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
