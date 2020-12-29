package com.hawkins.Hackerrank;

import java.util.Arrays;

public class MaxMin {

    public static void main(String[] args) {
        int[] test = new int[] {10,100,300,200,1000,20,30};
        int[] test1 = new int[] {1,2,3,4,10,20,30,40,100,200};
        int[] test2 = new int[] {1,2,1,2,1};
        int[] failed1 = new int[] {100,200,300,350,400,401,402};
        System.out.println(maxMin(3,test)); // 20
        System.out.println(maxMin(4,test1)); //3
        System.out.println(maxMin(2,test2)); //0
        System.out.println(maxMin(3,failed1));
    }


    static int maxMin(int k, int[] arr) {
        int minDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int i = 0; i < arr.length-k +1; i++){
            int current = Math.abs(arr[i+k-1] - arr[i]);
            minDiff = Math.min(current,minDiff);
        }

        return minDiff;
    }
}
