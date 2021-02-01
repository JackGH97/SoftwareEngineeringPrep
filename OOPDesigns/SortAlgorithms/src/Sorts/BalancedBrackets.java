package Sorts;

import java.util.Stack;

public class BalancedBrackets {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            Character current = s.charAt(i);
            if (current == '(' || current == '[' || current == '{')
            { stack.add(current); }
            else if (current == ')' || current == ']' || current == '}')
            {
                if (stack.size() == 0) { return "NO"; }
                Character open = stack.pop();
                if (current == ')' && open != '(') { return "NO"; }
                if (current == ']' && open != '[') { return "NO"; }
                if (current == '}' && open != '{') { return "NO"; }
            }
        }

        if (stack.size() > 0) { return "NO"; }
        return "YES";
    }
}
