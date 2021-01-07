package com.hawkins.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingInteger {

    public static void main(String[] args) {

        System.out.println(findKthPositive(  new int[]{1,2,3,4},2));
        System.out.println(findKthPositive(  new int[]{2,3,4,7,11},5));
        System.out.println(findKthPositive(  new int[]{1,3},1));
    }

    public static int findKthPositive(int[] arr, int k) {
        int ret = k;
        int i = 0;
        while (i < arr.length && arr[i] <= ret) {
            ret++;
            i++;
        }
        return ret;
    }

}
