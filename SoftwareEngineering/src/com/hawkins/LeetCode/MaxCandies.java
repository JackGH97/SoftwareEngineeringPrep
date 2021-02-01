package com.hawkins.LeetCode;

import java.util.*;
import java.util.stream.IntStream;

public class MaxCandies {

    public static void main(String[] args) {
        int[] test = new int[] {1,2,6};
        System.out.println(kidsWithCandies(test,4));
        Arrays.fill(test,1);
        OptionalInt max = Arrays.stream(test).max();
        
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        ArrayList<Boolean> list = new ArrayList<>();
        for(int i = 0; i<candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i = 0; i<candies.length; i++){
            if(candies[i] + extraCandies >= max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }

        return list;
    }
}
