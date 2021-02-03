package com.hawkins.AlgoExpert.Easy;

import java.util.Arrays;

public class MinWaitingTIme {


    public static void main(String[] args) {
        System.out.println(minimumWaitingTimeImproved(new int[]{3,2,1,2,6})); // 17
    }

    // O(n) time || O(n) space
    public static int minimumWaitingTime(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);
        int[] copy = Arrays.copyOf(queries,queries.length);
        copy[0] = 0;
        for(int i = 1; i <queries.length; i++){
            copy[i] = queries[i-1]  + copy[i-1];
        }

        return Arrays.stream(copy).sum();
    }

    // better sol
    // O(nlog(n)) time || O(1) space
    public static int minimumWaitingTimeImproved(int[] queries) {
        // Write your code here.
        Arrays.sort(queries);

        int totalWait = 0;
        for(int i = 0; i <queries.length; i++){
            int duration  = queries[i];
            int queriesleft = queries.length - (i +1);
            totalWait += queriesleft * duration;
        }

        return totalWait;
    }
}
