package com.hawkins.LeetCode;

public class maxWealth {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int i = 0; i < accounts.length; i ++){
            int currentMax = 0;
            for(int j = 0; j < accounts[i].length; j++){
                currentMax += accounts[i][j];
            }
            if(currentMax > maxWealth){
                maxWealth = currentMax;
            }
        }

        return maxWealth;
    }
}
