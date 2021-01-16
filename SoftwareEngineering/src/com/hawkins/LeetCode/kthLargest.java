package com.hawkins.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class kthLargest {

    // [3,2,1,5,6,4] and k = 2 = 5
    // 1,2,3,4,5,6

    // [3,2,3,1,2,4,5,5,6] and k = 4 = 4
    // 1,2,2,3,3,4,5,5,6
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k-1];
    }
}
