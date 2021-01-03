package com.hawkins.Hackerrank;

import java.util.HashMap;
import java.util.Map;

public class recursiveStairs {

    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(stepPerms(7));
    }

    static int stepPerms(int n) {
        if(n < 0)
            return 0;

        if(n == 0)
            return 1;

        if(!map.containsKey(n)) {
            int count = stepPerms(n-1) + stepPerms(n-2) + stepPerms(n-3);
            map.put(n, count);
        }

        System.out.println(map);
        return map.get(n);
    }
}
