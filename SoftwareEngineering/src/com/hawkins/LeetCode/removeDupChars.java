package com.hawkins.LeetCode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class removeDupChars {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("nnwssswwnvbnnnbbqhhbbbhmmmlllm",3));
    }


    public static String removeDuplicates(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        int length = -1;
        while (length != sb.length()) {
            length = sb.length();
            for (int i = 0, count = 1; i < sb.length(); ++i) {
                if (i == 0 || sb.charAt(i) != sb.charAt(i - 1)) {
                    count = 1;
                } else if (++count == k) {
                    sb.delete(i - k + 1, i + 1);
                    break;
                }
            }
        }
        return sb.toString();
    }
}
