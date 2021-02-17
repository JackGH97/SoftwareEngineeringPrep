package Sorts;

public class MergeSort {

    // 20, 35, -15, 7 , 55 , 1, -22
    // left ( 20 - > -15) right (7 -> -22)
    public static void mergeSort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(input,start,mid);
        mergeSort(input,mid,end);
        merge(input,start,mid,end);
    }

    public static void merge(int[] input, int start, int mid, int end){
        // if we compare the last element of the left against the first of the right and they are the same of left is less we know its already sorted
        // imagine 7 and 55 : we compare them and they are already sorted. Skips needless work. No need for temp array.
        if(input[mid-1] <= input[mid]){
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end- start];

        // as soon as we finish traversing the left or right array we want to drop out
        while(i<mid && j < end){
            // compare the current element in left to current element in right and write the smaller of the two to the temp array
            // if i is <= to j we assign i else assign j then increment tempindex and i otherwise increment j
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        // Other array will have some elements not dealt with. need to handle them
        // don't have to worry about left over elements on the right array as their position will not change
        // (32,36) , (33,34)
        // (32,33,34) would stop before 36 needs to jump over
        /*
            first parameter = source array
            start copy at position i: where we haven't handled from
            destination array also is input
            destination index = start + temp = 3 in example
            length = 2-1 = 1 = the number of elements we didnt copy over to the temp array from the left side
            Won't do anything if if 0 or j is in question.
         */
        System.arraycopy(input,i,input,start+tempIndex,mid-i);
        // only copy the number of elements we copied. left side.
        System.arraycopy(temp,0,input,start,tempIndex);

    }

}
