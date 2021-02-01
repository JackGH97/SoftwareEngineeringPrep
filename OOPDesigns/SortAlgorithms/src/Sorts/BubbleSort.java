package Sorts;

public class BubbleSort {

    /*
        Bubble Sort Method smallest to largest
        lastUnsortedIndex decreases as we know the furthest element is the sorted one
        o(n^2)
     */
    public static int[] bubbleSort(int[] array){
        for(int lastUnsortedIndex = array.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(array[i] > array[i+1]){
                    swap(array, i,i+1);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
