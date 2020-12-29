package com.hawkins.AlgoExpert.Easy;

public class isPalindromBest {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abcba"));
    }

    // O(n)time || o(1) space
    public static boolean isPalindrome(String str) {
        // Write your code here.
        int leftIdx = 0;
        int rightIdx = str.length() - 1;
        while(leftIdx < rightIdx){
            if(str.charAt(leftIdx) != str.charAt(rightIdx)){
                return false;
            }
            leftIdx++;
            rightIdx--;
        }
        return true;
    }
}
