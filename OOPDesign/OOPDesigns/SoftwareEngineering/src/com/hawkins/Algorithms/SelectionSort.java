package com.hawkins.Algorithms;

public class SelectionSort {

    /* O(n^2) time complexity – Quadratic (WORST CASE)
    Doesn’t requires as much swapping as bubblesort but is unstable.
    In the average case it will perform better than bubblesort
    */
    public static int[] selectionSort(int[] array) {
        for (int lastlastUnsortedIndex = array.length - 1; lastlastUnsortedIndex > 0; lastlastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= lastlastUnsortedIndex; i++) {
                if (array[i] > array[largest]) {
                    largest = i;
                }
            }
            swap(array, largest, lastlastUnsortedIndex);
        }
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
