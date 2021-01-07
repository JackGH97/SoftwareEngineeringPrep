package com.hawkins.AlgoExpert.Revisit.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class validateSubSeq {


    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList(Arrays.asList(new int[]{5,1,22,25,6,-1,8,10}));
        ArrayList<Integer> seq = new ArrayList(Arrays.asList(new int[]{1,6,-1,10}));
        System.out.println(isValidSubsequence(array,seq));
    }

    // O(n) time || O(1) space
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int j = 0;
        for (int i = 0; i < array.size(); i++) {
            if (j < sequence.size() && array.get(i) == sequence.get(j)) {
                j++;
            }
        }
        //j == sequence.size() ? true : false;
        return j == sequence.size();
    }


}
