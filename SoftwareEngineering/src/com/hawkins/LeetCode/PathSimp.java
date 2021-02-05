package com.hawkins.LeetCode;

import java.util.Stack;

public class PathSimp {

    public static void main(String[] args) {
//        System.out.println(simplifyPath("/home/"));
//        System.out.println(simplifyPath("/home//foo/"));
        System.out.println(simplifyPath("/home//foo/"));
        //System.out.println(simplifyPath("/../"));
    }

    public static String simplifyPath(String path) {
        // Initialize a stack
        Stack<String> stack = new Stack<String>();
        String[] components = path.split("/");

        // Split the input string on "/" as the delimiter
        // and process each portion one by one
        for (String directory : components) {
            // A no-op for a "." or an empty string
            if (directory.equals(".") || directory.isEmpty()) {
                continue;
            } else if (directory.equals("..")) {

                // If the current component is a "..", then
                // we pop an entry from the stack if it's non-empty
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {

                // Finally, a legitimate directory name, so we add it
                // to our stack
                stack.add(directory);
            }
        }

        // stack is foo
        //          Home
        // iterate a stack is from the bottom up!!

        // Stich together all the directory names together
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            System.out.println(dir);
            result.append("/");
            result.append(dir);
        }

        return result.length() > 0 ? result.toString() : "/" ;
    }
}
