package com.hawkins.LeetCode.InterviewQuestions.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Stream;

public class Intersect {

    public static void main(String[] args) {
        int [] test = intersect(new int[]{1,2,2,1},new int[]{2,2});
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
    }


    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        int k = 0;

        for (int n : nums2) {
            int cnt = map.getOrDefault(n, 0);
            if (cnt > 0) {
                nums1[k++] = n;
                map.put(n, cnt - 1);
            }
        }

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
