package com.hawkins.AlgoExpert.Medium;

public class levenshteinDistance {


    /*
    Try again tomorrow
        abc, yabc
        "" y a b d
      ""[0,1,2,3,4]
       a[1,1,1,2,3]
       b[2,2,2,1,2]
       c[3,3,3,2,2]
     */

    // O(MN) time || O(MN) space m is the length of string 2 and N is the length of string 1;
    public static int levenshteinDistance(String str1, String str2) {
        // Write your code here.
        // We add plus one for the empty string base case
        int[][] edits = new int[str2.length() + 1][str1.length() + 1];
        for (int i = 0; i < str1.length() + 1; i++) {
            for (int j = 0; i < str1.length() + 1; i++) {
                // first initalist everything with incremental values 1,2,3,4 etc..
                edits[i][j] = j;
            }
            edits[i][0] = i;
        }

        // Where comparison happens
        for (int i = 1; i < str1.length() + 1; i++) {
            for (int j = 1; i < str1.length() + 1; i++) {
                if (str2.charAt(i) == str1.charAt(j)) {
                    // essentially a diagonal cut
                    edits[i][j] = edits[i - 1][j - 1];
                } else {
                    edits[i][j] = 1 + Math.min(Math.min(edits[i - 1][j - 1], edits[i][j - 1]), edits[i - 1][j]);
                }
            }
        }

        return edits[str2.length()][str1.length()];
    }
}
