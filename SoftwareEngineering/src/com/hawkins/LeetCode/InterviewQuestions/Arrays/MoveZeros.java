package com.hawkins.LeetCode.InterviewQuestions.Arrays;
public class MoveZeros {

    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = left+1;
        while (left <right){
            if(nums[left] == 0 && nums[right] != 0){
                nums[left] = nums[right];
                nums[right] = 0;
                left++;
                right++;
            }
            else{
                right++;
                left++;
            }
        }
    }
}
