package com.hawkins.Hackerrank;

import java.util.*;
import java.util.stream.Collectors;

public class SherlockValidString {

    public static void main(String[] args) {
        System.out.println(isValid("aabbc"));
    }

    public static String isValid(String s) {


        char first = s.charAt(0);
        long count = s.chars().filter(value -> value == first).count();

        System.out.println(s.chars().distinct().filter(value ->
                s.chars().filter(value2 -> value == value2).count() != count).count() > 1);


        if (s.chars().distinct().filter(value ->
                s.chars().filter(value2 -> value == value2).count() != count).count() > 1) {
            return "NO";
        }

        return "YES";
    }
}
