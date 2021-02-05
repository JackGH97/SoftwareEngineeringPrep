package com.hawkins.LeetCode.BloombergPrep;

import java.util.Arrays;

public class lhs {


    public static void main(String[] args) {
        int[] array = new int[] {1,3,2,2,5,2,3,7};
        int[] array2 = new int[] {1,3,5,7,9,11,13,15,17};

        System.out.println(findLHS(array)); // 5;
        System.out.println(findLHS(array2)); // 0 ;
    }

    // beats 90% of submissions!
    // O(nlog(n)) time || O(1) space
    public static int findLHS(int[] nums) {
        int maxCount= 0;
        int count = 1;
        Arrays.sort(nums);
        int i = 0;
        int j = i+1;

        while(j < nums.length){
            if(nums[j] - nums[i] > 1){
                i++;
                while(nums[i] == nums[i-1]){
                    i++;
                }
                j= i+1;
                count = 1;
            }
            else if(nums[j] - nums[i] == 1){
                j++;
                count++;
                maxCount = Math.max(maxCount,count);
            }
            else if(nums[j] == nums[i]){
                i++;
                j++;
                count++;
            }
        }

        return maxCount;
    }


}
