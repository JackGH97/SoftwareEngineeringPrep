package com.hawkins.AlgoExpert.Revisit.Easy;

import java.util.Arrays;

public class FindThreeLagestNumbers {

    public static int[] findThreeLargestNumbers(int[] array) {
        // Write your code here.
        int[] tL = new int[3];
        Arrays.fill(tL,Integer.MIN_VALUE);
        for(int i = 0; i < array.length; i++){
            int cV = array[i];
            if(cV > tL[0] && cV > tL[1] && cV > tL[2]){
                tL[0] = tL[1];
                tL[1] = tL[2];
                tL[2] = cV;
            }
            else if(cV > tL[0] && cV > tL[1]){
                tL[0] = tL[1];
                tL[1] = cV;
            }
            else if(cV > tL[0]){
                tL[0] = cV;
            }
        }
        return tL;
    }

}
