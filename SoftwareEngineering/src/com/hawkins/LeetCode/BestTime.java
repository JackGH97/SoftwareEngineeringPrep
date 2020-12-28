package com.hawkins.LeetCode;

public class BestTime {

    public static void main(String[] args) {
        int[] value = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(value));
    }

    // O(n) time || O(1) Space
    public static int maxProfit(int[] prices) {
        if(prices==null || prices.length==0) return 0;
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;

        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice,prices[i]);
            maxPrice = Math.max(maxPrice,prices[i]-minPrice);
        }

        return maxPrice;
    }
}
