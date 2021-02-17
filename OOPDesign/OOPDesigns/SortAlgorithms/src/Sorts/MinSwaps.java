package Sorts;

public class MinSwaps {

    public static int minimumSwaps(int[] arr) {
        int count = 0;
        int i = 0;
        while (i<arr.length){
            if (arr[i]!=i+1){
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
                count ++;
            }else i++;
        }
        return count;
    }
}
