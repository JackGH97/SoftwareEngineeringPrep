package com.hawkins.Questions;

public class JumpingClouds {

    // Complete the jumpingOnClouds function below.
    public static int jumpingOnClouds(int[] c) {
        int jumps =0;
        boolean atEnd = true;

        int nextTile = 1;
        int nextTile2 = 2;

        if(c.length == 0 ){
            return  0;
        }

        while(atEnd){
            if(nextTile2 < c.length){
                if(c[nextTile2]== 0){
                    System.out.println("Here");
                    jumps++;
                    nextTile +=2;
                    nextTile2 +=2;
                }
                else{
                    System.out.println("here Instead");
                    jumps++;
                    nextTile++;
                    nextTile2 ++;

                }
            }
            else if(nextTile2 == c.length){
                jumps++;
                atEnd = false;
            } else {
                atEnd = false;
            }
        }
        return jumps;
    }

}
