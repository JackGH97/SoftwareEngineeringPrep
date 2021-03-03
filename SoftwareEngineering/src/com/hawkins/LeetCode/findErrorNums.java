package com.hawkins.LeetCode;

import java.util.*;

public class findErrorNums {

    public static void main(String[] args) {
//        int[] test1 = findErrorNums(new int[]{1,2,2,4});
//        for(int i = 0; i < test1.length; i++){
//            System.out.println(test1[i]);
//        }
        System.out.println(distributeCandies(new int[]{1,1,2,2,3,3}));
        System.out.println(distributeCandies(new int[]{1,1,2,3}));
        System.out.println(distributeCandies(new int[]{6,6,6,6}));
    }

    public static int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1, missing = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                dup = nums[i];
            else if (nums[i] > nums[i - 1] + 1)
                missing = nums[i - 1] + 1;
        }
        return new int[] {dup, nums[nums.length - 1] != nums.length ? nums.length : missing};
    }

    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int n = candyType.length/2;


        for(int i = 0; i < candyType.length; i++) {
            if (!set.contains(candyType[i])) {
                set.add(candyType[i]);
            }
        }
        return n >= set.size() ? set.size() : candyType.length-n;
    }
}
