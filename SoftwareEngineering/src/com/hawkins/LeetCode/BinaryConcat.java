package com.hawkins.LeetCode;

public class BinaryConcat {

    public static void main(String[] args) {
        System.out.println(concatenatedBinary(42));
    }

    // loop through convert each number and concat on SB.
    // then convert to value in binary.
    // use modulo 10^9 + 7.
    public static int concatenatedBinary(int n) {
        final int MOD = 1000000007;
        int result = 0;
        for (int i = 1; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            for (int j = 0; j < binary.length(); j++) {
                result = (result * 2 + (binary.charAt(j) - '0')) % MOD;
            }
        }
        return result;
    }


}
