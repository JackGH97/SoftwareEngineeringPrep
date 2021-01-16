package com.hawkins.LeetCode;

import java.util.Arrays;

public class minOperations {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309},134365)); //5
//        System.out.println(minOperations(new int[]{1,1,4,2,3},5)); //2
//        System.out.println(minOperations(new int[]{5,6,7,8,9},4)); // -1
        //[1,1,4,2,3], x = 5
    }
    public static int minOperations(int[] nums, int x) {
        //Nlog(n)
        int count = 0;
        int leftover = x;
        int left = 0;
        int right = nums.length-1;

        while(left <= right){
            if(leftover == 0){
                return count;
            }
            else if (nums[left] >= nums[right] && nums[left] <= leftover){
                leftover -= nums[left];
                left++;
                count++;
            }
            else if(nums[right] > nums[left] && nums[right] <= leftover){
                leftover -= nums[right];
                right--;
                count++;
            }
            else if(nums[left] <= nums[right] && nums[left] <= leftover){
                leftover -= nums[left];
                left++;
                count++;
            }
            else if(nums[right] <= nums[left] && nums[right] <= leftover){
                leftover -= nums[right];
                right--;
                count++;
            }
            else{
                left++;
                right--;
            }
            System.out.println(leftover);
        }

        return leftover == 0 ? count : -1;
    }
}
