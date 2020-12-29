package com.hawkins.Hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class LuckBalance {

    public static void main(String[] args) {
        int[][] balance = new int[][]{{5,1},{2,1},{1,1},{8,1},{10,0},{5,0}};
        System.out.println(luckBalance(3,balance));
    }

    static int luckBalance(int k, int[][] contests) {
        int totalLuckBalance = 0;
        int impContestCount = 0;
        List<Integer> tempList = new ArrayList<>();

        for(int i = 0; i < contests.length; i++){
            if(contests[i][1] == 0)
                totalLuckBalance += contests[i][0];
            else{
                impContestCount ++;
                tempList.add(contests[i][0]);
                totalLuckBalance += contests[i][0];
            }
        }

        System.out.println(tempList);
        if(impContestCount > k){
            Collections.sort(tempList);
            int n = impContestCount - k;
            System.out.println(n);
            for(int j = 0; j < n; j++){
                System.out.println(tempList.get(j));
                totalLuckBalance -= 2 * tempList.get(j);
            }
        }

        return totalLuckBalance;
    }
}
