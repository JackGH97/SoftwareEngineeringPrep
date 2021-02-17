package com.hawkins;

import java.util.Stack;


public class BalancedBrackets {
    public static void test()
    { System.out.println(balancedBrackets("{{}()}({}){}"));}

    public static boolean balancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); ++i)
        {
            Character current = str.charAt(i);
            if (current == '(' || current == '[' || current == '{')
            {
                stack.add(current);
            }
            else if (current == ')' || current == ']' || current == '}')
            {
                if (stack.size() == 0) {
                    return false;
                }
                Character open = stack.pop();
                if (current == ')' && open != '(') {
                    return false;
                }
                if (current == ']' && open != '[') {
                    return false;
                }
                if (current == '}' && open != '{') {
                    return false; }
            }
        }

        if (stack.size() > 0) {
            return false;
        }
        return true;
    }
}