package com.hawkins.Algorithms;

/*
Makes assumptions about the data
• Must have the same radix and width
• the radix or base is the number of unique digits, including the digit zero, used to represent
numbers. For example, for the decimal/denary system the radix is ten, because it uses the ten
digits from 0 through 9
• The data must be integers or strings
• Sort based on each individual digit or letter position
O(n) – can achieve this because we’re making assumptions about the data
• Even so often runs slower than O(nLogn)
 */
public class RadixSort {

    /*
    with stable counting sort
     */
    public static void radixSort(int[] input, int radix, int width) {
        for (int i = 0; i < width; i++) {
            radixSingleSort(input, i, radix);
        }
    }
    public static void radixSingleSort(int[] input, int position, int radix) {
        int numItems = input.length;
        int[] countArray = new int[radix];
        for (int value : input) {
            countArray[getDigit(position, value, radix)]++;
        }
        // Adjust the count array
        for (int j = 1; j < radix; j++) {
            countArray[j] += countArray[j - 1];
        }
        int[] temp = new int[numItems];
        for (int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] =
                    input[tempIndex];
        }
        for (int tempIndex = 0; tempIndex < numItems; tempIndex++) {
            input[tempIndex] = temp[tempIndex];
        }
    }
    public static int getDigit(int position, int value, int radix) {
        return value / (int) Math.pow(radix, position) % radix;
    }
}
