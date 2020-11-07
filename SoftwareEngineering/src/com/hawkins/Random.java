package com.hawkins;

import java.util.ArrayList;
import java.util.Stack;

public class Random {


    public static void main(String[] args) {

        System.out.println(solution("?ab??a"));
        System.out.println(solution("bab??a"));
        System.out.println(solution("?a?"));
    }

    public static String solution(String S) {
        // write your code in Java SE
        ArrayList<Character> chars = new ArrayList<Character>();

        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {

            chars.add(c);
        }


        int leftIdx = 0;
        int rightIdx = S.length() - 1;
        while (leftIdx < rightIdx) {
            if (chars.get(leftIdx) != chars.get(rightIdx)) {
                if (chars.get(leftIdx) == '?') {
                    chars.set(leftIdx, chars.get(rightIdx));
                } else if (chars.get(rightIdx) == '?') {
                    chars.set(rightIdx, chars.get(leftIdx));
                } else {
                    return "NO";
                }
            }
            if (S.charAt(leftIdx) == '?') {
                chars.set(leftIdx, 'a');
                chars.set(rightIdx, 'a');
            }
            leftIdx++;
            rightIdx--;
        }
        String str = chars.stream().map(e -> e.toString()).reduce((acc, e) -> acc + e).get();
        return str;
    }
}
