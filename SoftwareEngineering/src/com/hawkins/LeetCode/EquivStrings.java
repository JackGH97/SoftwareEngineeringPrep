package com.hawkins.LeetCode;

import java.util.stream.Stream;

public class EquivStrings {

    public static void main(String[] args) {

        String[] test1 = new String[]{"abc", "d", "defg"};
        String[] test2 = new String[]{"abcddefg"};

        System.out.println(arrayStringsAreEqual(test1, test2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String firstW = String.join("", word1);
        String secondW = String.join("", word2);
        if (firstW.equals(secondW)) {
            return true;
        }
        return false;
    }
}
