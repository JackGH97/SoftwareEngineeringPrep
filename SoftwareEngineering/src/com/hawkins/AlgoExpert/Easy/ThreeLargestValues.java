package com.hawkins.AlgoExpert.Easy;

public class ThreeLargestValues {

    // O(n) Time | O(1) Space
    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] tL = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
        for(int i = 0; i < array.length; i++){
            // mid need to check >=..
            if(array[i] > tL[2]){
                tL[0] = tL[1];
                tL[1] = tL[2];
                tL[2] = array[i];
            } else if (array[i] > tL[1]){
                tL[0] = tL[1];
                tL[1] = array[i];
            } else if(array[i] > tL[0]) {
                tL[0] = array[i];
            }
        }
        return tL;
    }
}
