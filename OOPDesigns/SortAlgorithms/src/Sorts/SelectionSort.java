package Sorts;

public class SelectionSort {

    public static int[] selectionSort(int[]array){
        for(int lastlastUnsortedIndex = array.length-1; lastlastUnsortedIndex > 0; lastlastUnsortedIndex--){

            int largest =0;

            for(int i = 1; i <= lastlastUnsortedIndex; i++){
                if(array[i] > array[largest]){
                    largest = i;
                }
            }

            swap(array,largest,lastlastUnsortedIndex);
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
