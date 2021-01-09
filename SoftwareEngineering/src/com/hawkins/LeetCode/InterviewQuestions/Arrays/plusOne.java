package com.hawkins.LeetCode.InterviewQuestions.Arrays;

import java.util.Arrays;

public class plusOne {

    public static void main(String[] args) {
        plusOne(new int[]{9,8,7,6,5,4,3,2,1,0});


    }
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]!=9){
                digits[i]++;
                break;
            }
            if(i==0){
                digits = new int[digits.length+1];
                digits[0]=1;
                return digits;
            }
            digits[i]=(digits[i]+1)%10;
        }
        return digits;
    }
}
