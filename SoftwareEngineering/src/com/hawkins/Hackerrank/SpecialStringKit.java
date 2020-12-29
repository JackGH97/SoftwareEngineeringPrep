package com.hawkins.Hackerrank;

import com.hawkins.LeetCode.PalindromePartitioning;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SpecialStringKit {

    public static void main(String[] args) {
        SpecialStringKit test = new SpecialStringKit();
        System.out.println(test.substrCount(7,"aa"));
    }

    static long substrCount(int n, String a) {
        char[] s = a.toCharArray();
        long retVal = s.length;
        System.out.println(retVal);

        for (int i = 0; i < s.length; i++)
        {
            Character startChar = s[i];
            int diffCharIdx = -1;
            for (int j = i + 1; j < s.length; j++)
            {
                Character currChar = s[j];
                if (startChar == currChar)
                {
                    if ((diffCharIdx == -1) ||
                            (j - diffCharIdx) == (diffCharIdx - i)){
                        retVal++;
                        System.out.println("here");
                    }

                }
                else
                {
                    if (diffCharIdx == -1)
                        diffCharIdx = j;
                    else
                        break;
                }
            }
        }
        return retVal;
    }

}
