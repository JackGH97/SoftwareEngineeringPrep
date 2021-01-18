package com.hawkins.AlgoExpert.Medium;

import org.w3c.dom.Node;

import java.util.*;

public class Powerset {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3));
        Queue<Node> queue = new LinkedList<>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println(powerset(list));
        System.out.println(powerset(list1));
    }

    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        subsets.add(new ArrayList<Integer>());
        for(Integer ele : array){
            int length = subsets.size();
            for (int i =  0; i< length; i++){
                List<Integer> currentSubset = new ArrayList<Integer>(subsets.get(i));
                currentSubset.add(ele);
                System.out.println(currentSubset);
                subsets.add(currentSubset);
                }
            }
        return subsets;
    }

}
