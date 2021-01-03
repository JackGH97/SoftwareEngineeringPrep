package com.hawkins.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class BeautifulArrangement {

    public static void main(String[] args) {
        System.out.println(countArrangement(1));
    }

    private static int count = 0;

    public static int countArrangement(int N) {
        arrangement(1, N, new HashSet< Integer >());
        return count;
    }

    private static boolean arrangement(int pos, int n, Set< Integer > set) {
        if (set.size() == n) {
            count++;
            return true;
        }
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) {
                continue;
            }
            if (i % pos == 0 || pos % i == 0) {
                set.add(i);
                arrangement(pos + 1, n, set);
                set.remove(i);
            }
        }
        return false;
    }
}
