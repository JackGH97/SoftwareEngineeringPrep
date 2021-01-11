package com.hawkins.LeetCode.BloombergPrep;

import java.util.Arrays;

public class mergeArrays {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        merge(nums1,3,nums2,3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
// cheap way.
//        System.arraycopy(nums2, 0, nums1, m, n);
//        Arrays.sort(nums1);
        int [] nums1_copy = new int[m];
        System.arraycopy(nums1, 0, nums1_copy, 0, m);

        int p1 = 0;
        int p2 = 0;
        int p = 0;

        while((p1 < m) && (p2 < n)) {
            nums1[p++] = (nums1_copy[p1] < nums2[p2]) ? nums1_copy[p1++] : nums2[p2++];
        }
        // if there are still elements left over
        if (p1 < m)
            System.arraycopy(nums1_copy, p1, nums1, p1 + p2, m + n - p1 - p2);
        if (p2 < n)
            System.arraycopy(nums2, p2, nums1, p1 + p2, m + n - p1 - p2);
    }
}
