package com.hawkins.LeetCode.BloombergPrep;

import java.util.ArrayList;

public class StringDepth {

    public static void main(String[] args) {
        // "hello, world!
        // "(a(b))"
        // "(a(b)c(d))
        System.out.println(solution("(a(b)c(d))"));
    }

    public static ArrayList<String> solution(String input){
        int max = 0;
        int depth = 0;
        StringBuilder sb = new StringBuilder();
        ArrayList<String> subStrings = new ArrayList<>();
        for(int i  =0; i <input.length(); i++){
            if(Character.isLetter(input.charAt(i))){
                sb.append(input.charAt(i));
            }
            if(input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{'){
                depth++;
                if(depth > max){
                    sb.setLength(0);
                    max = depth;
                    subStrings.clear();
                }
            }
            else if(input.charAt(i) == ')' || input.charAt(i) == ']' || input.charAt(i) == '}'){
                if(depth == max){
                    subStrings.add(sb.toString());
                }
                depth--;
                sb.setLength(0);
            }
        }
        if(max == 0){
            subStrings.add(input);
            return subStrings;
        }
        return subStrings;
    }
}
