package com.hawkins.LeetCode.InterviewQuestions.Arrays;

public class InPlaceDuplicate {

    public static void main(String[] args) {
        int[] test = new int[]{0,1,1,2};
        removeDuplicates(test);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {

                i++;
                System.out.println(i);
                System.out.println(j);
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

}
