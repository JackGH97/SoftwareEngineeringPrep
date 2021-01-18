package com.hawkins.AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(getPermutations(list));
    }

    // 1,2,3
    public static List<List<Integer>> getPermutations(List<Integer> array) {
        // Write your code here
        List<List<Integer>> permutations = new ArrayList<>();
        getPermutations(array,new ArrayList<Integer>(),permutations);
        return permutations;
    }

    public static void getPermutations( List<Integer> array,List<Integer> currentPerm, List<List<Integer>> permutations){
        // if arraysize is 0 we know that current perm is = to arraysize
        if(array.size() == 0 && currentPerm.size() >0){
            permutations.add(currentPerm);
        }
        else{
            for(int i = 0; i < array.size(); i++){
                ArrayList<Integer> newArray = new ArrayList<>(array);
                newArray.remove(i);
                ArrayList<Integer> newPermutation = new ArrayList<>(currentPerm);
                newPermutation.add(array.get(i));
                getPermutations(newArray,newPermutation,permutations);
            }

        }
    }
}
