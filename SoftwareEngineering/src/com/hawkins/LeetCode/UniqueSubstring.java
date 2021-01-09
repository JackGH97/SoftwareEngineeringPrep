package com.hawkins.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubstring {


    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            max = Math.max(max, uniqueHelper((s.substring(i, s.length()))));
        }
        return max;
    }

    public int uniqueHelper(String parsed) {
        HashSet<Character> unique = new HashSet<>();

        for (int i = 0; i < parsed.length(); i++) {
            if (unique.contains(parsed.charAt(i))) {
                break;
            }
            unique.add(parsed.charAt(i));
        }

        return unique.size();
    }

    public int lengthOfLongestSubstringEfficient(String s) {

        Set<Character> set = new HashSet<>();
        int num = s.length();
        int ans = 0;
        int i = 0;
        int j = 0;

        while (i < num && j < num) {

            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j - i);
            }
            else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }


}
