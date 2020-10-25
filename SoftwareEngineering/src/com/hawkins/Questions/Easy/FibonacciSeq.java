package com.hawkins.Questions.Easy;

public class FibonacciSeq {

    public static void printSequence(){
        int count = 20;
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        int n3;

        for(int i = 2; i <= 9497; i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static Long fibonacci(Long n1, Long n2,int count){
        String test = "12";
        Long n3 = n1 + n2;
        count++;
        System.out.println(n3);
        n1 = n2;
        n2 = n3;
        return(fibonacci(n1,n2,count));
    }

    public static int fibonacciT(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacciT(n - 1) + fibonacciT(n - 2);
    }

}
