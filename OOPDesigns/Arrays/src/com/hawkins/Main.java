package com.hawkins;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here


        System.out.println("Enter a number");

        int[] myIntegers = getIntegers(5);

        int[] sortIntegers = sortArray(myIntegers);

        printArray(sortIntegers);
    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];

        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] arrayPassed){
        System.out.println(Arrays.toString(arrayPassed));
    }

    public static int[] sortArray(int[] unSorted){
//        int[] sorted = new int[unSorted.length];
//        for(int i =0; i<unSorted.length; i++){
//            sorted[i] = unSorted[i];
//        }
        int[] sorted = Arrays.copyOf(unSorted,unSorted.length);
        int temp;
        boolean flag = true;

        while(flag){
            flag = false;

            for(int i = 0; i <sorted.length-1; i++){
                if(sorted[i] < sorted[i+1]){
                    temp = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }

}
