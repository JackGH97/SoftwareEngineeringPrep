package com.hawkins.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class PlaneArray {

    public static void main(String[] args) {
        solution(1,"");
    }

    public static int solution(int N, String S) {
        if(S.length() == 0 ){
            return N * 2;
        }
        // write your code in Java SE 8
        int[][] plane = new int[N][12];
        // 12 for two side columns
        for (int[] row: plane)
            Arrays.fill(row, 0);

        for(int i = 0; i< S.length(); i+=3){
            String seat = S.substring(i,i+2);
            int row = Integer.parseInt(seat.substring(0,1)) -1;
            int col = seat.charAt(1)- 'A';
            plane[row][col] = 1;
        }

        int count = 0;
        for(int i = 0; i < plane.length; i++){
            int currentCount = 0;
            for(int j = 0; j < plane[i].length; j++){
                if(j == 3 || j == 8){
                    if(currentCount != 2){
                        currentCount = 0;
                    }
                    else{
                        currentCount++;
                    }
                }
                else if(plane[i][j] == 0){
                    currentCount++;
                }
                else if(plane[i][j] == 1){
                    currentCount = 0;
                }
                if(currentCount == 4){
                    count++;
                    currentCount = 0;
                }
            }
        }
        return count;
    }

}
