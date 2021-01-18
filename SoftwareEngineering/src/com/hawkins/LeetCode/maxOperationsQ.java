package com.hawkins.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class maxOperationsQ {


    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{2,5,4,4,1,3,4,4,1,4,4,1,2,1,2,2,3,2,4,2},3));
    }

    // O(N) ST
    // Better approach with pointers - O(Nlog(N)) T || O(1) Space
    public static int maxOperations(int[] nums, int k) {
        // store leftover in hashset - if it equals remove and increment, else add
        HashMap<Integer,Integer> pairs = new HashMap<Integer,Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int leftOver = k-nums[i];
            if(pairs.containsKey(leftOver)){
                count++;
                int value = pairs.get(leftOver);
                if(value == 1){
                    pairs.remove(leftOver);
                }
                else{
                    pairs.put(leftOver,pairs.get(leftOver)-1);
                }
            }
            else {
                pairs.put(nums[i], pairs.getOrDefault(nums[i],0)+1);
            }
        }
        return count;
    }
}
