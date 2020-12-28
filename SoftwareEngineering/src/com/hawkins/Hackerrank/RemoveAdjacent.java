package com.hawkins.Hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveAdjacent {

    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));
    }

    public static String superReducedString(String s) {
        List<String> stack = new ArrayList<>();

        for(char c : s.toCharArray()){
            if(stack.contains(c)){
                stack.remove(Character.toString(c));
            }else{
                stack.add(Character.toString(c));
            }
        }
        String test = String.join(",",stack);
        String value = test. replaceAll(",", "");
        if(value.equals("")){

        }

        return value;
    }
}
