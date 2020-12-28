package com.hawkins.LeetCode;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        set.add(n);
        while(n != 1){
            int sum = 0;
            while( n > 0){
                int digit = n % 10;
                System.out.println(digit);
                n /= 10;
                sum += (digit * digit);
            }
            n = sum;

            if(set.contains(sum)){
                return false;
            }
            set.add(n);
        }
        return true;
    }
}
