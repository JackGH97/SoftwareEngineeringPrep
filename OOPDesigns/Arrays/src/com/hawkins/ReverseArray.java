package com.hawkins;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] forward = new int[]{1,2,3,4,5,6};
        System.out.println("Array: "+ Arrays.toString(forward)); 
        reverse(forward);
        System.out.println("Array Reversed: "+ Arrays.toString(forward));

    }

    public static void reverse(int[] array){
        int temp;
        int halflength = array.length/2;
        for(int i = 0; i < halflength; i++){
                temp = array[i];
                array[i] = array[array.length-1-i];
                array[array.length-1-i] = temp;
        }
    }
}
