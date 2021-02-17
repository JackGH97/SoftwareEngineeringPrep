package com.company;

public class EqualSumChecker {

    public static void main(String[] args) {
        hasEqualSum(1,1,2);
    }


    public static boolean hasEqualSum(int first, int second, int equal){
        int total = first+second;
        return total == equal;
    }

}
