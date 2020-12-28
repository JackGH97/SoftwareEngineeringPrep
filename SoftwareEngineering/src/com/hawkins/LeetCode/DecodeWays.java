package com.hawkins.LeetCode;

public class DecodeWays {

    public static void main(String[] args) {
        System.out.println(numDecodings("226"));
    }
    public static int numDecodings(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        int[] dP = new int[s.length()+1];
        dP[0] = 1;
        dP[1] = s.charAt(0) != '0' ? 1 : 0;

        for(int i = 2; i<dP.length; i++){
            int digit = Integer.parseInt(String.valueOf(s.charAt(i-1)));

            if(digit != 0){
                dP[i] += dP[i-1];
            }
            int twoDigit = Integer.parseInt(s.substring(i-2,i));
            if(twoDigit >= 0 && twoDigit <= 26){
                dP[i] += dP[i-2];
            }
        }
        return dP[s.length()];
    }
}
