package com.hawkins;

import com.hawkins.Questions.Medium.MagicSquare;

import java.util.*;

/*
Area to test methods :))
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] test = new int[]{0,1,2,3,4,5};
        System.out.println(solutionT("abccbd",test));

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

    public static String solution(int N) {
        // write your code in Java SE 8
        java.lang.StringBuilder sB = new java.lang.StringBuilder();

        if(N%2 != 0){
            for(int i = 0; i < N; i++){
                sB.append('a');
            }
        }
        else{
            for(int i = 0; i < N-1; i++){
                sB.append('a');
            }
            sB.append('b');
        }
        return sB.toString();
    }

    public static int solutionT(String S, int[] C) {
        // write your code in Java SE 8

        HashSet<Character> unique = new HashSet<>();
        int sum = 0;
        for(int j = 0; j<S.length(); j++){
            if(!unique.contains(S.charAt(j))){
                unique.add(S.charAt(j));
                int maxForLetter = 0;
                for(int i = j; i<S.length(); i++){
                    if(S.charAt(i) == S.charAt(j)){
                        sum = sum + C[i];
                        if(maxForLetter < C[i]){
                            maxForLetter = C[i];
                        }
                    }
                }
                sum = sum - maxForLetter;
            }
        }
        return sum;
    }




}
