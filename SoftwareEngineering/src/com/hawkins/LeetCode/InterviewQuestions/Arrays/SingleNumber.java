package com.hawkins.LeetCode.InterviewQuestions.Arrays;

import java.util.HashSet;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        HashSet<Integer> unique = new HashSet();
        for(int i = 0; i < nums.length; i++){
            if(unique.contains(nums[i])){
                unique.remove(nums[i]);
            }
            unique.add(nums[i]);
        }
        return unique.iterator().next();
    }

}
