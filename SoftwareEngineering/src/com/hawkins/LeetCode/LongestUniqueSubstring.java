package com.hawkins.LeetCode;

import java.util.HashSet;

public class LongestUniqueSubstring {


    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = s.length();
        HashSet<Character> unique = new HashSet<Character>();
        int counter = 0;
        int max = 0;

//        for(int i = 0; i < s.length(); i++){
//            if(!unique.contains(s.charAt(i))){
//                counter++;
//                unique.add(s.charAt(i));
//                System.out.println(s.charAt(i));
//                if(counter > max){
//                    max = counter;
//                }
//            }
//            else{
//                System.out.println("here");
//                i = i-1;
//                unique.clear();
//                counter = 0;
//            }
//        }

         while(left < right){
             if(!unique.contains(s.charAt(left))){
                 counter++;
                 unique.add(s.charAt(left));
                 System.out.println(s.charAt(left));
                 if(counter > max){
                     max = counter;
                 }
                 left++;
             }
             else{
                 if(left != 0){
                     if(s.charAt(left) != s.charAt(left-1)){
                         left = left -1;
                     }
                 }
                 unique.clear();
                 counter = 0;
             }
         }


        return max;
    }
}
