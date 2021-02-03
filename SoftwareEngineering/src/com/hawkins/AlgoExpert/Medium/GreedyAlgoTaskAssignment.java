package com.hawkins.AlgoExpert.Medium;

import com.hawkins.Algorithms.BTS.Tree;

import java.util.*;

public class GreedyAlgoTaskAssignment {

    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        list.add(5);
//        list.add(3);
//        list.add(1);
//        list.add(4);
//        taskAssignment(3, list);
//
        int[] array = new int[]{1,2,3,4,5};
        reverse(array);
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }

    public static ArrayList<ArrayList<Integer>> taskAssignment(int k, ArrayList<Integer> tasks) {
        // Write your code here.
        TreeMap<Integer,Integer> indexMap = new TreeMap<>();

        for(int i = 0; i < tasks.size(); i++){
            indexMap.put(i,tasks.get(i));
        }
        Collections.sort(tasks);

        for(int i = 0; i < tasks.size()/2; i++){
            System.out.println(tasks.get(i) + " index value: "  + " , "  + tasks.get(tasks.size()-i-1) + " index value:" );

        }
        System.out.println(tasks);
        System.out.println(indexMap);

        return new ArrayList<ArrayList<Integer>>();


    }

    private static void reverse(int[] array){
        for(int i = 0 ; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length -1 - i] = temp;
        }
    }
}
