package com.hawkins.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteCost {

    public static void main(String[] args) {
        System.out.println(solution("abccbd",new int[]{0,1,2,3,4,5}));
    }
    public static int solution(String S, int[] C) {
        // write your code in Java SE 8
        Arrays.sort(C);
        int cost = 0;
        int pointerA = 0;
        for(int i = 1; i < S.length(); i++){
            if(S.charAt(i) == S.charAt(i-1)){
                cost += C[pointerA];

            }
            pointerA++;
        }

        return cost;
    }
}
