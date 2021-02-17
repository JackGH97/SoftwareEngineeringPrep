package Sorts;

public class Hourglass {

    public static int hourglassSum(int[][] arr) {
        int max = Integer.MIN_VALUE;
        int sum;

        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 3; j++){
                sum = arr[i + 1][j + 1];
                for(int k = j; k < j + 3; k++){
                    sum += arr[i][k] + arr[i + 2][k];
                }
                if(sum > max)
                    max = sum;
            }
        }

        return max;
    }
}
