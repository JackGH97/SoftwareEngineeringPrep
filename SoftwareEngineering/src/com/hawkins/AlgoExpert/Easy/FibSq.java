package com.hawkins.AlgoExpert.Easy;

public class FibSq {

    // O(n^2) time | O(n) space
    public static int getNthFib(int n) {
        // Write your code here.
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        return (getNthFib(n-1) + getNthFib(n-2));
    }

    // 0(n) time | O(1) space
    public static int getNthFibBetter(int n) {
        int[] lastTwo = {0,1};
        int counter =3;
        while(counter <= n){
            int nextFib = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = nextFib;
            counter++;
        }
        return  n > 1 ? lastTwo[1] : lastTwo[0];
    }
}
