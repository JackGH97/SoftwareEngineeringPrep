package com.hawkins.Algorithms;

/*
O(n^2) time complexity – Quadratic (WORST CASE)
Can be improved with Shell Sort
*/
public class InsertionSort {

    /*
    Grows the partition from the front of the array
    firstUnsortedIndex = 1;
    I = 0 – used to traverse from left to right
    • newElement = would equal 35 which was want to insert into the sorted partion.
     */
    public static int[] insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

}
