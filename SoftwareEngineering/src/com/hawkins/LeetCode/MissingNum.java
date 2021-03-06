package com.hawkins.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class MissingNum {


    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {1,0,2,3}));
    }

    //102
    public static int missingNumber(int[] nums) {
        int actualSum = 0;
        for(int num:nums)
        {
            actualSum += num;
        }

        int n = nums.length+1;
        int expectedSum = n * (n-1)/2;

        System.out.println(expectedSum);

        return expectedSum - actualSum;
    }
}
