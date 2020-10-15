package com.hawkins.Algorithms;

/*
Variation of insertion sort
• Insertion sort chooses which element to insert using a gap of 1
• Shell Sort starts out using a large gap value
• As the algorithm runs, the gap is reduced.
• GOAL IS TO RECUDE Amount of shifting required
    o The last gap is always 1, last iteration of the gap value is an insertion sort
    o By the time we get to insertion sore, the array has been partially sorted so there’s left shifting required
 */
public class ShellShort {

    /*
    Worst Case = O(n^2)
    Usually performs better than insertion sort but is unstable
     */
    public static int[] shellSort(int[] array){
        int iterations= 0;
        for(int gap = array.length/2; gap >0; gap/=2){
            iterations++;
            for(int i = gap; i< array.length; i++){
                int newElement = array[i];
                int j = i;
                while (j >= gap && array[j-gap] > newElement){
                    System.out.println(array[j-gap]);
                    System.out.println(array[j]);
                    array[j] = array[j-gap];
                    j -= gap;
                }
                array[j] = newElement;
            }
        }
        return array;
    }
}
