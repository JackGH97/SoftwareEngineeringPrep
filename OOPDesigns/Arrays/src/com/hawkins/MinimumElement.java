package com.hawkins;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int[] entered = readIntegers();
        System.out.println(findMin(entered));
    }

    public static int[] readIntegers(){
        int random = (int)(Math.random()*10+1);
        System.out.println("Enter " + random + " Numbers");

        int[] array = new int[random];
        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] passedArray){
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < passedArray.length; i++){
            if(passedArray[i] < min){
                min =passedArray[i];
            }
        }
        return min;
    }


}
