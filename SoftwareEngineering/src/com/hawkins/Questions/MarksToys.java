package com.hawkins.Questions;

import java.util.Arrays;

public class MarksToys {

    static int maximumToys(int[] prices, int k) {

        int count=0,sum=0;
        Arrays.sort(prices);
        for(int i=0;i<prices.length;i++)
        {
            if(sum <= k)
            {
                sum=sum+prices[i];
                count++;
            }


        }
        return  count-1;
    }


}
