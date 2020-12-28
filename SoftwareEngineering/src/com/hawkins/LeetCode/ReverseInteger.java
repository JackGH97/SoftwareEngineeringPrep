package com.hawkins.LeetCode;

import java.util.List;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    /*
       Not a nice solution but it does the job.
       O(n) Time || O(1) space
     */
    public static int reverse(int x){
        if(x == 0 || x == Integer.MIN_VALUE){
            return 0;
        }

        long res = 0;

        while(x != 0){
            int digit = x % 10;
            x /= 10;
            res = res*10 + digit;

            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE){
                return 0;
            }
        }

        return (int) res;
    }


}
