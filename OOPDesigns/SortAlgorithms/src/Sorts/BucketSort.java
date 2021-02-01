package Sorts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {


    // [54,46,83,66,95,92,43]
    public static void bucketSort(int[] input){
        List<Integer>[] buckets = new List[10];
        for(int i =0; i < buckets.length; i++){
            buckets[i] = new ArrayList<Integer>();
        }
        /* input[0] == 54 , hash(54) = 5 , bucket(5).add(54) */
        for(int i = 0; i <input.length; i++){
            buckets[hash(input[i])].add(input[i]);
        }
        /* sort every arraylist */
        for(List bucket : buckets){
            Collections.sort(bucket);
        }
        /*Traverse buckets array, inner loop traverse each array list at each bucket*/
        int j = 0;
        for(int i = 0; i < buckets.length; i++){
            for(int value : buckets[i]){
                input[j++] = value;
            }
        }
    }
    private static int hash(int value){
        return  value / (int) 10;
    }
}
