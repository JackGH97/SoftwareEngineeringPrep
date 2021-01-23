package com.hawkins.LeetCode;

public class SubstringReturn {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    public static String longestPalindrome(String s) {
            if(s == null || s.length() < 1){
                return "";
            }

            int start = 0;
            int end = 0;

            for(int i = 0; i < s.length(); i++){
                int len1 = expandFromMiddle(s,i,i);
                int len2 = expandFromMiddle(s,i,i+1);
                int max = Math.max(len1,len2);
                if(max > (end-start)){
                        start = i - ((max-1)/2);
                        end = i + ((max)/2);
                }
            }

            return s.substring(start,end+1);
        }

    public static int expandFromMiddle(String s, int left, int right){
        if(s == null || left > right){
            return 0;
        }
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left --;
            right++;
        }

        return right - left - 1;
    }

}
