package Sorts;

public class InsertionSort {


    public static int[] insertionSort(int[] array){
        recursion(array, array.length);
        return array;
    }

    public static void recursion(int[] array,int numberOfItems){
        if(numberOfItems < 2){
            return;
        }

        recursion(array,numberOfItems-1);
        int newElement = array[numberOfItems-1];
        int i;
        // numItems = 3
        /*
        new element = array[2] = -15
        35 > 15
        -15  == 35
        20 > -15
        -15 == 20
        i = 0;

        i== 2
        2 > 0 && {20,35,-15,7,55,1,-22};
         */
        // keep looking for the insertion position as long as we havent hit the front of the array
        for(i = numberOfItems-1; i > 0 && array[i-1] > newElement; i--){
            array[i] = array[i-1];
        }
        array[i] = newElement;
        System.out.println("Result of call when numItems = " + numberOfItems);
        for(int j = 0; j< array.length; j++){
            System.out.print(array[j]);
            System.out.print(", ");
        }
        System.out.println("");
        System.out.println("-----------------------------------------------------");

    }


}
