package com.hawkins.LeetCode.InterviewQuestions.Arrays;

import java.util.HashSet;

public class ContainsDuplicate {

    public static void main(String[] args) {
        containsDuplicate(new int[]{1,2,4,1});
    }
    // Hashset search/index = 0(1)
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> test = new HashSet<>();
        for (int i = 0; i <nums.length; i++){
            if(test.contains(nums[i])){
                return true;
            }
            test.add(nums[i]);
        }
        System.out.println(test);
        return false;
    }
}
