package com.company;

public class Main {

    public static void main(String[] args) {
        int [] test = gcdByEuclidsAlgorithm(7652,128,0);
        int [] test1 = gcdByBruteForce(7652,128,0);

        System.out.println("Brut Force: " +"GCD Value: "+test1[0]+ " , number of invocations: " + test1[1]);
        System.out.println("Euclid: " +"GCD Value: "+test[0]+ " , number of invocations: " + test[1]);

    }

    public static int[] gcdByBruteForce(int n1, int n2,int count) {
        int gcd = 1;
        for (int i = 1; i <= n1 && i <= n2; i++) {
            count ++;
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        int[] test = new int[]{gcd,count};
        return test;
    }

    public static int[] gcdByEuclidsAlgorithm(int n1, int n2,int count) {
        if (n2 == 0) {
            int[] test = new int[]{n1,count};
            return test;
        }
        count++;
        return gcdByEuclidsAlgorithm(n2, n1 % n2,count);
    }




}
