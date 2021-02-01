package com.hawkins.Algorithms;


public class BubbleSort {

    /*
        Bubble Sort Method smallest to largest
        lastUnsortedIndex decreases as we know the furthest element is the sorted one
        Worst Case - o(n^2)
    */
    public static void BubbleSort(int[] input) {
        for (int i = input.length - 1; i > 0; i--) {
            for (int j = 0; j < i; i++) {
                if (input[j] > input[j + 1]) {
                    swap(input, j, j + 1);
                }
            }
        }
    }

    public static void swap(int[] input, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}
