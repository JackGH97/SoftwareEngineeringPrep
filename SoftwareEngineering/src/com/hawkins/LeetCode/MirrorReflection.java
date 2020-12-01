package com.hawkins.LeetCode;

public class MirrorReflection {

    public static void main(String[] args) {
        System.out.println(mirrorReflection(3,1));
    }

    public static int mirrorReflection(int p, int q) {
        double result = (double) p / 2;
        if( p == q){
            return 0;
        }
        else if(q == result){
            return 2;
        }
        else if(q > result){
            return 0;
        }
        else{
            return 1;
        }
    }
}
