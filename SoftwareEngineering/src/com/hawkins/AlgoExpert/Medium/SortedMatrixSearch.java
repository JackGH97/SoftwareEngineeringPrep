package com.hawkins.AlgoExpert.Medium;

public class SortedMatrixSearch {

    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        // Write your code here.
        int row = 0;
        int col = matrix[0].length -1;
        while(row < matrix.length && col >= 0){
            if(matrix[row][col] < target){
                row++;
            }
            else if (matrix[row][col] > target){
                col--;
            }
            else{
                return new int[]{row,col};
            }
        }

        return new int[]{-1,-1};
    }
}
