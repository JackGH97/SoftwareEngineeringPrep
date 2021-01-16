package com.hawkins.LeetCode.BloombergPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {


    ///3[a2[c]] = accaccacc
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                List<Character> inner = new ArrayList<>();
                while (stack.peek() != '[') {
                    inner.add(stack.pop());
                }
                stack.pop();
                int base = 1;
                int k = 0;
                // get the number k
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    k = k + (stack.pop() - '0') * base;
                    base *= 10;
                }
            }
            // push the current character to stack
            else {
                stack.push(s.charAt(i));
            }
        }
        // get the result from stack
        char[] result = new char[stack.size()];

        return new String(result);
    }
}
