package com.hawkins;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(countingValleys(4, "UDDDUDUU"));

    }

    public static int countingValleys(int steps, String path) {

        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for(int i = 0; i < path.toCharArray().length; i++) {
            if (path.charAt(i) == 'U') ++lvl;
            if (path.charAt(i) == 'D') --lvl;

            // if we just came UP to sea level
            if (lvl == 0 && path.charAt(i) == 'U') {
                ++v;
            }
        }
        return v;
    }


}
