package com.hawkins.Questions;

public class MinimumDistance {

    public static int minimumDistances(int[] a) {
        int min = Integer.MAX_VALUE;

        for(int i =0 ; i < a.length; i++){
            for(int j = 0; j<a.length; j++){
                if(a[i] == a[j]){
                    int distance = Math.abs(j-i);
                    if(distance < min && distance >0 ){
                        min = distance;
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
