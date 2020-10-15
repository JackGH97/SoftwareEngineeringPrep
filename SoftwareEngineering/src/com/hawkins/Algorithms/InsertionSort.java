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
        recursion(array, array.length);
        return array;
    }

    public static void recursion(int[] array, int numberOfItems) {
        if (numberOfItems < 2) {
            return;
        }
        recursion(array, numberOfItems - 1);
        int newElement = array[numberOfItems - 1];
        int i;
        for (i = numberOfItems - 1; i > 0 && array[i - 1] > newElement; i--) {
            array[i] = array[i - 1];
        }
        array[i] = newElement;
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------");
    }

}
