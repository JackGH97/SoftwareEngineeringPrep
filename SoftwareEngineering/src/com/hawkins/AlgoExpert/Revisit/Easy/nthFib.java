package com.hawkins.AlgoExpert.Revisit.Easy;

public class nthFib {

    public static void main(String[] args) {
        System.out.println(getNthFib(6));
    }

    public static int getNthFib(int n) {
        // Write your code here.
        int a = 0, b = 1, c, i;
        if( n == 1)
            return a;
        for(i = 2; i < n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
