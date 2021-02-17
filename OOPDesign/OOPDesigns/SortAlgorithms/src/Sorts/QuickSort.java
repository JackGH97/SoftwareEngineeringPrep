package Sorts;

public class QuickSort {

    public static void quickSort(int[] input, int start, int end,int count) {

        if (end - start < 2) {
            return;
        }



        int pivotIndex = partition(input, start, end);
        System.out.println();
        count++;
        if(count > 1){
            return;
        }
        quickSort(input, start, pivotIndex,count);
        quickSort(input, pivotIndex + 1, end,count);
    }



    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // NOTE: empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                System.out.println("in here");
                input[i] = input[j];
            }

            // NOTE: empty loop body
            while (i < j && input[++i] <= pivot);
            if (i < j) {
                System.out.println("here");
                input[j] = input[i];
            }

        }

        input[j] = pivot;
        return j;

    }

}
