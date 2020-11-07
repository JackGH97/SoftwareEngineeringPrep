package com.hawkins;

import com.hawkins.Questions.Medium.MagicSquare;

import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

/*
Area to test methods :))
 */
public class Main {

    public static void main(String[] args) {
	// write your code here


        int[] aseaesw = new int[]{1,4,5,8,10,14,15};

        System.out.println(binarySearch(aseaesw,15));
    }

    public static int binarySearch(int[] array, int target) {
        return binarySearchHelper(array,target,0,array.length-1);
    }

    public static int binarySearchHelper(int[] array, int target, int start, int end) {
        int midpoint  = (start+ end)/2;
        if(array[midpoint] == target){
            return midpoint;
        }else if(array[midpoint] > target){
            return binarySearchHelper(array,target,0,midpoint);
        }
        else if(array[midpoint] < target){
            return binarySearchHelper(array,target,midpoint+1,end);
        }
        return -1;
    }



}
