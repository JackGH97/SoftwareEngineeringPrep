package com.hawkins.AlgoExpert.Easy;

import java.util.List;

public class SubSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here
        boolean test = false;
        int j = 0;
        for(int i = 0; i < array.size(); i ++){
            if(j < sequence.size() && sequence.get(j) == array.get(i)){
                j++;
                test = true;
            }
            else{
            }
        }

        return j == sequence.size();
    }
}
