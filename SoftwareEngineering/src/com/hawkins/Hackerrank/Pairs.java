package com.hawkins.Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pairs {


    public static void main(String[] args) {
        int[] arr = new int[] {1,5,3,4,2};
        System.out.println(pairs(2,arr));
    }

    // O(N log N) Time || O(N)Space
    // best case O(N) if hashset O(1)
    static int pairs(int k, int[] arr) {
        int count = 0;


        Set<Integer> l = new HashSet<Integer>(){{
            for(int i : arr)
                add(i);
        }};

        for(int i : l){
            if(l.contains(i+k))
                count++;
        }

        return count;

    }
}
