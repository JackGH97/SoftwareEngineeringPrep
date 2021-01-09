package com.hawkins.LeetCode.InterviewQuestions.Arrays;

import java.util.HashMap;

public class TwoSumUnsorted {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set = new HashMap();
        for(int i  = 0; i < nums.length; i++){
            int leftover = target - nums[i];
            if(set.containsKey(leftover)){
                return new int[] { set.get(leftover), i };
            }
            set.put(nums[i],i);
        }
        return new int[]{};
    }
}
