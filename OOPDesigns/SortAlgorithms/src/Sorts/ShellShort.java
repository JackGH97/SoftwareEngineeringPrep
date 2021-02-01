package Sorts;

public class ShellShort {


    /*
        1st it - > gap = 3
        eventually gap = 1
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
