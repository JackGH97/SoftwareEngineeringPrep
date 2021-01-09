package com.hawkins.LeetCode.InterviewQuestions.Arrays;

public class RotateRight {

    public static void main(String[] args) {
        rotate(new int[]{-1,-100,3,99},2);
    }

    //O(k(n)) 0(1) brute force
    public static void rotate(int[] nums, int k) {

        for(int i  = 0; i < k; i++){
            int left = 0;
            int right = nums.length;
            while(left < right){
                swap(nums,left,right);
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    /*
    Original List                   : 1 2 3 4 5 6 7
    After reversing all numbers     : 7 6 5 4 3 2 1
    After reversing first k numbers : 5 6 7 4 3 2 1
    After revering last n-k numbers : 5 6 7 1 2 3 4 --> Result
     */
    // better solution
    public void rotate1(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
