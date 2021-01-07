package com.hawkins.LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class PaindromPerm {


    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("codecode"));
    }

    public static boolean canPermutePalindrome(String s) {
        HashSet<Character> unique = new HashSet();
        for(char c : s.toCharArray()){
            if(unique.contains(c)){
                unique.remove(c);
            }
            else{
                unique.add(c);
            }
        }
        if(s.length() % 2 == 0){
            if(unique.isEmpty()){
                return true;
            }
        }
        if(unique.size() == 1){
                return true;
        }
        return false;
    }

}
