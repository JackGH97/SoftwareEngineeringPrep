package com.hawkins.Hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MostBalancedPartition {

    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>(Arrays.asList(-1,0,0,1,1,2));
        ArrayList<Integer> test1 = new ArrayList<Integer>(Arrays.asList(1,2,2,1,1,1));
        System.out.println(mostBalancedPartition(test,test1));
    }
    public static int mostBalancedPartition(List<Integer> parent, List<Integer> files_size) {

        int[] main_sum = new int[parent.size()];
        int[] arr = parent.stream().mapToInt(i -> i).toArray();
        int[] arr1 = parent.stream().mapToInt(i -> i).toArray();

        for(int i =0; i < parent.size(); i++){
          int temp = i;
          while (temp != -1){
              main_sum[temp] += arr1[i];
              temp = arr[temp];
          }
        }

        int min_sum = Math.abs(main_sum[0] - 2 * main_sum[1]);

        for(int i =2; i < parent.size(); i++) {
              if(min_sum > Math.abs(main_sum[0] - 2 * main_sum[i])){
                  min_sum = Math.abs(main_sum[0] - 2 * main_sum[i]);
              }
          }
          return min_sum;
    }

}
