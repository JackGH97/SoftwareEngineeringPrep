package com.hawkins.Hackerrank;

import java.util.Arrays;

public class TripleSum {

    // Complete the triplets function below.

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 4 ,5};
        int[] arr2 = new int[]{2 ,3 ,3};
        int[] arr3 = new int[]{1, 2 ,3};

        System.out.println(triplets(arr1,arr2,arr3));

    }
    static long triplets(int[] a, int[] b, int[] c) {
        int[] arr = Arrays.stream(a).sorted().distinct().toArray();
        int[] brr = Arrays.stream(b).sorted().distinct().toArray();
        int[] crr = Arrays.stream(c).sorted().distinct().toArray();

        long result = 0;

        int ai = 0;
        int bi = 0;
        int ci = 0;

        while(bi < brr.length){
            while(ai < arr.length && brr[bi] >= arr[ai]){
                ai++;
            }
            while(ci < crr.length && brr[bi] >= crr[ci]){
                ci++;
            }

            result += (long) ci * ai;
            bi++;

        }

        return  result;

    }




}
