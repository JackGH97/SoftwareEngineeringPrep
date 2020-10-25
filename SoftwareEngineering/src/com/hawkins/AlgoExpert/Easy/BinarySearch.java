package com.hawkins.AlgoExpert.Easy;

public class BinarySearch {

    // Best: O(log(n)) time | O(log(n)) space
    public static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array,target,0,array.length);
    }

    public static int binarySearchHelper(int[] array, int target, int start, int end) {
        if(start >= end){
            return -1;
        }
        int midpoint  = (start+ end)/2;
        if(array[midpoint] == target){
            return midpoint;
        }else if(array[midpoint] > target){
            return binarySearchHelper(array,target,start,midpoint);
        }
        else{
            return binarySearchHelper(array,target,midpoint+1,end);
        }
    }
}
