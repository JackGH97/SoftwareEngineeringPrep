package com.hawkins.Questions;

import java.util.HashSet;

public class PossibleSet {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,2,1};
        System.out.println( solution(array));
        int[] array1 = new int[]{7,7,7};
        System.out.println( solution(array1));
        int[] array2 = new int[]{1,2,2,3};
        System.out.println( solution(array2));
    }

    public static boolean solution(int[] A) {
        HashSet<Integer> duplicates = new HashSet<>();

        for(int i = 0; i < A.length; i++){
            if(duplicates.contains(A[i])){
                duplicates.remove(A[i]);
            }
            else{
                duplicates.add(A[i]);
            }
        }

        if(!duplicates.isEmpty()){
            return  false;
        }
        return true;
    }
}
