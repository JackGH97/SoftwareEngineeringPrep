package com.hawkins.AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.List;

public class ThreeNumberSort {


    public static void main(String[] args) {
        int[] order = new int[]{0,1,-1};
        int[] array = new int[]{1,0,0,-1,-1,0,1,1};

        System.out.println(threeNumberSort(array,order));

    }
    public static int[] threeNumberSort(int[] array, int[] order) {
        // Write your code here.
        int[] newArray = new int[array.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < order.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[j] == order[i]){
                    list.add(array[j]);
                }
            }
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        return newArray;
    }
}
