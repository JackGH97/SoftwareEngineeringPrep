package com.hawkins.LeetCode.BloombergPrep;

public class SearchRotatedArray {

    public int search(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end)/2; // avoid overflow, same as mid = (lo + hi) / 2

            if (nums[mid] == key)
                return mid;

            // the bottom half is sorted
            if (nums[start] <= nums[mid]) {
                if (nums[start] <= key && key < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // the upper half is sorted
            else {
                if (nums[mid] < key && key <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
