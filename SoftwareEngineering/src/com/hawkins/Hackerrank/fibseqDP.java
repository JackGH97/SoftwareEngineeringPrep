package com.hawkins.Hackerrank;

public class fibseqDP {


    public static void main(String[] args) {
        System.out.println(fibonacci(12));
        System.out.println(optFib(12));
    }

    public static int fibonacci(int n) {
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        int[] dP = new int[n+1];
        dP[0] = 0;
        dP[1] = 1;
        for(int i = 2; i <= n; i++){
            dP[i] = dP[i-1] + dP[i-2];
        }

        return dP[n];
    }


    // optimised

    public static int optFib(int n){
        int a = 0, b = 1, c, i;
        if( n == 0)
            return a;
        for(i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
