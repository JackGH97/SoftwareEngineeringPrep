package com.hawkins.AlgoExpert.Medium;

import java.util.Arrays;

public class SmallestDifference {

    // O(n^2) time | O(1) space
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        int[] smallestPair = new int[2];
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arrayOne.length; i++){
            for(int j = 0; j < arrayTwo.length; j++){
                if(Math.abs(arrayOne[i] - arrayTwo[j]) < smallest){
                    smallest = Math.abs(arrayOne[i] - arrayTwo[j]);
                    smallestPair[0] = arrayOne[i];
                    smallestPair[1] = arrayTwo[j];
                }
            }
        }
        return smallestPair;
    }

    // different length arrays;
    // O(nlog(n) + mlog(m)) time | O(1) space
    public static int[] smallestDifferenceBetter(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int idxOne = 0;
        int idxTwo = 0;
        int smallest = Integer.MAX_VALUE;
        int current = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];
        while(idxOne < arrayOne.length && idxTwo < arrayTwo.length){
            int firstNum = arrayOne[idxOne];
            int secondNum = arrayTwo[idxTwo];
            if(firstNum < secondNum){
                current = secondNum - firstNum;
                idxOne++;
            }
            else if (secondNum < firstNum){
                current = firstNum - secondNum;
                idxTwo++;
            }
            else{
                return new int[]{firstNum,secondNum};
            }
            if(smallest > current){
                smallest = current;
                smallestPair = new int[]{firstNum,secondNum};
            }
        }
        return smallestPair;
    }
}
