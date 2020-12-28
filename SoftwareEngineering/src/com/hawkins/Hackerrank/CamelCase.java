package com.hawkins.Hackerrank;

import static java.lang.Character.isUpperCase;

public class CamelCase {



    static int camelcase(String s) {
        int count = 1;
        for(char c : s.toCharArray()){
            if(isUpperCase(c)){
                count++;
            }
        }
        return count;
    }
}
