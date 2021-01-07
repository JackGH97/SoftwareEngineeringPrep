package com.hawkins.AlgoExpert.Revisit.Easy;

public class BinarySearch {


    public static void main(String[] args) {
        System.out.println(5/2);
    }
    // remember binary search only works on a sorted array;
        public static int binarySearch(int[] array, int target) {
            return binarySearch(array, target,0,array.length);
        }


    public static int binarySearch(int[] array, int target,int start, int end){
            if(start >= end){
                return 1;
            }
            int midpoint  = (start + end) / 2;
            if(array[midpoint] == target){
                return midpoint;
            }
            else if(array[midpoint] < target){
                return binarySearch(array,target,midpoint+1,end);
            }
            else{
                return binarySearch(array,target,start,midpoint);
            }
    }
}
