package com.hawkins.LeetCode;

public class CheckingOnes {

    // [1,0,0,1,0,1]

    public static void main(String[] args) {
        System.out.println(kLengthApart(new int[]{1,0,0,1,0,1},2));
    }


    // O(N) time )+}{[]/
    public static boolean kLengthApart(int[] nums, int k) {

        int countK = 0;
        boolean first = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                if(!first){
                    first = true;
                }
                else if(countK >= k){
                    countK = 0;
                }
                else{
                    return false;
                }
            }else{
                countK++;
            }
        }

        return true;
    }


}
